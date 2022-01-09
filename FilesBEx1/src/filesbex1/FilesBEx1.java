package filesbex1;

import java.util.*;
import java.io.*;

public class FilesBEx1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line = null;
        String[] wl = null;
        boolean quit=false;
        int choose;
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> empinfo = new ArrayList<>();
        
        while(quit==false){
        System.out.println("\n1. Open File");
        System.out.println("2. Save File");
        System.out.println("3. Add a Record");
        System.out.println("4. Delete a Record");
        System.out.println("5. Modify a Record");
        System.out.println("6. Display All");
        System.out.println("7. Quit");
        
        choose=input.nextInt();
        if(choose==1) openFile(empinfo);
        if(choose==2) saveFile(empinfo);
        if(choose==3) addRecord(wl,input,empinfo);
        if(choose==4) deleteRecord(wl,input,empinfo);
        if(choose==5) modifyRecord(wl,input,empinfo);
        if(choose==6) displayAll(wl,line);
        if(choose==7) quit=true;
        }  
    }
    
    private static void openFile(ArrayList<String> empinfo) throws FileNotFoundException, IOException {
        String[] wl;
        String line;
        
        BufferedReader ReadFile = new BufferedReader(new FileReader("employee.txt"));    
        
        while((line=ReadFile.readLine())!=null){
            //System.out.println(Line);
            empinfo.add(line);
        }
        ReadFile.close();      
    }
    
    private static void saveFile(ArrayList<String> empinfo) throws IOException {
        
        BufferedWriter writeFile = new BufferedWriter(new FileWriter("employee.txt"));
        
        for(int c=0; c<empinfo.size(); c++){
            writeFile.write(empinfo.get(c));
            writeFile.newLine();
        }
        writeFile.close();       
    }

    public static void addRecord(String[] wl, Scanner input, ArrayList<String> empinfo) throws IOException {
        String num,ename,mars,eage,esal;
        
        System.out.println("Enter Employee's Number: ");
        num=input.next();     
        System.out.println("Enter Employee's Name: ");
        ename=input.next();       
        System.out.println("Enter Employee's Marital Status: ");
        mars=input.next();     
        System.out.println("Enter Employee's Age: ");
        eage=input.next();       
        System.out.println("Enter Employee's Wage");
        esal=input.next();
        
        empinfo.add(num+","+ename+","+mars+","+eage+","+esal);       
    }

    private static void deleteRecord(String[] wl, Scanner input, ArrayList<String> empinfo) throws FileNotFoundException, IOException {
        int count=1,sel,num=1;
        String line;
        
        ArrayList<String> name = new ArrayList<>();        
        BufferedReader ReadFile = new BufferedReader(new FileReader("employee.txt"));
        
        while((line=ReadFile.readLine())!=null){
            wl=line.split(",");
            for (int i = 0; i < wl.length; i++) {
                if(count==2){
                    name.add(wl[i]);
                    count++;
                }
                else if(count==5){
                    count=1;
                }
                else{
                    count++;
                }
            }
        }
        
        System.out.println("Please Select Which Employee Info to Delete: ");
        for (int i=0; i<name.size(); i++) {
            System.out.println(num+". "+name.get(i));
            num++;
        }
        sel=input.nextInt();       
        empinfo.remove(sel-1);
    }

    private static void modifyRecord(String[] wl, Scanner input, ArrayList<String> empinfo) throws FileNotFoundException, IOException {
        int count=1,sel,num=1;
        String empnum,nam,mars,age,sal;
        String line;
        
        ArrayList<String> name = new ArrayList<>();        
        BufferedReader ReadFile = new BufferedReader(new FileReader("employee.txt"));
        
        while((line=ReadFile.readLine())!=null){
            wl=line.split(",");
            for (int i = 0; i < wl.length; i++) {
                if(count==2){
                    name.add(wl[i]);
                    count++;
                }
                else if(count==5){
                    count=1;
                }
                else{
                    count++;
                }
            }
        }
        
        System.out.println("Please Select Which Employee Info to Modify: ");
        for (int i=0; i<name.size(); i++) {
            System.out.println(num+". "+name.get(i));
            num++;
        }
        sel=input.nextInt(); 
        
        System.out.println("\nEmployee's Number: ");
        empnum=input.next();
        
        System.out.println("Employee's Name: ");
        nam=input.next();
        
        System.out.println("Employee's Marital Status: ");
        mars=input.next();

        System.out.println("Employee's Age: ");
        age=input.next();

        System.out.println("Employee's Salary: ");
        sal=input.next();
        
        empinfo.set(sel-1,empnum+","+nam+","+mars+","+age+","+sal);     
    }

    private static void displayAll(String[] wl, String line) throws FileNotFoundException, IOException {
        int count=0;
        
        System.out.println("Employee #"+"\tEmployee Name"+"\tMarital Status"+"\tAge"+"\t\tSalary");       
        BufferedReader ReadFile = new BufferedReader(new FileReader("employee.txt"));
        
        while((line=ReadFile.readLine())!=null){
            wl=line.split(",");
            for (int i = 0; i < wl.length; i++) {
                if(count%5==0){
                    System.out.print("\n"+wl[i]);
                    count++;
                }
                else{
                    System.out.print("\t\t"+wl[i]);
                    count++;
                }
            }
        }    
        //System.out.println(en.get(i)+"\t\t"+name.get(i)+"\t\t"+ms.get(i)+"\t\t"+age.get(i)+"\t"+wage.get(i));        
    }       
}
