package ExceptionHandling;

public class TryCatch {
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception 
        System.out.println("rest of the code");
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
          
    }  

}
