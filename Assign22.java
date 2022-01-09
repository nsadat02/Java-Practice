package assign22;

import java.util.Scanner;
import java.util.ArrayList;

public class Assign22 {

    public static void main(String[] args) {
        String name;
        int mark;
        boolean end=true;
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();
        
        while(end==true){
            System.out.println("Enter the students name: ");
            name=input.next();
            System.out.println("Enter the students mark: (Enter -1 to get results)");
            mark=input.nextInt();
            
            
            if(mark==-1 || name.contains("-1")){
                end=false;
                break;
            }
            if (mark<=100 && mark>=0){
                names.add(name); 
                marks.add(mark);
                
            }
            else{
                System.out.println("Error Running. Try Running Program Again!");
                break;
            }
        }
        
        arithmetic.calcMean(marks);
        arithmetic.calcMedian(marks, names);
        arithmetic.calcMode(marks, names);
        
        
    }
    
}
