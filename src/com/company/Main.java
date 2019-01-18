package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1000;
//        int total = 0;
//        int [] num = new int [count];
//        for (int i = 1; i <count; i++) {
//                if (i % 3 == 0 || i % 5 == 0) {
//                    num[i]= i +1;
//                    total += i+1;
//                    }
//                    System.out.println(total);
//
//                }

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }    }

