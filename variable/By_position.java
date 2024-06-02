package variable;



// instance variable
//static variable 
// local variable 

public class By_position {

    //default value will be saved by the jvm if not given by developer
    // because static and instance variable are important 
    int x ;                //instance variable are known as object level variable 
    static String s ;      //static variable is known as class level varibe;
    public static void main(String[] args) {

        int y ; // error:y value may not have been intialised
        // local variable are also known as
        //temporary varible
        //stack variable
        //automatic variable
        //thread safe varible *****************




        // ******************************* *********
        int a;
        if(args.length >1){
            a=10;
        }
        System.out.println(a);
        // ***************************************
// output will be a might not have been intilaised
// because there is still a chance that a migh not have intilaised

// ************************************************* 
// local variable can ony use final modifier other than it cannot use any modifier 
final int b =10;
// *************************************************
    }
}
