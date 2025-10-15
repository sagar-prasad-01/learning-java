//array learning
//wap to count number of positive elements and negative numbers from the given array
import java.util.Scanner;
class Array7{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sk.nextInt();
	int num[]=new int[n];
	for(int i=0;i<n;i++){
	System.out.println("enter elements of index "+i);
	num[i]=sk.nextInt();
	}


	int even=0,odd=0;
	for(int i=0;i<num.length;i++){
	if(num[i]%2==0){
	even++;
	}
	else{
	odd++;
	}
	
	}
	System.out.println("even numbers = "+even);
	System.out.println("odd numbers =  "+odd);

	}
}