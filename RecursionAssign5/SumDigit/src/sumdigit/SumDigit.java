package sumdigit;

import java.util.*;

public class SumDigit {

    public static void main(String[] args) {
        String num;
        int count=1,sum=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        num=input.next();
        
        FindSum(num,count,sum);       
    }

    public static void FindSum(String num, int count, int sum) {
        
        if(count<=num.length()){
            int d=Integer.parseInt(num.substring(count-1,count));
            sum+=d;
            //System.out.println(""+sum);
            count++;
            FindSum(num,count,sum);
        }
        else{
            System.out.println("The sum of the digits is: "+sum);
        }       
    }   
}
