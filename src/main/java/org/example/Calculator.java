package org.example;

public class Calculator {

    public int factorial(int num) {

        int answer = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Invalid number");
        }

        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (setSize < subsetSize || setSize > 1) {
            throw new IllegalArgumentException("Invalid set size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
