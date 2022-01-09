package gcd;

import java.util.*;

public class GCD {

    public static void main(String[] args) {
        int n1,n2;
        int max;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        n1=input.nextInt();
        System.out.println("Enter the second number: ");
        n2=input.nextInt();
        
        if(n1>n2){
            max=n2;
        }
        else{
            max=n1;
        }        
        gcd(n1,n2,max);
        
    }

    public static void gcd(int n1, int n2, int max) {
       
        if(n1%max==0 && n2%max==0 && max>=1){
            System.out.println("The greatest common divisor is: "+max);
        }
        else{
            max--;
            gcd(n1,n2,max);
        }        
                
    }
    
}
