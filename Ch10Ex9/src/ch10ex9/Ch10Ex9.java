package ch10ex9;



public class Ch10Ex9 {

    public static void main(String[] args) {
        //String[][] table = new String[5][5];
        String [][] table = {{"1,2,3,4,5"},{"1,2,3,4,5"},{"1,2,3,4,5"},{"1,2,3,4,5"},{"1,2,3,4,5"}};
        
        for (int R=0; R<table.length; R++) {
            for (int C=0; C<table[0].length; C++) {
                System.out.println(table[R][C]);
            }
        }
        System.out.println("");
    }
    
}
