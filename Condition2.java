//wap to check given number is positive neg or zero
import java.util.Scanner;
class Condition2{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter n1");
	  

	int n1=sk.nextInt();
	
	if(n1>0){ 
	
	System.out.println("n1 is +ve");
	System.out.println("this is if 1");
         }
	
	if(n1<0){
	System.out.println("n1 is -Ve");
	System.out.println("this is if 2");
		}
	if(n1==0){
	System.out.println("n1 is 0");
	System.out.println("this is if 3");
	}

	if(n1%2==0 && n1>0){
	
	System.out.println("number is even");
	}
	

	if(n1%2!=0){
	
	System.out.println("number is odd");
	}
	
	}
}