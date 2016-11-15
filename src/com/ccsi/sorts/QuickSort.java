package com.ccsi.sorts;

import java.util.Random;

/**
 * Created by gxliu on 2016/11/14.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,4};
        long start=System.nanoTime();
        quickSort(a);
        long end=System.nanoTime();
        long interval=end-start;
        System.out.println(interval);
        for(int i:a) System.out.println(i);
    }
    //O[nlogn]
    public static void quickSort(int[] nums){
        if(nums==null||nums.length<=1)return;
        sort(nums,0,nums.length-1);
    }
    public static void sort(int[] nums,int start,int end){
        if(start>=end)return;
        int pivotIndex=partition(nums,start,end);
        sort(nums,start,pivotIndex-1);
        sort(nums,pivotIndex+1,end);
    }
    public static int partition(int[] nums,int start,int end){
        int ran=new Random().nextInt(end-start)+start;
        swap(nums,start,ran);
        int pivot=nums[start];
        int idx=start+1;

        for (int i = start+1; i <=end ; i++) {
            if(nums[i]<pivot)swap(nums,i,idx++);
        }
        swap(nums,start,idx-1);
        return idx-1;
    }
    public static void swap(int[] nums,int p,int q){
        if(p==q)return;
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
    }
}
