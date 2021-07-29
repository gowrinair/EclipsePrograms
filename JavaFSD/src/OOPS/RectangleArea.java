package OOPS;

public class RectangleArea {
	double length;
	double breadth;
	
	RectangleArea(double l,double b){
		length=l;
		breadth=b;
	}
	
	double area() {
		double area=length*breadth;
		System.out.println("Area: "+area);
		return area;
	}

}
