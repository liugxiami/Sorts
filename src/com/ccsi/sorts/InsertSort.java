package com.ccsi.sorts;

/**
 * Created by gxliu on 2016/11/14.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,4};
        long start=System.nanoTime();
        insertSort(a);
        long end=System.nanoTime();
        long interval=end-start;
        System.out.println(interval);
        for(int i:a) System.out.println(i);
    }
    //O[n^2]
    public static void insertSort(int[] nums){
        if(nums==null||nums.length<=1)return;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(nums[j]<nums[j-1])swap(nums,j,j-1);
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
