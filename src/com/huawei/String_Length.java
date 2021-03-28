package com.huawei;
import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开
 */
public class String_Length {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            System.out.println(lengthOfLast(str));
        }
    }

    public static int lengthOfLast(String s){
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
