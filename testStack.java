package com.dataStructure;

import java.util.*;
class myStack{
    private static int top=-1;
   static Scanner sc=new Scanner(System.in);
    private static final int size=10;
    private static int stack[]=new int[size];

//    private static int size;
//    private static int stack[];

//    static {
//        System.out.println("Enter the size of array ");
//       int size=sc.nextInt();
//       stack=new int[size];
//    }

    public static void push(){
        if (top==size-1){
            System.out.println("The stack is overflow ☻ ");
        }
        else {
            System.out.println("Enter the element of stack : ♣ ");
          int n=sc.nextInt();
            top++;
            stack[top]=n;
        }
    }
    public static void pop(){
        if (top==-1){
            System.out.println("Stack is empty ☻ ");
        }
        else {
            System.out.println("The popped element "+stack[top]);
            top--;
        }
    }
    public  static void display(){
        if (top==-1){
            System.out.println("The stack is empty : ♠ ");
        }
        else{
            System.out.println("The elements of stack are : ☺☺☺☺");
            for (int i =top; i>=0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
public class testStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myStack m=new myStack();
        int choice;
        do {
            System.out.println("--------------------Stack---Menu-----------");
            System.out.println("1.PUSH \n2.POP\n3.DISPLAY\n4.EXIT");
            System.out.println("---------------------------------------------");
            System.out.println("Enter your choice : ");
            choice = sc.nextByte();
            switch (choice){
                case 1:m.push();break;
                case 2:m.pop();break;
                case 3:m.display();break;
                case 4:
                    System.out.println("Exiting the program : Thanks ♥ ");
                    break;
                default:
                    System.out.println("Invalid choice : ! Try again ");
            }
        } while (choice != 4);
    }
}
