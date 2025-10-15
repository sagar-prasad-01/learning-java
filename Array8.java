//wap to convert given decimal number to binary number;
import java.util.Scanner;
class Array8{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int num[]=new int[10];
	int i=0;
	while(n>0){
	int r=n%2;
	num[i]=r;
	i++;
	n=n/2;
	}

	System.out.println("binery number");
	for(i=i-1;i>=0;i--){
	System.out.print("\t"+num[i]);
	}


	}}
	