package com.dsapractice.linked_list;

public class slink_list {
    private class node{
        int data;
        node link;
        node(){
            data=0;
            link=null;
        }
        node(int val){
            this.data=val;
            link=null;
        }
    }
    private node head;
    public slink_list(){
        head=null;
    }
    public void insert_beg(int val){
        node p=new node(val);
        if(head==null)head=p;
        else{
            p.link=head;
            head=p;
        }
    }
    public void insert_end(int val){
        node p=new node(val);
        if(head==null)head=p;
        else{
            node temp=head;
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link=p;
        }
    }
    public void insert_pos(int pos,int val){
        node p=new node(val);
        if(head==null)head=p;
        else {
            int c=0;
            node temp=head;
            while (temp.link!=null){
                c++;
                temp=temp.link;
            }
            temp=head;
            if(pos>c)pos=c;
            for(int i=0;i<pos-1;i++){
                temp=temp.link;
            }
            p.link=temp.link;
            temp.link=p;
        }
    }
    public void display(){
        try{
            if (head == null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.err.println("LL Not Found!!!");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.link;
        }
    }
    public void del_beg(){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.err.println("LL Not Found!!!");
        }
        head=head.link;
    }
    public void del_end(){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.err.println("LL Not Found!!!");
        }
        node temp=head;
        while(temp.link.link!=null){
            temp=temp.link;
        }
        temp.link=null;
    }
    public void del_pos(int pos){
        try{
            if(head==null)
                throw new Linkedlist_NotFound();
        }catch (Linkedlist_NotFound e){
            System.err.println("LL Not Found!!!");
        }
        node temp=head;
        int c=0;
        while (temp.link!=null){
            c++;
            temp=temp.link;
        }
        temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.link;
        }
        temp.link=temp.link.link;
    }
}
