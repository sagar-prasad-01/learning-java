//wap to print sum and avg of given array
//array learning
import java.util.Scanner;
class Array5{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sk.nextInt();
	int num[]=new int[n];
	for(int i=0;i<n;i++){
	System.out.println("enter elements of index "+i);
	num[i]=sk.nextInt();
	}
	int sum=0;

	for(int i=0;i<num.length;i++){
	sum=sum+num[i];
	System.out.printf("\n elements of index %d = %d",i,num[i]);
	
	}
	System.out.println("\nsize of array="+num.length);

	double avg=sum/(float)n;
	System.out.println("sum = "+sum);
	System.out.println("average= "+avg);


	}
}