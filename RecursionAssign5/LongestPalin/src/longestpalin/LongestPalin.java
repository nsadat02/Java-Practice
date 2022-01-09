package longestpalin;

import java.util.*;

public class LongestPalin {

    public static void main(String[] args) {
        String sen,rev,palin="";
        int count=0,len,min=3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a phrase: ");
        sen=input.nextLine();
        //sen=input.nextLine().toLowerCase();       
        //sen=sen.replaceAll(" ","");
        len=sen.length();
        
        //rev=new StringBuffer(sen).reverse().toString();
        
        if(FindPalindrome(sen,len,count,min,palin).equals("")){
            System.out.println("NO PALENDROME EXIST IN THE PHRASE: "+sen.toUpperCase());
        }
        else{
            System.out.println("The longest palindrome in the phrase is: "+FindPalindrome(sen,len,count,min,palin).toUpperCase());
        }
        
    }

    public static String FindPalindrome(String sen, int len, int count, int min, String palin) {
        String phrase,rev;
        
        phrase=sen.substring(count,len).replaceAll(" ","").toLowerCase();
        rev=new StringBuffer(phrase).reverse().toString();
        //System.out.println(count+"");
        //System.out.println(len+"");
        //if((sen.substring(count,len)).equals(rev.substring(count,len)) && (sen.substring(count,len)).length()>=min){
        if(phrase.equals(rev) && phrase.length()>=min){
            min=phrase.length();
            palin=phrase;
            if(count==len){
                return palin;
            }
            else{
            return FindPalindrome(sen,len-1,count,min,palin);
            }
            //System.out.println("The longest palindrome in the phrase is: "+sen.substring(count,len).toUpperCase());
        }
        else if(count<len && len-count>=min){
            count++;
            //System.out.println(count+"");
            return FindPalindrome(sen,len,count,min,palin);
        }
        else if(len-count<min && len>=3){
            count=0;
            len--;
            //System.out.println(count+"");
            //System.out.println(len+"");
            return FindPalindrome(sen,len,count,min,palin);
        }
        else{
            return palin;
        }

        
        //return palin;      
    }
    
}
