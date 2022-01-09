package pkg2019s1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];
        
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[1][0] = 3;
        grid[1][1] = 4;
        
        for (int r=0; r<2; r++) {
            for (int c=0; c<2; c++) {
                System.out.print(grid[r][c]);
            }
            System.out.println("");
        }
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 'h' for a horizontal flip and enter a 'v' for a vertical flip: ");
        String in=input.next();
        
        int counth=0,countv=0;
        
        for (int i=0; i<in.length(); i++) {
            if((in.substring(i,i+1)).contains("h")){
                counth++;
            }
            else if((in.substring(i,i+1).contains("v"))){
                countv++;
            }
        }
        System.out.println(counth+"");
        System.out.println(countv+"");
        if(counth%2!=0){
            
        }
    }
    
    
}
