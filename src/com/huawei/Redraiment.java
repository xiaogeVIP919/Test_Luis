package com.huawei;

import java.util.Scanner;

public class Redraiment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(getMaxSteps(a));
        }
    }
    public static int lissimple(int[] arr){
        int n = arr.length;
        int[] f = new int[n];
        for (int i = 0;i < n;i++){
            f[i] = 1;
            for (int j = 0;j < i;j++){
                if(arr[j] < arr[i] && f[j] > f[i] - 1){
                    f[i] = f[j] + 1;
                }
            }
        }
        return f[n -1];
    }
    public static int getMaxSteps(int[] a){
        int n = a.length;

        return n;
    }
}
