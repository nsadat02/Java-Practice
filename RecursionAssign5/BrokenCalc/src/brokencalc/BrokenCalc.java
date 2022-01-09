package brokencalc;

import java.util.*;

public class BrokenCalc {

    public static void main(String[] args) {
        int dvs,dvd;
        int count=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the divident: ");
        dvd=input.nextInt();
        System.out.println("Enter the divisor: ");
        dvs=input.nextInt();
        
        System.out.println("The quotient is: "+calcAns(dvs,dvd,count));
        
    }

    public static int calcAns(int dvs,int dvd,int count) {

        dvd=dvd-dvs;
        count++;
        if(dvd<dvs){
            System.out.println("The remainder is: "+dvd);
            return count;
        }
    
        return calcAns(dvs,dvd,count);
    }
    
}
