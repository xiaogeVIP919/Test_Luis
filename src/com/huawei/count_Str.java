package com.huawei;
import java.util.Locale;
import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，
 * 和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写
 */
public class count_Str {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String sh = in.nextLine();

        int count = countNum(str,sh);
        System.out.println(count);
    }

    public static int countNum(String str,String sh){
        String s = str.toUpperCase();
        String h = sh.toUpperCase();
        int length = s.length();
        int count = 0;
        if(s != null && s.length() > 0){
            for(int i = 0; i < length;i++){
                char charAt = s.charAt(i);
                if(h.charAt(0) == charAt){
                    count++;
                }
            }
        }else {
            count = 0;
        }

        return count;
    }
}
