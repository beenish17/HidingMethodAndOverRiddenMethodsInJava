
package hidingstaticmethods;

public class Panda extends Bear{
    
    
    public  boolean isBiped(){          //this function is over-ridding so at runtime method of child class will be accessd.
        return true;
    }
    public void getKangrooDescription(){
        System.out.println("kangroo hops on two legs-- "+ isBiped());
    }
    
    //Data hiding
    public static  boolean isBiped1(){  
        return true;
    }
    public void getKangrooDescription1(){
        System.out.println("Kangroo walks on two legs-- "+ isBiped1());
    }

   
}
