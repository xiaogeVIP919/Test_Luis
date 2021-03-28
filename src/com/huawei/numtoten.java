package com.huawei;
import java.util.*;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示
 */
public class numtoten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            int i = Integer.parseInt(s.substring(2),16);
            System.out.println(i);
        }

    }
}
