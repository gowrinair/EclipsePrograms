package OOPS;

class TestRectangle2{  
	
	 public static void main(String args[]){  
		 RectangleEx r1=new RectangleEx();
		 RectangleEx r2=new RectangleEx();//creating two objects  
	  r1.insert(11,5);  
	  r2.insert(3,15);  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
}
 class RectangleEx {
	 int length;  
	 int width;  
	 
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 
	 }  
	 
	 void calculateArea(){
		 System.out.println(length*width);}  
	 }  

	



