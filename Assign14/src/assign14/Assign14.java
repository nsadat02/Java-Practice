package assign14;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Assign14 {
    public static void main(String[] args) {
        int list[] = new int[10];
        String var;
        
        Scanner in = new Scanner(System.in);
        Random r = new Random();
    
    list[0] = r.nextInt(10);
    
    for(int newestNum = 0; newestNum < list.length; ++newestNum) {
        list[newestNum] = r.nextInt(10);

        for( int checkNum = 0; checkNum < newestNum; ++checkNum ) {
            while( list[checkNum] == list[newestNum] ) {
                list[newestNum] = r.nextInt(10);
                checkNum = 0;
            }
        }
        System.out.print(list[newestNum]+" ");
    }       
}
}    
