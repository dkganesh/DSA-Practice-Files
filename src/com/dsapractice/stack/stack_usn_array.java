package com.dsapractice.stack;

import java.util.EmptyStackException;

public class stack_usn_array <T>{
    private int top;
    final static int size=30;
    private T arr[];
    public stack_usn_array(){
        top=-1;
        this.arr=(T[])new Object[size];
    }
    public void push(T n){
        try{
            if (top+1 >= size)
                throw new stack_over_flow_Exception();
        }catch (stack_over_flow_Exception e){
            System.out.println("Stack is Full!!!");
        }
            arr[++top]=n;
    }
    public T pop(){
        if(top<0)
            throw new EmptyStackException();
        else
            return arr[top--];
    }
    public void peek(){
        if(top<0)
            throw new EmptyStackException();
        else
            System.out.println(arr[top]);
    }
    public void display_All(){
        if(top<0)
            throw new EmptyStackException();
        else{
            for(int i=0;i<=top;i++) System.out.printf(arr[i]+" ");
            System.out.println();
        }
    }
}
