package assign21;

import java.util.Scanner;
import java.util.ArrayList;

public class Assign21 {

    public static void main(String[] args) {
        String str,forw,rev="",letter ="",space="";
        
        Scanner input = new Scanner(System.in);
        
        ArrayList <String> forward = new ArrayList<>();
        ArrayList <String> reverse = new ArrayList<>();
        ArrayList <String> spaces = new ArrayList<>();
        ArrayList <String> line = new ArrayList<>();
        
        System.out.print("Enter a string:");
        str=input.nextLine();        
        System.out.println("\n");
        
        for (int i = str.length()-1; i>=0; i--) {
            letter+=str.substring(i,i+1);}
        
        for (int i=1; i<str.length()+1; i++) {
            forward.add(forw=str.substring(0,i));}
        
        for (int j=letter.length(); j>0; j--){
             int r=letter.length();
             reverse.add(rev=letter.substring(j,r));}
        
        for (int b=0; b<(str.length()+str.length()-1)/2; b++) {
            space+=" ";}

        for (int s=space.length(); s>=0; s--) {
            spaces.add(space.substring(space.length()-s,space.length()));}
       
        for (int i=0; i<reverse.size(); i++) {
            line.add(forward.get(i)+reverse.get(i));
            System.out.println(spaces.get(i)+""+line.get(i));}
        
        for (int i=line.size()-2; i>=0; i--) {
            System.out.println(spaces.get(i)+""+line.get(i));}
        
        for (int i=1; i<str.length(); i++) {
            System.out.println(space+""+(letter=str.substring(i,i+1)));}
        
    }
    
}
