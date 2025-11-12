/*
//Q1
import java.util.Scanner;
class AssignmentLoop{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int temp=n;
	int sum=0;
	while(n>0){
	int r=n%10;
        sum=sum*10+r;
	n=n/10;
	}
	if(sum==temp){
	System.out.println("number is palindrome");
	}
	else{
	System.out.println("enter number is not palindrome");	
	}

}}


//Q3
	import java.util.Scanner;
	class AssignmentLoop{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int temp=n;
	int sum=0;
	while(n>0){
	int r=n%10;
        sum=sum+r;
	n=n/10;
	}
	if(temp%sum==0){
	System.out.println(temp+"  is divisible by sum of its digits");
	}
	else{
	System.out.println(temp+"  is notdivisible by sum of its digits");
	}
}}

//Q4
	import java.util.Scanner;
	class AssignmentLoop{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter n1 number");
	int n=sk.nextInt();
	System.out.println("enter n2 number");
	int n2=sk.nextInt();
	int temp=n;
	int sum=0;
	while(n>0){
	int r=n%10;
	temp=temp*r;
	n=n/10;
	}
	if(temp==n2){
	System.out.println(temp+"  is a seed of"+n2);
	}
	else{
	System.out.println(temp+"  is not a seed of"+n2);
	}
}}

*/
//Q5
import java.util.Scanner;
class AssignmentLoop{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int temp=n;
	int k=temp;
	double sum=0;
	int cnt=0;
	while(k>0){
	cnt++;
	k=k/10;
	}
	while(n>0){
	double r=n%10;
	sum=sum+Math.pow(r,cnt);
	n=n/10;
	}
	if(sum==temp){
	System.out.println(temp+" number is an armstrong number");
	}
	else{
	System.out.println(temp+" enter number is not armstrong");	
	}
}}



