//wap to check given number is  perfect or not
import java.util.Scanner;
class L10{
  public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int i=1;
	int sum=0;
	while(i<n){
	if(n%i==0){
	sum=sum+i;
	}
	i++;
	
	}
	
	if(sum==n){
	System.out.println("this is perfect number");
	}
	else{
	System.out.println("not a perfect number");
	}
	
	}

}