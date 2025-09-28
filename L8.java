//wap to reverse a number
import java.util.Scanner;
class L8{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.print("enter number : ");
	int n=sk.nextInt();
	int n1=n;
	int rev=0;
	while(n>0){
	int r=n%10;
	n=n/10; 
	rev=rev*10+r;
	}
	
	
	if(rev==n1){
	System.out.println("number is plandrome");
	}
	
	else{
	System.out.println("number is not plandrome");
	}	
	}

}