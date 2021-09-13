package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Hello, What is your name?" );
        String name= sc.next();
        System.out.print("Hello, " + name + ", nice to meet you.");

    }
}
