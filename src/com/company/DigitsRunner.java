package com.company;

public class DigitsRunner
    {

    public static void main(String[] args)
    {
        DigitsRunner digitsRunner1 = new DigitsRunner( num: 7);
        System.out.println(digitsRunner1.isStrictlyIncreasing());

        DigitsRunner digitsRunner2 = new DigitsRunner( num: 65310);
        System.out.println(digitsRunner2.isStrictlyIncreasing());

        System.out.println(new DigitsRunner( num: 1356).isStringIncreasing());
        System.out.println(new DigitsRunner( num: 1336).isStringIncreasing());
        System.out.println(new DigitsRunner( num: 1536).isStringIncreasing());

        System.out.println(digitsRunner2.getDigitList());
    }
}
