package com.yq;

public class Test03 {
    public static void main(String[] args) {
        int[] nums = new int[]{67,87,88,98,99};
        int[] newNums = new int[nums.length+1];
        // 将 nums 中的已有元素复制到 newNums 中
        for(int i=0;i<nums.length;i++){
           newNums[i] = nums[i] ;
        }
        int insert = 88 ; // 待插入元素
        int position = newNums.length - 1; // 待插入元素的位置
        // newNums数组中第一个>90的位置，就是待插入元素的位置
        for(int i=0;i<newNums.length;i++){
            if(newNums[i] > insert){
                position = i;
                break ;
            }
        }
        System.out.println("待插入的位置是：" + position);
        // 2.向右平移
        for(int i=newNums.length-2; i>=position; i--){//position, newNums.length-2
            newNums[i+1] = newNums[i] ;
        }

        newNums[position] = insert ;

        // 验证是否正确
        for(int i=0;i<newNums.length;i++){
            System.out.println(newNums[i]);
        }












    }
}
