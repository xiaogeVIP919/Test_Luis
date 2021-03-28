package com.huawei;

import java.util.Scanner;

/**
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，
 * 小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class get_total_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int month = sc.nextInt();
            System.out.println(getcount(month));
        }
    }
    public static int getcount(int month){
        assert(month >= 1);
        int first = 1;
        int sencod = 1;
        int month_count = 1;
        while (month > 2){
            month_count = first + sencod;
            first = sencod;
            sencod = month_count;
            month--;
        }
        return month_count;
    }
}
