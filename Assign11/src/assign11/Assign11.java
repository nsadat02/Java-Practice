package assign11;

import java.util.Scanner;

public class Assign11 {
    
    public static void main(String[] args) {
        double height, weight, BMI;
        
        Scanner input = new Scanner(System.in);
        
     System.out.println("Enter the weight:");
     weight=input.nextDouble();
     System.out.println("Enter the height:");
     height=input.nextDouble();

     BMI=weight/(height*height);
        
     if(BMI>25){
         System.out.println("Overweight");
     }
     else if(BMI>=18.5 && BMI<=25){
         System.out.println("Normal Weight");
     }
     else{
         System.out.println("Underweight");
     }
    }
    
}
