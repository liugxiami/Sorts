package com.ccsi.sorts;

/**
 * Created by gxliu on 2016/11/14.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,4};
        bubbleSort(a);
        for(int i:a) System.out.println(i);
    }
    //O[n^2]
    public static void bubbleSort(int[] nums){
        if(nums==null||nums.length<=1)return;
        for (int i = nums.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(nums[j]>nums[j+1])swap(nums,j,j+1);
            }
        }
    }
    public static void swap(int[] nums,int p,int q){
        if(p==q)return;
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
    }
}
