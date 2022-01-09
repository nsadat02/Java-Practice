package ch10ex5;

import java.util.Scanner;
import java.util.Random;

public class Ch10Ex5 {

    public static void main(String[] args) {
        int peg=0,color=0,com;
        int count=0,a=0,C=0;
        int [] guess;
        int [] code;
        int [] broke = new int[peg];
        boolean correct=false,right=false;
        
        Scanner input = new Scanner(System.in);
        Random r = new Random();
 
     while(peg<1 || peg>10){
         System.out.print("Enter the number of pegs <1-10>: ");
         peg=input.nextInt();
     }

     while(color<1 || color >9){
         System.out.print("\nEnter the number of colors <1-9>: ");
         color=input.nextInt();
     }

     guess = new int[peg];
     code = new int[peg];

     for (int i=0; i<code.length; i++) {
         com=r.nextInt(color)+1;
         code[i]=com;
         System.out.println(""+code[i]);
     }

     while(correct==false){
         count++;
         System.out.println("\nGuess "+count+":");
         for (int c=0; c<peg; c++) {
             System.out.println("Color for peg "+(c+1)+": ");
             guess[c]=input.nextInt();
             while(guess[c]>color || guess[c]<1){
                 System.out.println("Invalid number! Try Again!");
                 guess[c]=input.nextInt();
             }
             
         }
     

     for (int c=0; c<guess.length; c++){
         if(guess[c]==code[c]){
             a++;
         }
         for (int s=0;s<broke.length;s++) {
            if(guess[c]==broke[s] && right==false){
                broke[s]=0;
                C++;
                right=true;
            }      
         }
         right=false;
     }
     
     System.out.println("You have "+a+" peg(s) correct and "+C+" color(s) correct.");
     if(a==code.length){
         correct=true;
     }
     }
     
     System.out.println("You have broken the code in "+count+" guesses.");
        
    }
    
}
