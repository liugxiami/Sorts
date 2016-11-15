package com.ccsi.sorts;

/**
 * Created by gxliu on 2016/11/14.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,4};
        selectionSort(a);
        for(int i:a) System.out.println(i);
    }
    //O[n^2]
    public static void selectionSort(int[] nums){
        if(nums==null||nums.length<=1)return;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j])swap(nums,i,j);
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
