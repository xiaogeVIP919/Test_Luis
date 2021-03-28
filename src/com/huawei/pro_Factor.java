package com.huawei;
import java.util.*;

/**
 * 输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 */
public class pro_Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long input = sc.nextLong();
            System.out.println(getResult(input));
        }
    }

    public static String getResult(Long num){
        StringBuilder sb = new StringBuilder();
        int div = 2;
        while (!(num == 1)){
            while (num % div == 0){
                num = num / div;
                sb.append(div).append(" ");
            }
            div++;
        }
        return sb.toString();
    }
}
