package Programs;

//public class Variables {
//
//}
class A{
    int data=50;//instance variable
    static int m=100;
    void method(){
        int n=90;
    }
    
}

class Add{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
        
    }
}

class Widening{
    public static void main(String[] args) {
        int a=20;
        float f=a;
        System.out.println(a);
        System.out.println(f);
    }
        
}

class Narrowing{
    public static void main(String[] args) {
        float f=10.5f;
        int a=(int)f;
        System.out.println(f);
        System.out.println(a);

    }
}

class Overflow{
    public static void main(String[] args) {
        int a=130;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);

    }
}

class AddLowerType{
    public static void main(String[] args) {   
        byte a=10;
        byte b=10;
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}





