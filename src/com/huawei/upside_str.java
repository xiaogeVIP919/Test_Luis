package com.huawei;

import java.util.Scanner;

/**
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 */
public class upside_str {
    public static void main(String[] args){
        Scanner sc ;
        String str;
        do{
            System.out.println("请输入字符（长度小于100）");
            sc = new Scanner(System.in);
            str  = sc.nextLine();

        }while (str.length() > 100);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length();i > 0 ;i--){
            stringBuilder.append(str.charAt(i-1));
        }
        System.out.println("颠倒过来:" + stringBuilder.toString());
    }

}
