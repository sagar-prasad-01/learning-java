/*
import java.util.Scanner;
class Test3{
	public static void main(String args[]){
     	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int sum=0;
	int mul=1;
	while(n>0){
	int r=n%10;
	sum=sum+r;
	mul=mul*r;
	n=n/10;
	}

	System.out.println(mul);
	System.out.println(sum);
	if(sum==mul){
	System.out.println("enter number is spy number");
	}
	else{
	System.out.println("enter number is  not spy number");
	}
}}

*/

import java.util.Scanner;
class Test3{
	public static void main(String args[]){
     	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int sum=0;
	for(int i=n-1;i>0;i--){
	if(n%i==0){
	sum=sum+i;
	}
	}
	if(sum>n){
	System.out.println("enter number is abundant number");
	}
	else{
	System.out.println("enter number is  not abundant number");
	}

}}




