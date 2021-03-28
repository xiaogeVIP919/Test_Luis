package com.huawei;

import java.util.Scanner;

public class ReturnTheNumberOf1InBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            while (n != 0){
                count++;
                n = n & n - 1;
            }
            System.out.println(count);
        }
    }
}
