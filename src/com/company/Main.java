package com.company;

import java.util.Scanner;

public class Main {

    static int readIntFromUser() {
        Scanner reader = new Scanner(System.in);
        return Integer.parseInt(reader.nextLine());
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        int i;
        i = readIntFromUser();
        System.out.println("The value of i = " + i);
    }
}
