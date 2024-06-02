package Array;

public class Array_intialisation {
    public static void main(String[] args) {
        

        int[] a = {1,2,5,3,5};  // internally it is getting declared then created and then intialised


        // cannot be like this
        // int[] x;
        // x={10,32,50};

        int[] b = new int[]{1,2,5,6};

        // we use array.length not array.length()
        // /length is used for string


        // annoymous array 
        om(new int[]{1,2,6,5,8,6});

    }
    public static void om(int[] arr){

    }
}
