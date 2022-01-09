package ch12ex7;

import java.util.*;
import java.io.*;

public class Ch12Ex7 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line = null,sen = null;
        String[] newLine = null;
        
        BufferedReader html = new BufferedReader(new FileReader("HTML.txt"));
        
        System.out.println("Part A: \n");
        //partA(newLine,line,sen,html);
        System.out.println("Part B: \n");
        partB(newLine,line,sen,html);

        
    }

    public static void partA(String[] newLine, String line, String sen, BufferedReader html) throws IOException {
        
        while((line=html.readLine())!=null){
            newLine=line.split("<");
        
            for (int i = 0; i<newLine.length; i++) {
                sen=newLine[i];
                //System.out.println(sen+"");
                if((sen.substring(0,3)).contains("br>")){
                    System.out.println(sen.substring(3,sen.length()));                
                }
                else if((sen.substring(0,2)).contains("p>")){
                    System.out.println("\n"+sen.substring(2,sen.length()));
                }
                else if((sen.substring(0,3)).contains("hr>")){
                    System.out.println("--------------------------------------------");
                }
                else{
                    System.out.println(sen);
                }
            }       
        }
        //html.close();
    }

    public static void partB(String[] newLine, String line, String sen, BufferedReader html) throws IOException {
        
        while((line=html.readLine())!=null){
            newLine=line.split("<");
        
            for (int i = 0; i<newLine.length; i++) {
                sen=newLine[i];
                //System.out.println(sen+"");
                if(sen.length()>38){
                    if((sen.substring(0,3)).contains("br>")){
                        int lp=sen.substring(0,38).lastIndexOf(" ");
                        //System.out.println(lp+"");
                        System.out.println(sen.substring(3,lp));
                        System.out.println(sen.substring(lp+1,sen.length()));
                    }
                    else if((sen.substring(0,2)).contains("p>")){
                        int lp=sen.substring(0,37).lastIndexOf(" ");
                        System.out.println("\n"+sen.substring(2,lp));
                        System.out.println(sen.substring(lp+1,sen.length()));
                    }
                }
                else{
                    if((sen.substring(0,3)).contains("br>")){
                        System.out.println(sen.substring(3,sen.length()));                
                    }
                    else if((sen.substring(0,2)).contains("p>")){
                        System.out.println("\n"+sen.substring(2,sen.length()));
                    }
                    else if((sen.substring(0,3)).contains("hr>")){
                        System.out.println("--------------------------------------------");
                    }
                    else{
                        System.out.println(sen);
                    }
                }
            }        
        }
        //html.close();
        
    }
    
}
