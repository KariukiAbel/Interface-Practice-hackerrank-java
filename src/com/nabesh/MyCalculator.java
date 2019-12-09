package com.nabesh;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                j = j + i;
            }
        }
        return j;
    }

    public MyCalculator(){

    }

    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        Scanner  sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(calc.divisor_sum(number));
    }

}
