package ch10ex8;

import java.util.Scanner;

public class Ch10Ex8 {

    public static void main(String[] args) {
        String palindrome,value="",letter;
        
        Scanner input = new Scanner(System.in);
        
     System.out.println("Enter a word or phrase: ");
     palindrome=input.nextLine();
     
     for (int i=palindrome.length()-1;i>=0; i--) {
     letter=palindrome.substring(i,i+1);
     value+=letter;
     }
     
     if(value.equals(palindrome) || value.replaceAll(" ","").equals(palindrome.replaceAll(" ",""))){
         System.out.println("The phrase or word is a palindrome!");
     }
     else{
         System.out.println("The phrase or word is NOT a palindrome!");
     }
     
        
    }
    
}
