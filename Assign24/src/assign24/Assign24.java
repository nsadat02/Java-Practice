package assign24;

import java.util.*;

public class Assign24 {

    public static void main(String[] args) {
        int num;
                
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        
        while(scores.size()<6){
            System.out.println("Enter a score: (Enter -1 to end)");
            num=input.nextInt();
            if(num==-1 && scores.size()>=3){
                break;
            }
            else if(num==-1){
                break;
            }
            else{
                scores.add(num);
            }
        }
        
        if(scores.size()>=3 && scores.size()<=6){
            program(scores);
        }
        else{
            System.out.println("The Program was Cancelled. Insufficient Information. Try Again!");
        }
    }

    public static void program(ArrayList<Integer> scores) {   
        int j;
        for (int i=0; i<scores.size()-1; i++) {
            j=i;
            while(j>=0 && scores.get(j)>scores.get(j+1)){
                Collections.swap(scores,j,j+1);
                j--;
            }
        }
        
        int[][] store = new int[scores.size()][scores.size()];
        int[] sum = new int[scores.size()];
        System.out.println("");
        
        for (int i = 0; i<scores.size(); i++) {
            System.out.print(scores.get(i)+"\t");
        }
        System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        for (int i=0; i<scores.size(); i++) {
            for (int c=0; c<scores.size(); c++) {
                if(i!=c){
                    store[i][c]=(scores.get(i)-scores.get(c));
                    sum[i]+=(scores.get(i)-scores.get(c));
                }
            }
        }
        
        for (int i=0; i<store.length; i++) {
            for (int c=0; c<store.length; c++) {
                if(store[i][c]==0){
                    for (int a=c; a<store.length-1; a++) {
                        store[i][a]=store[i][a+1];
                    }
                }    
            }
        }
        
        for (int i = 0; i < store.length-1; i++) {
            for (int k = 0; k < store.length; k++) {
                System.out.print(store[k][i]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        for (int i = 0; i<sum.length; i++) {
            System.out.print(sum[i]+"\t");
        }
        System.out.println("");
    }    
}
