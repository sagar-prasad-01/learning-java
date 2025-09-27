//wap to print sum of first five numbers
import java.util.Scanner;
class L4{
	public static  void main(String args[]){

	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int i=1;
	int sum=0;
	while(i<=n){
	sum=sum+i;
	i++;
	}
	System.out.println("sum="+sum);	
	}

}