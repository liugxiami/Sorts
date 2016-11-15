package com.ccsi.sorts;

/**
 * Created by gxliu on 2016/11/14.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,4};
        long start=System.nanoTime();
        mergeSort(a);
        long end=System.nanoTime();
        long interval=end-start;
        System.out.println(interval);
        for(int i:a) System.out.println(i);
    }
    //O[nlogn]
    public static void mergeSort(int[] nums){
        if(nums==null||nums.length<=1)return;
        sort(nums,0,nums.length-1);
    }

    public static void sort(int[] nums,int start,int end){
        if(nums==null||nums.length==0||start>=end)return;
        int mid=start+(end-start)/2;
        sort(nums,start,mid);
        sort(nums,mid+1,end);
        merge(nums,start,end);
    }
    public static void merge(int[] nums,int start,int end){
        int mid=start+(end-start)/2;

        int[] aux=nums.clone();
        int p=start,q=mid+1;

        for (int i = start; i <=end ; i++) {
            if(p==mid+1)nums[i]=aux[q++];                    //四条语句互斥
            else if(q==end+1)nums[i]=aux[p++];
            else if(aux[p]<aux[q])nums[i]=aux[p++];
            else nums[i]=aux[q++];
        }
    }
}
