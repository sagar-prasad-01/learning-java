//wap to make basic calc using Switch
import java.util.Scanner;
class Switch2{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("press + for addition");
	System.out.println("press - for subtraction");
	System.out.println("press * for multiplication");
	System.out.println("press / for division");
	char choice=sk.next().charAt(0);
	
	System.out.println("enter num 1"); 
	int n1=sk.nextInt();
	System.out.println("press num 2");
	int n2=sk.nextInt();
	

	switch(choice){
	case '+':
		System.out.println("addition="+(n1+n2));
	break;
	case '-':
		System.out.println("subtraction="+(n1-n2));
	break;
	case '*':
		System.out.println("multiplication="+(n1*n2));
	break;
	case '/':
		System.out.println("division="+(n1/n2));
	break;
	
	default:
	System.out.println("invalid choice");



	}
	
	
	
	
	

	}
}