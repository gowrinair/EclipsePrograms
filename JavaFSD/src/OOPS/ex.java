package OOPS;

public class ex {
	public static void main(String[] args) {
		System.out.println("hello");
		demo d=new demo();
		System.out.println(d.a);
		//System.out.println(d.b);
		d.msg();
	}
	

}

 class demo{
	//final int a=10;
	 int a=10;
	public void msg(){
		int b=10;
		a=a+1;
		System.out.println("hai"+a);
	}
}
