package com.ccsi.sorts;

/**
 * Created by gxliu on 2016/11/14.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,4};
        long start=System.nanoTime();
        shellSort(a);
        long end=System.nanoTime();
        long interval=end-start;
        System.out.println(interval);
        for(int i:a) System.out.println(i);
    }
    //O[n^2]是insertSort的改进版
    public static void shellSort(int[] nums){
        if(nums==null||nums.length<=1)return;
        int gap=nums.length/2;

        while(gap>0){
            for (int i = gap; i < nums.length; i++) {
                for (int j = i; j > 0; j-=gap) {
                    if(j-gap>=0&&nums[j]<nums[j-gap])swap(nums,j,j-gap);
                }
            }
            gap/=2;
        }
    }
    public static void swap(int[] nums,int p,int q){
        if(p==q)return;
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
    }
}
