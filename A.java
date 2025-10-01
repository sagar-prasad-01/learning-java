
//Q1
class A{
	public static  void main(String args[]){
	int n=-5;
	do{
	 	System.out.println(n);
		n++;
	}while(n<=5);

}}
/*
//Q2
class A41{
	public static  void main(String args[]){
	int n=100;
	do{
	 	System.out.println(n);
		n--;
	}while(n>=91);

}}

//Q3
class A41{
	public static  void main(String args[]){
	int n=80;
	do{
	 	System.out.println(n);
		n-=2;
	}while(n>=70);

}}

//Q4
class A41{
	public static  void main(String args[]){
	int n=10;
	do{
	 	System.out.println(n+" "+"Square is :"+n*n);
		n+=2;
	}while(n<=20);

}}

//Q5
class A41{
	public static  void main(String args[]){
	int n=1;
	do{
	 	System.out.println("cube of "+n+" = "+n*n*n);
		n+=2;
	}while(n<=10);

}}

//Q6
import java.util.Scanner;
class A{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int sum=0;
	int mul=1;
	int r;
	
	do{
	 r=n%10;
	 sum=sum+r;
	 mul=mul*r;
	 n=n/10;
		
	}while(n>0);
	
	if(sum==mul){
	 System.out.println("entered number is spy number");
	}
	else{
	System.out.println("entered number is not spy number");
	}

}}
*/