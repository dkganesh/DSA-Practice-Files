package com.dsapractice.execute;
import com.dsapractice.stack.stack_usn_array;
public class stack_exe {
    public static void main(String args[]){
        stack_usn_array obj=new stack_usn_array<String>();
        obj.push("1!");
        obj.push("2@");
        obj.push("3#");
        obj.display_All();
        System.out.println(obj.pop());
        obj.peek();
        obj.display_All();
        obj.pop();
        obj.pop();
        obj.display_All();

    }
}
