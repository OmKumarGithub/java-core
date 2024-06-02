package Array;

public class Array_Creation {
    public static void main(String[] args) {
        
        // new is used for dynamic memory allocation mostly  in heap 
        // identifier wil be in stack and will to location of the data in heap
        int[][] a = new int[5][3];

        // if we directly print an array it will give 
        //  [I@3aef
        // [I denotes that it is a type of int array not intger array
        // @3aef will be the unique hexa decimal number given by jvm to these object to easily identify them
        // @3aef this also known as hashcode ..it does not mean location


        int[] b = new int[0];
        int[] c = new int[-3];//  there will be no compile time errors bcoz java at run time just check if the number provide is int or not
        // but there will be an run time error
        int[] d = new int['a'];//internally converts it into int
        // int[]e =new int[10l]; //it will not run as the should be int





        // suppose you a data which is like
        // 30 ,20 ,10 ,40
        // 10 ,30
        //50 .50 , 30

        //in this using matrices will be a waste of memory 
        // thats why we use ararys of arrays

        int[][] e = new int [5][];
        // we do not give second value 
        //and if we want to find length of e then it will be 5

        System.out.println(e);//ouput [I@dsvbkjf
        System.out.println(e[0]);//null
 
    }
}
