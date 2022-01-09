package assign12;

import java.util.Scanner;

public class Assign12 {

    public static void main(String[] args) {
        String votes,letter;
        int A=0, B=0;
        boolean valid=true;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the votes: ");
        votes=input.nextLine();
        
        for (int i = 0; i<votes.length(); i++) {
            letter=votes.substring(i,i+1);
            if(letter.equals("A") || letter.equals("a")){
                A++;
            }
            else if(letter.equals("B") || letter.equals("b")){
                B++;
            }
            else{
                valid=false;
                break;
            }
        }
        
        if(A>B){
            System.out.println("The Winner is A!");
        }
        else if(B>A){
            System.out.println("The Winner is B");
        }
        if(A==B && valid==true){
            System.out.println("A and B Tied!");
        }
        else if (valid==false){
            System.out.println("Votes entered not valid");
        }
    }
    
}
