package com.huawei;

import java.util.Scanner;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数
 */
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
