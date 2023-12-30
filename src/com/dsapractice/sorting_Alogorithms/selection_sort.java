package com.dsapractice.sorting_Alogorithms;

public class selection_sort {
    private int min(int a[],int i){
        int ans=-1;
        int s=a[i];
        for(int j=i+1;j<a.length;j++){
            if(s>a[j]){
                s=a[j];
                ans=j;
            }
        }
        return ans;
    }
    public int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int n=min(arr,i);
            if(n>=0){
                arr[n] = arr[i] ^ arr[n];
                arr[i] = arr[i] ^ arr[n];
                arr[n] = arr[n] ^ arr[i];
            }
        }
        return arr;
    }
}
