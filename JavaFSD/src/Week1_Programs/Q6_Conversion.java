package Week1_Programs;

public class Q6_Conversion {
	public static void main(String[] args) {
		//character to string
		char c='g';
		String s=Character.toString(c);
		System.out.println("String is: "+s);
		
		//string to character
		String s1="Hello_world";
		int len=s1.length();
		for(int i=0; i <len;i++)
		{ 
	        char ch = s1.charAt(i);
	        System.out.println("Character at "+i+" Position: "+ch);
	    }
		
		//character to int variable
		char c1='b';
		int i=c1;
		System.out.println("Integer conversion of c1: "+i);
		
		//int to character
		int num=70;
		char c2=(char)num;
		System.out.println("Character conversion of num: "+c2);
		
		
		//long to int
		long num1=1000;
		int i1=(int)num1;
		System.out.println("Integer conversion of long: "+i1);
		
		
		//int to long
		int i2=10;
		long num2=i2;
		System.out.println("Int to long: "+num2);
		
		//boolean to string
		boolean b=true;
		String s2=Boolean.toString(b);
		System.out.println("Boolean to string: "+s2);
		
		//string to boolean
		String s3="true";
		Boolean b1=Boolean.getBoolean(s3);
		System.out.println("Boolean conversion of string: "+b1);
		
		//string to int
		String s4="10";
		int i3=Integer.parseInt(s4);
		System.out.println("String to int: "+i3);
		//System.out.println(s4+20);
		//System.out.println(i3+20);
		
		//int to string
		int i4=10;
		String s5=String.valueOf(i4);
		System.out.println("int to string: "+s5);
		
		
		//int to double
		int i5=100;
		double d=i5;
		System.out.println("int to double: "+d);
		
		
		//double to int
		double d1=20.0;
		int i6=(int) d1;
		System.out.println("double to int : "+i6);
		
		//string to double
		String s6="20";
		double d2=Double.parseDouble(s6);
		System.out.println("String to double: "+d2*10);
		
		//double to string
		double d3=20.0;
		String s7=Double.toString(d3);
		System.out.println("Double to string: "+s7+10);
		
		
		//primitive types to object
		int i7=10;
	    double d4 = 20.0;
	    boolean b2=true;
	    Integer var1 = Integer.valueOf(i7);
	    Double var2 = Double.valueOf(d4);
	    Boolean var3 = Boolean.valueOf(b2);
	    if(var1 instanceof Integer)
	        System.out.println("Integer value");
	    if(var2 instanceof Double)
	        System.out.println("Double value.");
	    if(var3 instanceof Boolean) {
	        System.out.println("Boolean value");
	      }

	    
		
		
	}

}
