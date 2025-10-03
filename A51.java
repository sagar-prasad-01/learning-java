/*
//assignment 5 of java
//Q1
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number 1");
	int n1=sk.nextInt();
	System.out.println("enter number 2");
	int n2=sk.nextInt();
	System.out.println("enter number 3");
	int n3=sk.nextInt();
	int r=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
	System.out.println("maximum in these three number : "+r); 
	
	}
}

//Q2
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number ");
	int n=sk.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++){
	fact=fact*i;
	}
	System.out.println("factorial : "+fact)
}}

//Q3
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number of elements in sequence");
	int n=sk.nextInt();
        int ans=1;
	for(int i=1;i<=n;i++){
	
	if(i==1){System.out.print(i+",");}
	else{
	ans=ans*2;
        System.out.print(ans+",");
         }	
	}

}}

//Q4
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number 1");
	int n1=sk.nextInt();
	System.out.println("enter number 2");
	int n2=sk.nextInt();
	 if(n1==n2){
	System.out.println(n1+n2);
	}
	else{
	System.out.println((n1+n2)*2);
	}
	
	}
}

//Q5
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number 1");
	int n1=sk.nextInt();
	System.out.println("enter number 2");
	int n2=sk.nextInt();
	System.out.println("enter number 2");
	int n3 =sk.nextInt();
	if(n1!=7 && n2!=7 && n3!=7){
	System.out.println(n1*n2*n3);
	}
	else if(n3==7){
	System.out.println("-1");
	}
	else if(n2==7){
	System.out.println(n3);
	}
	else{
	System.out.println(n2*n3);
	}

}}

//Q6
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter food type");
	char c=sk.next().charAt(0);
	System.out.println("enter quantity  ");
	int q=sk.nextInt();
	System.out.println("enter distnace(km)");
	int d=sk.nextInt();
	
	if(c=='n' && d>=0){
	if(c=='n' && d<=3){
	int tb=q*15;
	System.out.println("total bill :"+tb);
	}
	else if(c=='n' && d<=6){
	int tb=q*15+(d*1-3);
	System.out.println("total bill is:"+tb);
	}
	else{
	int tb=q*15+(d*2-9);
	System.out.println("total bill :"+tb);
	}


	}
	
	else if(c=='v' && d>=0){
	
	if(c=='v' && d<=3){
	int tb=q*12;
	System.out.println("total bill :"+tb);
	}
	else if(c=='v' && d<=6){
	int tb=q*12+(d*1-3);
	System.out.println("total bill :"+tb);
	}
	else{
	int tb=q*12+(d*2-9);
	System.out.println("total bill :"+tb);
	}

	}

	else{
	System.out.println("total bill : -1");
	}
	

}}



//Q8
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter $1 available notes ");
	int one=sk.nextInt();
	System.out.println("enter $5 available notes ");
	int five=sk.nextInt();
	System.out.println("enter purchase amount");
	int pa=sk.nextInt();
	int r=pa%5;
	int am=pa/5;
	if(five>=am && one>=r){
	System.out.println("$1 notes needed: "+r);
	System.out.println("$5 notes needed: "+am);
	}
	else{
	System.out.println(-1);
	}
	
	
	}
}

//Q9

import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter day");
	int d=sk.nextInt();
	System.out.println("enter month");
	int m=sk.nextInt();
	System.out.println("enter year");
	int y=sk.nextInt();
	int r=d+1;
	System.out.println(r+"-"+m+"-"+"20"+y);

}}
*/
//Q10
import java.util.Scanner;
class A51{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	if(n%5==0 && n%3==0){
	System.out.println("zoom");

	}
	else if(n%5==0){
	System.out.println("zap");

	}
	else if(n%3==0){
	System.out.println("zip");

	}
	else{
	System.out.println("Invalid");

	}
}}

