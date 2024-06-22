package Design_pattern;

public class simple_factory {
    public static void main(String[] args) throws Exception {
         Object o = Class.forName(args[0]).getDeclaredConstructor().newInstance();

    }
}
