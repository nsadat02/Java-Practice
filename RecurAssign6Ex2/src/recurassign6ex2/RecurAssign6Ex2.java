package recurassign6ex2;

import java.util.*;

public class RecurAssign6Ex2 {

    public static void main(String[] args) {
        int count=0,num;
        
        Random r = new Random();
        
        num=r.nextInt(20)+1;
        System.out.println(num+"");
        
        if(game(num,count)==false){
            System.out.println("Win!");
        }
    }

    public static boolean game(int num, int count) {
        int guess;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the random number: ");
        guess=input.nextInt();
        if(guess!=num){
            if(game(num,count++))return true;
        }
        else{
            return false;
        }
        
        return true;            
    }
    
}
