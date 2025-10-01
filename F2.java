//wap to print factorial of given number
import java.util.Scanner;
class F2{
	public static void main(String args[]){
	Scanner sk = new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int fct=1;
	for(int i=n;i>=1;i--){
	fct=fct*i;
	}
	
	System.out.println("factorial ="+fct);

}}