package OOPS;

public class MainClass 
{
	
	public static void main(String[] args) {
		Operations op=new Operations();
		op.sum();
	}
}

 class Operations {
	
	int a=10;
	int b=20;
	
	public int sum() {
		int c=a+b;
		System.out.println(c);
		return c;
	}
}
