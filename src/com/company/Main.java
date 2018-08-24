package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input context: ");
        String context = scanner.nextLine();

        String a;
        char[] array;
        do {
            System.out.print("\nInput character: ");
            a = scanner.nextLine();
             array = a.toCharArray();
            if(array.length>=2){
                System.out.println("Only 1 character");
            }
        }while(array.length>=2);

        char value = a.charAt(0);
        int index = 0;
        char[] contextArray = context.toCharArray();
        for(int i = 0; i < contextArray.length; i++){
            if(contextArray[i]==value){
                index++;
            }
        }
        System.out.println("Count: "+index+" value: "+value);
    }
}
