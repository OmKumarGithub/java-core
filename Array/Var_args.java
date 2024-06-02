package Array;

public class Var_args {
    
    public static void arr1(String... a) {}
    public static void arr2(String      ...a) {}
    public static void arr3(String...a) {}


    // public static void arr(String.a..) {}              // wrong

    // var args should always be in last of the parameter
    public static void arr4(String a,int ... b) {}
    // public static void arr5(String ...a,int ... b) {}            wrong



    // method overloading
    public static void om(int... a) {}
    public static void om(int a) {}
    public static void main(String[] args) {
        om(10,20,3,0); //var args method will run
        om(); //varargs will run
        om(10);//single parameter wala om function
    }

}
