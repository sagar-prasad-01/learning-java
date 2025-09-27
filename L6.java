//wap to print sum of digit of given number
import java.util.Scanner;
class L6{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.print("enter number : ");
	int n=sk.nextInt();
	int sum=0;
	while(n>0){
	int r=n%10;
	sum=sum+r;
	n=n/10;
	
	}
	
	System.out.println("sum = "+sum);	
	}

}