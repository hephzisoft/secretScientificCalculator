package com.secretproject;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Principal:  ");
        double principal = myInput.nextDouble();
        System.out.println("Rate:  ");
        float rate =  myInput.nextFloat();
        System.out.println("Period: ");
        int time = myInput.nextInt();
        double
        double simpleInterest = principal * rate * time;
        Locale locale = null;

        NumberFormat interest = NumberFormat.getCurrencyInstance();
        String currency = interest.format(simpleInterest);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       v
        System.out.println(currency);




    }
}
