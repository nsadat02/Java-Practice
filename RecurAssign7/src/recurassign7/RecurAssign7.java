package recurassign7;

import java.util.*;
import java.io.*;

public class RecurAssign7 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fl;
        String size[];
        int spr=0,spc=0,row,col;
        
        Scanner readFile = new Scanner(new File("maze4.txt"));
        
        fl=readFile.nextLine();
        size=fl.split(",");
        row=Integer.parseInt(size[0]);
        col=Integer.parseInt(size[1]);
        char[][] board = new char[row][col];
        
        for (int r=0; r<row; r++) {
            board[r]=readFile.nextLine().toCharArray();
        }
        
        for (int r=0; r<row; r++) {
            for (int c=0; c<col; c++) {
                if(board[r][c]=='e'){
                    spr=r;
                    spc=c;
                }
            }
        }
              
        if(findWay(board,spr,spc,row,col)==true){
            board[spr][spc]='e';
            for (int r=0; r<row; r++) {
                for (int c=0; c<col; c++) {
                    System.out.print(board[r][c]);
                }
                System.out.println("");
            }
        }
        
    }    

    public static boolean findWay(char[][] board, int r, int c, int row, int col) {
        
        if(r<0 || r>row || c<0 || c>col){
            return false;
        }
        if(board[r][c]=='x'){
            System.out.println("Exit was Found!");
            return true;
        }
        if(board[r][c]=='%' || board[r][c]=='+'){
            return false;
        }
        board[r][c]='+';
        if(findWay(board,r-1,c,row,col)==true){
            return true;
        }
        if(findWay(board,r+1,c,row,col)==true){
            return true;
        }
        if(findWay(board,r,c-1,row,col)==true){
            return true;
        }
        if(findWay(board,r,c+1,row,col)==true){
            return true;
        }
        board[r][c]='.';
        return false;    
    }   
}
