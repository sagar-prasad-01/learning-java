/*
//Q1
class A41{
	public static  void main(String args[]){
	int n=-5;
	while(n<=5){
	 	System.out.println(n);
		n++;
	}

}}

//Q2
class A41{
	public static  void main(String args[]){
	int n=100;
	while(n>=91){
	 	System.out.println(n);
		n--;
	}

}}

//Q3
class A41{
	public static  void main(String args[]){
	int n=80;
	while(n>=70){
	 	System.out.println(n);
		n-=2;
	}

}}

//Q4
class A41{
	public static  void main(String args[]){
	int n=10;
	while(n<=20){
	 	System.out.println(n+" "+"Square is :"+n*n);
		n+=2;
	}

}}

//Q5
class A41{
	public static  void main(String args[]){
	int n=1;
	while(n<=10){
	 	System.out.println("cube of "+n+" = "+n*n*n);
		n+=2;
	}

}}

//Q6
import java.util.Scanner;
class A41{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int sum=0;
	int mul=1;
	int r;
	
	while(n>0){
	 r=n%10;
	 sum=sum+r;
	 mul=mul*r;
	 n=n/10;
		
	}
	
	if(sum==mul){
	 System.out.println("entered number is spy number");
	}
	else{
	System.out.println("entered number is not spy number");
	}

}}

//Q7
import java.util.Scanner;
class A41{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	while(n>0){
	 int r1=n%10;
	  n=n/10;
		while(n>0){
		 int r2=n%10;
			System.out.println("abc");
		 if(r1==r2){System.out.println("not uniqe");
			break;
			}
		break;
		}
	}
	if(n==0){System.out.println("uniqe");}

}}

//Q8
class A41{
	public static  void main(String args[]){
	int n=1;
	while(n<=100){
System.out.println(n);
		int i=n;
           while(i>0){
	System.out.println(i);
	int cnt=0;
	if(n%i==0){
	if(cnt>2){
	System.out.println(cnt+"hello");}
	cnt++;
	}
	i--;
	}


		n++ ;
	}

}}

//Q9
import java.util.Scanner;
class A41{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter year");
	int n=sk.nextInt();
	if(n%4==0 || n%400==0){
	 	System.out.println(n+"it is leap year");
		
	}

}}

//Q10
import java.util.Scanner;
class A41{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter year");
	char c=sk.next().charAt(0);
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||
	c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
	 	System.out.println("Vowel");	
	}

	else{System.out.println("consonant");}

}}

*/
//Q12
import java.util.Scanner;
class A41{
	public static  void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("enter 1 for Area of Right Triangle");
	System.out.println("enter 2 for Area of Equilateral Triangle");
	System.out.println("enter 3 for Area of square");
	System.out.println("enter 4 for Area of Rectangle");
	System.out.println("enter 5 for Area of circle");

	char c=sk.next().charAt(0);

	switch(c){
        case '1':
	 System.out.println("enter b of traingle");
	int b=sk.nextInt();
	 System.out.println("enter h of traingle");
	int h=sk.nextInt();
	double ar=(0.5)*b*h;
	 System.out.println("area of traingle : "+ar);
	break;

	 case '2':
	 System.out.println("enter side of traingle");
	double a=sk.nextFloat();
	 System.out.println("area of traingle : "+(0.433*a));
	break;
	
	 case '3':
	 System.out.println("enter side of square");
	 int k=sk.nextInt();
	 System.out.println("area of traingle : "+(k*k));
	 break;

	 case '4':
	 System.out.println("enter length of reactangle");
	 int l=sk.nextInt();
	 System.out.println("enter width of reactangle");
	 int w=sk.nextInt();
	 System.out.println("area of rectangle : "+(l*w));
	 break;

	case '5':
	 System.out.println("enter radious of circle");
	 float r=sk.nextFloat();
	 double ar2=r*r*3.14;
	 System.out.println("area of circle : "+ar2);
	 break;
        }
	

}}



