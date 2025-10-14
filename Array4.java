//array learning
import java.util.Scanner;
class Array4{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sk.nextInt();
	int num[]=new int[n];
	for(int i=0;i<n;i++){
	System.out.println("enter elements of index "+i);
	num[i]=sk.nextInt();
	}

	for(int i=0;i<num.length;i++){
	System.out.printf("\n elements of index %d = %d",i,num[i]);
	
	}
	System.out.println("\nsize of array="+num.length);

	}
}