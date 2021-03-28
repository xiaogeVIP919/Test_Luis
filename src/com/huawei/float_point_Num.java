package com.huawei;
import java.util.*;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 */
public class float_point_Num {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double num = sc.nextDouble();
            int i = (int) num;
            System.out.println((num - i) >= 0.5 ?(i+1):i);
        }
    }


}
