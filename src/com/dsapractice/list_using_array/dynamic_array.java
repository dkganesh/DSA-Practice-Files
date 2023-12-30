package com.dsapractice.list_using_array;

import java.util.Arrays;

public class dynamic_array {
    private int arr[];
    final static int initial_cap=2;
    private int point;
    private int dyn_cap;
    public dynamic_array(){
        arr=new int[initial_cap];
        point=-1;
        dyn_cap=initial_cap;
    }
    private void expand_list(int arr[]){
        dyn_cap*=2;
        this.arr=Arrays.copyOf(arr,dyn_cap);
    }
    public void insert_end(int n){
        if(point < arr.length-1){
            arr[++point]=n;
        }
        else{
            expand_list(arr);
            insert_end(n);
        }
    }
    public void insert_beg(int n){
        int temp=point;
        if(point < arr.length-1){
            while(point >=0){
                arr[point + 1] = arr[point];
                point--;
            }
            arr[0]=n;
            point=temp+1;
        }
        else{
            expand_list(arr);
            insert_beg(n);
        }
    }
    public void display(){
        try{
            if(arr==null)
                throw new ArrayEmptyException();
        }
        catch (ArrayEmptyException e){
            System.err.println("No array found !!! - Its Empty");
        }
        for(int i=0;i<point+1;i++){
            System.out.printf(arr[i]+ " ");
        }
    }
    public void insert_pos(int pos,int n){
        int temp=point;
        if(pos==point+1)insert_end(n);
        else if(pos==0)insert_beg(n);
        else if(point<arr.length-1){
            for (int i = point;i>=pos;i--){
                arr[i+1]=arr[i];
            }
            arr[pos]=n;
            point+=1;
        }
        else{
            expand_list(arr);
            insert_pos(pos,n);
        }
    }
    public void del_end(){
        try{
            if(point<0)
                throw new ArrayEmptyException();
        }
        catch (ArrayEmptyException e){
            System.err.println("No array found !!! - Its Empty");
        }
        arr[point]=0;
        point-=1;
    }
    public void del_beg() {
        int temp=point;
        for(int i=1;i<=point;i++){
            arr[i-1]=arr[i];
        }
        point=temp-1;
    }
    public void del_pos(int pos) {
        if(pos==0)del_beg();
        else if(pos==point)del_end();
        else{
            for(int i=pos+1;i<=point;i++){
                arr[i-1]=arr[i];
            }
            point-=1;
        }
    }
}
