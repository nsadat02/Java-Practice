package fibseries;

import java.util.*;

public class FibSeries {

    public static void main(String[] args) {
        int term;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the term number: ");
        term=input.nextInt();
        
        System.out.println("The value of term "+term+" in the Fibonacci series is: "+TermValue(term));
        
    }

    public static int TermValue(int term) {
        
        if(term==1 || term==2){
            return 1;
        }
               
        return TermValue(term-1)+TermValue(term-2);    
    }
    
}
