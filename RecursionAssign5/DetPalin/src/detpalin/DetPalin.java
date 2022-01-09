package detpalin;

import java.util.*;

public class DetPalin {

    public static void main(String[] args) {
        String word;
        int count=0,len;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        word=input.next().toLowerCase();
        len=word.length();
        
        DeterminePalindrome(word,count,len);
    }

    public static void DeterminePalindrome(String word, int count, int len) {
        
        if((word.substring(count,count+1)).equals(word.substring(len-1,len)) && count<word.length()/2){
            count++;
            len--;
            DeterminePalindrome(word,count,len);
        }
        else if((word.substring(count,count+1)).equals(word.substring(len-1,len)) && count==word.length()/2){
            System.out.println(word.toUpperCase()+" is a palindrome!");
        }
        else{
            System.out.println(word.toUpperCase()+" is NOT a palindrome!");
        }
        
    }
    
}
