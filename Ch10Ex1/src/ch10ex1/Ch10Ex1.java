package ch10ex1;



public class Ch10Ex1 {

    public static void main(String[] args) {
        int num[] = new int[25];
        int div;
        boolean even=true;
        
        for (int c=0; c<num.length; c++){
            num[c]=(int)(Math.random()*99);
            div=num[c]%2;
            if(div==0){   
            }
            else{
             even=false;
            }
        }
        if(even==false){
            System.out.println("Odd:");
            System.out.println(num);
        }
        else{
            System.out.println("Even:");
            System.out.println(num);
        }
        
    }
    
}
