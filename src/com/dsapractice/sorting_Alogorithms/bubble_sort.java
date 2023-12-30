package com.dsapractice.sorting_Alogorithms;

public class bubble_sort {
    public int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[j]=arr[j]^arr[i];
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[j]^arr[i];
                }
            }
        }
        return arr;
    }
}
