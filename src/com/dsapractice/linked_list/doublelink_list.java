package com.dsapractice.linked_list;

public class doublelink_list <T>{
    private class node{
        T data;
        node prev;
        node nxt;
        node(){
            prev=null;
            nxt=null;
        }
        node(T val){
            data=val;
            prev=null;
            nxt=null;
        }
    }
    private node head;
    public void insert_beg(T val){
        node p=new node(val);
        if(head==null)head=p;
        else{
            p.nxt=head;
            head.prev=p;
            head=p;
        }
    }
    public void insert_end(T val){
        node p=new node(val);
        if(head==null)head=p;
        else{
            node temp=head;
            while(temp.nxt!=null){
                temp=temp.nxt;
            }
            temp.nxt=p;
            p.prev=temp;
        }
    }
    public void insert_pos(int pos,T val){
        node p=new node(val);
        if(head==null)head=p;
        else{
            if(pos==0) {
                insert_beg(val);
                return;
            }
            node temp=head;
            int c=0;
            while(temp.nxt!=null){
                c++;
                temp=temp.nxt;
            }
            if(pos>=c) {
                insert_end(val);
                return;
            }
            temp=head;
            while(temp.nxt!=null && pos>1){
                temp=temp.nxt;pos--;
            }
            p.prev=temp;
            p.nxt=temp.nxt;
            p.prev.nxt=p;
            p.nxt.prev=p;
        }
    }
    public void del_beg(){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.out.println("LL not Found!!!");
        }
        node temp=head.nxt;
        temp.prev=null;
        head=temp;
    }
    public void del_end(){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.out.println("LL not Found!!!");
        }
        node temp=head;
        while(temp.nxt.nxt!=null){
            temp=temp.nxt;
        }
        temp.nxt=null;
    }
    public void del_pos(int pos){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.out.println("LL not Found!!!");
        }
        if(pos==0){
            del_beg();
            return;
        }
        node temp=head;
        int c=0;
        while(temp.nxt!=null){
            c++;
            temp=temp.nxt;
        }
        if(c<=pos){
            del_end();
            return;
        }
        temp=head;
        while(temp.nxt!=null && pos>1){
            temp=temp.nxt;
            pos--;
        }
        temp.nxt=temp.nxt.nxt;
        temp.nxt.prev=temp;
    }
    public void fdisplay(){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.out.println("LL not Found!!!");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nxt;
        }
    }
    public void rdisplay(){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.out.println("LL not Found!!!");
        }
        node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.prev;
        }
    }
}
