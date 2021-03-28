package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。
 * 字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。
 * 不在范围内的不作统计。多个相同的字符只计算一次
 */
public class charNum {
    public static void main(String[] agrs){
        List<Character> charList = new ArrayList<>();
        System.out.println(charNum(charList));
    }

    public static int charNum(List<Character> charList){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;//统计不重复的字符的个数
        //遍历输入的字符串的每一个字符，如果首次出现，将其添加到ArrayList，
        //同时count+1，否则，进行下一个字符的检查
        for (int i = 0;i < str.length();i++){
            if(charList.contains(str.charAt(i))){
                continue;
            }else {
                charList.add(str.charAt(i));
                count++;
            }
        }
        return count;
    }
}
