package com.codurance;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = ",|\n"; // default delimiters
        String numberSection = numbers;

        // Handle custom delimiter
        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            String delimiterSection = numbers.substring(2, newlineIndex);
            numberSection = numbers.substring(newlineIndex + 1);

            if (delimiterSection.startsWith("[") && delimiterSection.contains("]")) {
                List<String> delimiters = new ArrayList<>();
                Matcher m = Pattern.compile("\\[(.*?)]").matcher(delimiterSection);
                while (m.find()) {
                    delimiters.add(Pattern.quote(m.group(1)));  // Quote to avoid regex issues
                }
                delimiter = String.join("|", delimiters);
            } else {
                delimiter = Pattern.quote(delimiterSection); // single-char delimiter
            }
        }

        String[] parts = numberSection.split(delimiter);
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String part : parts) {
            if (part.isEmpty()) continue;
            int num = Integer.parseInt(part);
            if (num < 0) {
                negativeNumbers.add(num);
            } else if (num <= 1000) {
                sum += num;
            }
        }

        if (!negativeNumbers.isEmpty()) {
            String message = negativeNumbers.toString().replaceAll("[\\[\\] ]", "");
            throw new IllegalArgumentException("negative numbers not allowed: " + message);
        }

        return sum;
    }
}
