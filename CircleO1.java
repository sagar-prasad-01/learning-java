import java.util.Scanner;
class CircleO1{

	float r;
	void getData(){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter radious of circle : ");
	r=sk.nextFloat();
	}

	void showData(){
	System.out.println("radious "+r);
	}

	float area(){
	return 3.14f*r*r;
	}

	float circ(){
	return 2*3.14f*r;
	}


	public static void main(String args[]){
	CircleO1 c=new CircleO1();
	c.getData();
	c.showData();
	System.out.println("area of circle "+c.area());
	System.out.println("area of circle "+c.circ());

	}

 }