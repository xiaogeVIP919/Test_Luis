package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class notRecurNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (input > 0){
            if(list.indexOf(input%10) < 0){//如果余数存在，则不存入
                list.add(input%10);
            }
            input  = (input - input %10)/10;
        }
        for (int i = 0;i <list.size();i++){
            System.out.print(list.get(i));
        }
//        sc.close();
    }


}
