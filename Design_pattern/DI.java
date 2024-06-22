package Design_pattern;



// dependency injection ............
// if we define inside a method         A a =new Helper1();
// we are right now using Helper1 but Supoose in future I want to change that, I want use Helper2 than what shoul i do .......

// it should be simple just change A a =new Helper2(); ..........problem solved 
// NO
// /In this example we have change to a  single dependency ,just to change a single dependency we are going inside the business logic file and changing it 
// there is another issue ........there is no standard defination for helper 1 and helper 2 both can have different method 
// the problem is when you will change helper1 to helper 2 there is no guarantee that the function which was in helper 1 would be present in Helper2 


// Independence injection Application will become into two parts one which will have your main implementation and second part will have the dependency implementation
// Two parts what does part means ?Part means two different jvm or  two different server
// Without dependency injection we have to recompile Rebuild and then redeploy this is so much taxing
// But when we use dependency injection we just need to change the dependency server which means our main server just need redeploying
// These two servers will be connecting or contacting themselves with the technology of rmi jndi serilisation and deserialization Remote and home files  





public class DI {
    public static void main(String[] args) {
        
    }
}
