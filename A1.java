//wap to print some of two  number from user input.
import java.util.Scanner;
class A1{
	public static void main(String args[]){
	//step2 create obj of Scanner class
	Scanner k=new Scanner(System.in);

	//step3 call Scanner class method via Object
	System.out.println("enter first num:");
	int n1=k.nextInt();
	System.out.println("enter sec num:");
	int n2=k.nextInt();
	int n3=n1+n2;
	System.out.println("sum="+n3);
	}


}