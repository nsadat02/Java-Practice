package recurassign6ex1;

import java.util.*;

public class RecurAssign6Ex1 {

    public static void main(String[] args) {
        int min,max;
        String star="";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the min number: ");
        min=input.nextInt();
        System.out.print("\nEnter the max number: ");
        max=input.nextInt();
        
        for (int i=1; i<min; i++) {
            star+="*";
        }
        System.out.println("Triangle ("+min+","+max+") will display this: ");
        MakeTriangle(min,max,star);        
    }

    public static void MakeTriangle(int min, int max, String star) {
        
        if(star.length()<max){
            if(star.length()>=min){
                System.out.println(star);
            }
            star+="*";
            MakeTriangle(min,max,star);
        }
        System.out.println(star);
    }
    
}
