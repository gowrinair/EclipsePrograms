package Inheritance_OOPS;

//Hierarchical Inheritance---- B & C to A
public class TestInheritance3 {
	public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
		}


}
class Animal2{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dog2 extends Animal2{  
	void bark(){
		System.out.println("barking...");
	}  
}  
class Cat extends Animal2{  
	void meow(){
		System.out.println("meowing...");
	}  
}  

