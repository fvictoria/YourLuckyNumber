package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

	System.out.println("What is your name?");
    Scanner kbReader = new Scanner(System.in);
    String name = kbReader.nextLine();
    System.out.println("Nice to meet you "+name+"! Your lucky number is "+Math.random());

    }
}
