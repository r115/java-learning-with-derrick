package com.andietech;

import com.andietech.exchange.Exchanger;

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

        Exchanger exchanger = new Exchanger();
        exchanger.convert("usd","kes", exchangeRate, 100);
        exchanger.convert("kes","tzs", 22, 100);

        // Reference a variable using its name
        System.out.println(habari);
    }


}