package com.andietech;

/**
 * Declared a public class
 *
 * public: visibility modifier
 * class: Java keyword
 */
public class Main {
    public final static int exchangeRate = 116;

    public int userExchangeRate;

    /**
     * Multiline comment
     *
     * String: Java data type
     * args: function parameter. Data that we are passing to a function. Every parameter needs a type
     * public: visibility modified. e.g. private, public and protected
     * main(): entrypoint to a java program.
     *
     * @param args
     */
    public static void main(String[] args) {
        // type: String
        // variablename: hello
        // equate the variable to something: "Hello, World"
        String habari = "Guten Morgen";

        // Reference a variable using its name
        System.out.println(habari);
    }

    public int convertDollarToKes() {
        int commissionAsPercentage = 2;

        int amountInShillings = 100 * exchangeRate;

        float commission = (2 * amountInShillings) / 100;

        return  0;
    }
}