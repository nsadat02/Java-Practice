/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodarrays;

import java.util.Scanner;

/**
 *
 * @author mhossein3138
 */
public class TwoDArrays {
//---
    /**
     * 
     * 
     * @param Tictable
     */
   public static void IniBoard(String[][] Tictable){
    for(String[] Tictable1 : Tictable){
        for(int c = 0; c < Tictable[0].length; c++){
            Tictable1[c] = "-";
        }
    }
}

public static void PrintBoard(String[][] Tictable)
{
    for(String[] Tictable1 : Tictable){
        for(int c = 0; c < Tictable[0].length; c++){
            System.out.print(Tictable1[c]);
        }
        System.out.println("");
        
    }
}
    static int count=0;
    
    public static void Player1(String Player1, int row1, int col1, String [][]Tictable, int count){
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("Player 1#, Enter your row: ");
        row1=in.nextInt();
        System.out.println("Player 1#, Enter your column: ");
        col1=in.nextInt();


        if(!("-").equals(Tictable[row1][col1])){
            System.out.println("Invalid Move. Try agian");
        }
        else {
            Tictable[row1][col1]=Player1;
            break;
        }
        
       } 
    }
    
    public static void Player2(String Player2, int row2, int col2, String [][]Tictable, int count){
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("Player 2#, Enter your row: ");
        row2=in.nextInt();
        System.out.println("Player 2#, Enter your column: ");
        col2=in.nextInt();


        if(!("-").equals (Tictable[row2][col2])){
            System.out.println("Invalid Move. Try agian");
        }
        else {
            Tictable[row2][col2]=Player2;
            break;
        }

      }
    }
    public static boolean GetWinner(String [][]Tictable){
        for (int row = 0; row < Tictable.length; row++) {
            if (Tictable[row][0].equals(Tictable[row][1]) && Tictable[row][1].equals(Tictable[row][2]) && !(Tictable[row][0].equals("-"))) {
       
                return true;
       
}
}
     for (int col = 0; col < Tictable[0].length; col++) {
        if (Tictable[0][col].equals(Tictable[1][col]) && Tictable[1][col].equals(Tictable[2][col]) && !(Tictable[0][col].equals("-"))) {
            return true;
        }
}
         if (Tictable[0][0].equals(Tictable[1][1]) && Tictable[1][1].equals(Tictable[2][2]) && !(Tictable[0][0].equals("-"))) {
             return true;
        }

        if (Tictable[0][2].equals(Tictable[1][1]) && Tictable[1][1].equals(Tictable[2][0]) && !(Tictable[0][2].equals("-"))) {
            return true;
        }
       
       return false;
         
   }
 
    public static void main(String[] args) {

        String Gp1="", Gp2="";
        
        String[][] Tictable = new String [3][3];
        String Player1="X", Player2="O";
        boolean winner=false;
        int row1=0, row2=0;
        int col1=0, col2=0;
            
        IniBoard(Tictable);
            while (winner==false){
                    PrintBoard(Tictable);
                Player1(Player1, row1, col1, Tictable, count);
                    PrintBoard(Tictable);
                    count++;
                winner=GetWinner(Tictable);
                    if(winner==true){
                        System.out.println("Player 1 Wins");
                }
                    else if(count==9 && winner == false){
                        System.out.println("It's a Tie");
                        winner=true;
                    }
                    else{
                    Player2(Player2, row2, col2, Tictable, count);
                    count++;
                        winner=GetWinner(Tictable);
                            if(winner==true){
                                System.out.println("Player 2 Wins");
                    }
                }
                    if(count==9 && winner == false){
                        System.out.println("It's a Tie");
                        winner=true;
                    }
            }
            
                
               
    }
    
}
