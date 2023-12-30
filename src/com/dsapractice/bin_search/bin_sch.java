package com.dsapractice.bin_search;

public class bin_sch {
    public boolean search(int a[],int key){
        int f=0,l=a.length-1;
        while(f<l){
            int mid=(f+l)/2;
            if(a[mid]==key)return true;
            else if(a[mid]>key)l=mid-1;
            else if(a[mid]<key)f=mid+1;
        }
        return false;
    }
}
