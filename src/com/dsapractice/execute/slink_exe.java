package com.dsapractice.execute;
import com.dsapractice.linked_list.slink_list;
public class slink_exe {

    public static void main(String args[]){
        slink_list s=new slink_list();
        s.insert_beg(2);
        s.insert_beg(3);
        s.insert_beg(1);
        s.insert_end(0);
        s.insert_pos(1,5);
        s.display();
        System.out.println();
        s.del_beg();
        s.display();
        System.out.println();
        s.del_end();
        s.display();
        System.out.println();
        s.del_pos(1);
        s.display();
        System.out.println();
        s.insert_pos(2,8);
        s.insert_pos(0,9);
        s.display();
    }
}
