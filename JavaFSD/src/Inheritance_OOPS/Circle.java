package Inheritance_OOPS;


public class Circle {
	 Operation op;//aggregation  --Circle has a relationship with Operation
	 double pi=3.14;  
	    
	 double area(int radius){  
	   op=new Operation();  
	   int rsquare=op.square(radius);//code re-usability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	  
	     
	    
	 public static void main(String args[]){  
	   Circle c=new Circle();  
	   double result=c.area(5);  
	   System.out.println(result);  
	 }  


}
class Operation{  
	 int square(int n){  
	  return n*n;  
	 }  
	}  

