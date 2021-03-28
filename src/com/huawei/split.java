package com.huawei;
import java.util.*;

/**
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class split {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            split(str);
        }
    }
    public static void split(String s){
        while (s.length() >= 8){
            String reslut = s.substring(0,8);
            System.out.println(reslut);
            s = s.substring(8);
        }
        if (s.length() < 8 && s.length() > 0){
            s +="00000000";
            String reslut = s.substring(0,8);
            System.out.println(reslut);
        }
    }
}
