package com.tngp.bignumber;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scannerFirst = new Scanner(System.in);
        System.out.println("Enter first number");

        String firstNumber = scannerFirst.nextLine();
        String[] firstNumArray = new String[firstNumber.length()];

        Scanner scannerSecond = new Scanner(System.in);
        System.out.println("Enter second number");

        int index = 0;
        for (int i = firstNumber.length()-1; i >= 0; i--) {
            firstNumArray[index] = String.valueOf(firstNumber.charAt(i));
            index++;
        }

        index = 0;

        String secondNumber = scannerSecond.nextLine();
        String[] secondNumArray = new String[secondNumber.length()];

        for (int i = secondNumber.length()-1; i >= 0; i--) {
            secondNumArray[index] = String.valueOf(secondNumber.charAt(i));
            index++;
        }

        int[] resultArray = new int[firstNumber.length()];

        int num = 0;
        int digit = 0;
        for (int i = 0; i < firstNumber.length(); i++) {
//            if (secondNumArray[i] == null) {
//                resultArray[i] = Integer.parseInt(firstNumArray[i]);
//            }
            int sum = Integer.parseInt(firstNumArray[i]) + Integer.parseInt(secondNumArray[i]);
//            digit = sum%10;
//            num = (sum - sum%10)/10;
//            System.out.println(digit + " -- " + num);
//            resultArray[i] = num + digit;
            resultArray[i] = sum;
        }

        for (int i = resultArray.length-1; i >= 0; i--) {
            System.out.print(resultArray[i]);
        }

    }
}
