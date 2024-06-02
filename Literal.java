public class Literal {
    public static void main(String[] args) {
        int x = 10; // here 10  is literal 

        // decimal literal
        int y =10;


        //octal form
        int z = 010;

        //hexa decimal form
        int a = 0x10; // i know java is case sensitive but in some cases it is not ,this is the example of java not being case sensitive
        //you can x or X it does not matter 

        int b = 0xface ;
        int c = 0xbeef;
        // int d = 0xbeer ;              wrong r can not be a part of hexadecimal form 

        int d = 10;
        int e = 010;
        int f =0x10;

    System.out.println(d+e+f);
    // print statement will always change format to decimal form
    // output 10 +8 +16 = 34


    long g = 0x10l;


    double h = 01.1 ;//what will java consider it 1.1 or a octal double
    //it will consider  double

    double i = 1.2e3;



    // char range is 0 to 65535
    char ch =97;//output a

    char ch1 = 0xface ;

    char ch2 = '\u0061'; // char can also be defined like this number are in the form hexa decimal

    // every escape character is a char 

    char ch3 = '\n';


    // binary literal came after 1.7v 
    int bi = 0b111;

    // underscore is used for readability 
    double dd =1_23_4;
    // underscore cannot be on last ,first and before decimal

    
    }
}
