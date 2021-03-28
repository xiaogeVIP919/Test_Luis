package com.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 * 每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
 * 给出多个名字，计算每个名字最大可能的“漂亮度”。
 */
public class BeautyRank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            for (int i = 0;i < n;i++){
                str[i] = sc.next();
            }
            beautyRank(n,str);
        }
    }
    public static void beautyRank(int n,String[] str){
        for (int i = 0;i < n;i++){
            System.out.println(beautyDegree(str[i]));
        }
    }

    public static int beautyDegree(String num){
        int degree = 0;
        int a[] = new int[26];
        num = num.toLowerCase();
        for (int i = 0; i < num.length();i++){
            char ch = num.charAt(i);
            a[ch - 'a']++;
        }
        Arrays.sort(a);
        for (int i = 0;i < 26;i++){
            degree += a[i]* (i+1);
        }
        return degree;
    }
}
