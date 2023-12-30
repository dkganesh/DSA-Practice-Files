package com.dsapractice.execute;
import com.dsapractice.list_using_array.ArrayEmptyException;
import com.dsapractice.list_using_array.dynamic_array;
import java.util.Scanner;

public class List_Array_exe {
    static void exe() throws ArrayEmptyException {
        System.out.println("________________________________");
        int choice;
        Scanner in =new Scanner(System.in);
        dynamic_array obj=new dynamic_array();
        System.out.println("1- insert beg");
        System.out.println("2- insert end");
        System.out.println("3- insert pos");
        System.out.println("4- delete beg");
        System.out.println("5- delete end");
        System.out.println("6- delete pos");
        System.out.println("7- Display");
        System.out.println("8- Exit");
        infinite:
        while(true){
            System.out.println("Enter Choice     ");
            choice=in.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter value");
                    int n = in.nextInt();
                    obj.insert_beg(n);
                    break;
                }
                case 2: {
                    System.out.println("Enter value");
                    int n = in.nextInt();
                    obj.insert_end(n);
                    break;
                }
                case 3: {
                    System.out.println("Enter value");
                    int n = in.nextInt();
                    System.out.println("Enter position");
                    int pos = in.nextInt();
                    obj.insert_pos(pos, n);
                    break;
                }
                case 4: {
                    obj.del_beg();
                    break;
                }
                case 5: {
                    obj.del_end();
                    break;
                }
                case 6: {
                    System.out.println("Enter Position");
                    int pos = in.nextInt();
                    obj.del_pos(pos);
                    break;
                }
                case 7: {
                    obj.display();
                    break;
                }
                case 8: {
                    break infinite;
                }
                default:
                    System.out.println("Enter a valid choice ");
            }
        }
        System.out.println("________________________________");
    }
    public static void main(String args[]) throws ArrayEmptyException {
       exe();
    }
}
