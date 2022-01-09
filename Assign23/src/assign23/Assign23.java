package assign23;

import java.util.Scanner;

public class Assign23 {

    public static void main(String[] args) {
        String[][] board = new String[8][8];
        int p1=0,p2=0;
        String player1="1 ",player2="2 ";
        boolean fin=false,winner=false;
        int count=1;
        
        Scanner input = new Scanner(System.in);
        
        initialBoard(board);
        System.out.println("");
        
        while(winner==false){
            if(count>=1){
                displayBoard(board);
                Player1(player1,p1,board,count);
                displayBoard(board);
                count++;
                winner=checkWin(board);
                if(winner==true){
                    System.out.println("\nPlayer 1 Wins!");                    
                }
                else if(count==64 && winner==false){
                    System.out.println("\nTHE GAME ENDS IN A TIE");
                    break;
                }
                else{
                    Player2(player2,p2,board,count);
                    count++;
                    winner=checkWin(board);
                    if(winner==true){
                        System.out.println("\nPlayer 2 Wins!");
                    }
                    else if(winner==false && count==64){
                        System.out.println("\nTHE GAME ENDS IN A TIE");
                        break;
                    }
                }
            }
        }
    }
    
    public static void initialBoard(String[][] board){
    
    for (int r=0; r<8; r++) {
            for (int c=0; c<8; c++) {
                System.out.print(board[r][c] = "0 ");                
            }
            System.out.println("");
        }
        System.out.println("A B C D E F G H");
}
    
    public static void displayBoard(String[][] board){
     
        for (int r=0; r<8; r++) {
            for (int c = 0; c<8; c++) {
            System.out.print(board[r][c]);
            }
            System.out.println("");
        }
        System.out.println("A B C D E F G H");        
    }
    
    public static boolean checkWin(String[][] board){
        
        for (int r=0; r<=5; r++) {
            for (int c=2; c<6; c++) {
                if(!"0 ".equals(board[r][c])){
                    if(board[r][c].equals(board[r+1][c+1]) && board[r+1][c+1].equals(board[r+2][c+2]) && board[r][c].equals(board[r+1][c-1]) && board[r+1][c-1].equals(board[r+2][c-2])){
                        return true;
                    }
                }
            }          
        }
        
        for (int r=7; r>=2; r--) {
            for (int c=2; c<6; c++) {
                if(!"0 ".equals(board[r][c])){
                    if(board[r][c].equals(board[r-1][c+1]) && board[r-1][c+1].equals(board[r-2][c+2]) && board[r][c].equals(board[r-1][c-1]) && board[r-1][c-1].equals(board[r-2][c-2])){
                        return true;
                    }
                }
            }          
        }
        
        return false;     
    }
    
    public static void Player1(String player1,int p1, String[][] board, int count){
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("PLAYER #1, Select column to put a chip in: ");
            p1=input.next().charAt(0)-65;   
            if(p1>=0 && p1<=8){
                for (int r=7; r>=0;) {
                    if(("0 ").equals(board[r][p1])){
                    board[r][p1]=player1;
                    break;
                    }
                    else r--;
                }
                break;
            }
        }
    }
    
    public static void Player2(String player1,int p1, String[][] board, int count){
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("PLAYER #2, Select column to put a chip in: ");
            p1=input.next().charAt(0)-65;   
            if(p1>=0 && p1<=8){
                for (int r=7; r>=0;) {
                    if(("0 ").equals(board[r][p1])){
                    board[r][p1]=player1;
                    break;
                    }
                    else r--;
                }
                break;
            }
        }
    }
    
}
