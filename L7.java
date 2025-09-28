//wap to reverse a number
import java.util.Scanner;
class L7{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.print("enter number : ");
	int n=sk.nextInt();
	int sum=0;
	int cnt=0;
	int rev=0;
	while(n>0){
	int r=n%10;
	sum=sum+r;
	
	n=n/10; 
	rev=rev*10+r;
	cnt++;
	}
	
	System.out.println("sum = "+sum);
	System.out.println("reverse : "+rev);
	System.out.println("number of digit : "+cnt);	
	}

}