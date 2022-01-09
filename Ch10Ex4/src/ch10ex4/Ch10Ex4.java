package ch10ex4;

import java.util.Scanner;
import java.util.ArrayList;

public class Ch10Ex4 {

    public static void main(String[] args) {
        int numbers[];
        int nument,i=1;
        
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> number = new ArrayList();
     
     System.out.println("Enter numbers between 1-50: ");   
     
     while(i>0){
     nument=input.nextInt();
     if(nument>=1 && nument<=50){
         i++;
     }
     else{
         break;
     }
     }
     
     int temp;
     
     for(int c=0;c<number.size();c++){
        for(int j=0;j<number.size()-1;j++){ //This is always one less
            if(number.get(j)>number.get(j+1)) {
            temp=number.get(j);
            number.set(j, number.get(j+1));
            number.set(j+1,temp);
            }
        }
     }
     for(int c=0;c<number.size();c++){
     System.out.println(number.get(c));
     }
     
    }
    
}
