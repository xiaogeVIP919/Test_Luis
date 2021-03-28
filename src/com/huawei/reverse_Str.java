package com.huawei;

import java.util.Scanner;

/**
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。
 * （字符串长度不超过1000）
 */
public class reverse_Str {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() > 1000){
            System.out.println("输入长度超标!");
        }else {
            StringBuffer stringBuffer = new StringBuffer(str);
            System.out.println(stringBuffer.reverse().toString());
        }
    }
}
