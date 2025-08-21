//wap to calculate area and circumfrance of circle by user input
import java.util.Scanner;
class A3{
	public static void main(String args[]){
	float r,ar,cr; 	
	Scanner s=new Scanner(System.in);
	System.out.println("enter radious");
	r=s.nextFloat();
	ar=3.14f*r*r;
	cr=2*3.14f*r;
	System.out.println("area of circle="+ar);
	System.out.println("circum of circle="+cr);
	

}

}
