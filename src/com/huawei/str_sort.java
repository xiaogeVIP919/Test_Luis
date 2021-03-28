package com.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class str_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] str = new String[count];

        for (int i = 0;i < count;i++){
            str[i] = sc.nextLine();
        }
        Arrays.sort(str);
        for (String ss:str){
            System.out.println(ss);
        }
    }
}
