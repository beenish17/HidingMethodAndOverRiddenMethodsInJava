
package hidingstaticmethods;

public class HidingStaticMethods {

    public static void main(String[] args) {
       Panda joey=new Panda();
       
       joey.getMarsupialDescription();      //calling method through child class.
       joey.getKangrooDescription();
       System.out.println("------------------------------------------------------------------ ");
       Panda joey1=new Panda();
        System.out.println(" ");
        joey1.getMarsupialDescription1();
        joey1.getKangrooDescription1();
 
    }
    
}
