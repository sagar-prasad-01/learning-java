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
*/
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













