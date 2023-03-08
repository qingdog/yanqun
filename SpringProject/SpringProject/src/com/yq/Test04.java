package com.yq;

public class Test04 {
    public static void main(String[] args) {
        /*
            陕西,山西,四川
         */
        String[] pronvinces = {"陕西","山西","四川"} ;
        // 约定：二维数组中的一位数数组 需要和 pronvinces 的数据保持一致
        //  陕西 在 pronvinces 中的下标 0；
        //  同时是 cities数组 对应的下标
        String[][] cities = {{"西安","咸阳","渭南"},
                            {"太原","大同","运城"},
                            {"成都","广元","绵阳"}} ;
        int position = -1 ;// 暂存待查省份的下标
        String pro = "四川" ; // 输出："太原","大同","运城"
        // pronvinces山西 -> position -> cities
        for(int i=0;i<pronvinces.length;i++){
            if(pro.equals(pronvinces[i])){
          // if(pronvinces[i].equals(pro))
                position = i;
                break ;
            }
        }
        if(position == -1) System.out.println("输入有误！！！");
        else {
            for (int i = 0; i < cities[position].length; i++) {
                System.out.println(cities[position][i]);
            }
        }






    }
}
