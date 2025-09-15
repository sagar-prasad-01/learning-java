//wap to check given number is positive neg or zero
import java.util.Scanner;
class Condition3{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter n1");
	int n1=sk.nextInt();

	System.out.println("enter n2");
	int n2=sk.nextInt();

	System.out.println("enter n3");
	int n3=sk.nextInt();
	
	if(n1>n2 && n1>n3){ 
	
	System.out.println("n1 is greater");
	
         }
	
	if(n2>n1 && n2>n3){ 
	
	System.out.println("n2 is greater");
	
         }

	if(n3>n2 && n3>n1){ 
	
	System.out.println("n3 is greater");
	
         }

	if(n1==n2 && n2==n3){ 
	
	System.out.println("all are equal");
	
         }

	
	
	}
}