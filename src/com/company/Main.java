package com.company;
import java.util.Scanner;
interface Student{
    default void S(){
        name();
    }
    private void name()
    {
        System.out.print("Enter your name : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.print("Enter your course : ");
        String course = in.next();
        System.out.println("Congrats "+name+" , You have successfully enrolled a course on "+course);
    }
}
public class Main implements Student{
    public static void main(String [] args){
        Student s = new Main();
        s.S();
    }
}