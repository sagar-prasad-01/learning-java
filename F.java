//wap to print factorial of given number
import java.util.Scanner;
class F{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int cnt=0;
	while(n!=0){
	int r=n%10;
	n=n/10;
	int n1=n;
	while(n1!=0){
	int r1=n1%10;
	if(r==r1){
	cnt++;
	}
	n1=n1/10;

	}
	}
	if(cnt>0){
	System.out.println("not a uniq number");
	}
	else{
	System.out.println("uniq number");
	}

	}
}