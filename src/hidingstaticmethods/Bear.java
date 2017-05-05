
package hidingstaticmethods;
//Over-ridden vs Hiding Methods.
public class Bear {
   // Over-Ridden.
    public  boolean isBiped(){  //this function is over-ridding so at runtime method of child class will be accessd.
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on two legs-- "+ isBiped());
    }
    
    // Date Hiding .
    public static  boolean isBiped1(){  // In data hiding when isBiped is called only current class method will be run.
        return false;                   //parents method will be hided.
    }
    public void getMarsupialDescription1(){
        System.out.println("Marsupial walks on two legs-- "+ isBiped1());}
}
