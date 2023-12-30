package com.dsapractice.execute;

import com.dsapractice.linked_list.doublelink_list;

public class dlink_exe {
    public static void main(String args[]){
//        doublelink_list s=new doublelink_list<String>();
        doublelink_list <Integer> s=new doublelink_list<Integer>();
//        s.insert_beg("Hello");
//        s.insert_beg("Hi");
        s.insert_beg(2);
        s.insert_beg(3);
        s.insert_beg(1);
        s.insert_end(0);
        s.insert_pos(1,5);
        s.insert_pos(0,100);
        s.insert_pos(6,101);
        s.insert_pos(7,102);
        s.fdisplay();
        System.out.println();
        s.del_beg();
        s.fdisplay();
        System.out.println();
        s.del_end();
        s.fdisplay();
        System.out.println();
        s.del_pos(1);
        s.fdisplay();
        System.out.println();
        s.insert_pos(2,8);
        s.insert_pos(0,9);
        s.rdisplay();
    }
}
