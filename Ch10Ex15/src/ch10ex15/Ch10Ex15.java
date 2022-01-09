package ch10ex15;

import java.util.Scanner;

public class Ch10Ex15 {

    public static void main(String[] args) {
        int[] numbers = {3,3,3,3,3,3,0,3,3,3,3,3,3,0};
        String player1,player2;
        boolean fin=false,playPossible;  
        int turn=1, position=0;
        
        Scanner input = new Scanner(System.in);
     
     while(!fin){
        displayBoard(numbers);
        if(turn==1){
            if(playPossible(numbers)==true){
                position=input.next().charAt(0)-65;
                turn=changeStones(numbers,position,turn);
            }
            else{
                fin=true;
            }
        }
     }
     
     
    }
    
    public static void displayBoard(int[] numbers){
     
        System.out.println("\t");   
     for (int a=12; a>numbers.length-8; a--) {
         System.out.print("   "+numbers[a]);
     }
     
     System.out.println("\n "+numbers[13]+"                        "+numbers[6]);
     
     for (int d=0; d<numbers.length-8; d++) {
         System.out.print("   "+numbers[d]);       
     }
     
        System.out.println("\n   A   B   C   D   E   F");
            
    }
    
    public static boolean playPossible(int[] numbers){
        boolean play=false;
     for (int b=0; b<6; b++) {
         if(numbers[b]!=0){
             play=true;
         }
     }
    
    return play;
    }
    
    public static int changeStones(int[] numbers,int position, int turn){
        int stones = numbers[position];
        
     numbers[position]=0;
     
     for (int i=0; i<stones; i++) {
        position++;
        if(position>12){
            position=0;
        }
        numbers[position]++;
     }

     if(position!=6){
        turn=2;
     }
     
     if(numbers[position]==1 && (position>=0 && position<6)){
        numbers[6]+=numbers[12-position];
        numbers[12-position]=0;
     }     
          
    return turn;    
    }
    
}
