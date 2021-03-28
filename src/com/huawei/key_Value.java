package com.huawei;
import java.util.*;

/**
 * 数据表记录包含表索引和数值（int范围的整数），
 * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，
 * 输出按照key值升序进行输出
 */

public class key_Value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < Integer.valueOf(X);i++){
            String capram = sc.nextLine();
            list.add(capram);
        }
        ////数据初始化,将key和value分别存入到两个不同的有序List中
        List<Integer> keyList = new ArrayList<Integer>();
        List<Integer> valueList = new ArrayList<Integer>();
        for (int i = 0;i < list.size();i++){
            String[] capramArr = list.get(i).split(" ");
            keyList.add(Integer.valueOf(capramArr[0]));
            valueList.add(Integer.valueOf(capramArr[1]));
        }
        //数据清洗，对存放键值List遍历，并按照键值相同的value加起来存放在hashmap中
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0;i < keyList.size();i++){
            if(map.containsKey(keyList.get(i))){
                int value = map.get(keyList.get(i));
                value = value + valueList.get(i);
                map.put(keyList.get(i),value);
            }else {
                map.put(keyList.get(i),valueList.get(i));
            }
        }
        //将map中的key存放在maplist中
        List<Integer> maplist = new ArrayList<Integer>();
        for (Integer key :map.keySet()){
            maplist.add(key);
        }
        //对maplist升序
        for (int i = 0; i < maplist.size();i++){
            for (int j = 0;j<i;j++){
                if(maplist.get(i)<maplist.get(j)){
                    int k = maplist.get(j);
                    maplist.set(i,maplist.get(j));
                    maplist.set(j,k);
                }
            }
        }
        //输出结果
        for (int i = 0; i< maplist.size();i++){
            System.out.println(maplist.get(i)+" "+map.get(maplist.get(i)));
        }
    }

}
