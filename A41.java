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
	int k=1;
	while(n>0){
	 int r1=n%10;
	  n=n/10;
	int r2=n%10;
	if(r1==r2){
	System.out.println("not a unique number");
	 k=0;
	}			
	}
	if(k!=0){
	System.out.println(" this is unique number");
	}

}}
//Q8
class A41{
	public static  void main(String args[]){
	int n=1;
	while(n<=100){
	int i=1;
	int cnt=0;
	while(i<=n){
	
	if(n%i==0){cnt++;
	
	}
	
	i++;
	 
	}
	if(cnt==2){
	System.out.println(n+" is prime number");
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

//Q13
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter marks out of 100");
	System.out.println("enter marks of math");
	int m=sk.nextInt();
	System.out.println("enter marks of english");
	int e=sk.nextInt();
	System.out.println("enter marks of science");
	int s=sk.nextInt();
	System.out.println("enter marks of art");
	int a=sk.nextInt();
	System.out.println("enter marks of computer");
	int c=sk.nextInt();
	int tm=(m+e+s+a+c);
	float average=tm/5;
	System.out.println("total marks obtain in 500= "+tm);
	
	System.out.println("percentage of marks= "+average);
	
	}

}
//Q14
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter cost price");
	int cp=sk.nextInt();
	System.out.println("enter selling price");
	int sp=sk.nextInt();
	int p=sp-cp;
	int l=cp-sp;
	if(p>l){
	System.out.println("profit = "+p);
	}
	else{
	System.out.println("loss = "+l);
	}
}}


//Q15
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter your age");
	int a=sk.nextInt();
	String r=(a>=18)?("you can vote"):("you cannot vote.");
	System.out.println(r);
}}
//Q16
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter daily wages");
	int w=sk.nextInt();
	System.out.println("enter number of working days");
	int r=sk.nextInt();
	int bp=w*r;
	double da=bp*0.05;
	double hra=bp*0.10;
	double pf=bp*0.12;
	Double np=bp+da+hra-pf;
	System.out.println("Basic pyment: "+bp );
	System.out.println("DA: "+da );
	System.out.println("HRA: "+hra );
	System.out.println("Net payment: "+np );

}}


//Q17
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter your gender");
	String g=sk.next();
	System.out.println("enter your age");
	int a=sk.nextInt();
	
	
	if(g.equalsIgnoreCase("Female") && a>0 && a<=58)
	{
	System.out.println("percentage of interest= 8.2%");
	}
	else if(g.equalsIgnoreCase("Female") &&  a<=120)
	{
	System.out.println("percentage of interest= 7.6%");
	}
	else if(g.equalsIgnoreCase("male") && a>0 && a<=60)
	{
	System.out.println("percentage of interest= 9.2%");
	}
	else if(g.equalsIgnoreCase("male") &&  a<=120)
	{
	System.out.println("percentage of interest= 8.3%");
	}
	else
	{System.out.println("invalid age or gender");}
	
	
}}

//Q18
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter any character");
	char g=sk.next().charAt(0);
	System.out.println("old character is : "+g);
	if(g>90 && g<123){
	System.out.println("new charcter : "+(char)(g-32));	
	}
	else if(g>64 && g<91){
	System.out.println("new charcter : "+(char)(g+32));	
	}

	}}

//Q19
import java.util.Scanner;
class A41{
public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter month in digit");
	int m=sk.nextInt();
	if(m==1){
	System.out.println("January");
	}
	else if(m==2){
	System.out.println("February");
	}
	else if(m==3){
	System.out.println("March");
	}
	else if(m==4){
	System.out.println("april");
	}
	else if(m==5){
	System.out.println("May");
	}
	else if(m==6){
	System.out.println("June");
	}
	else if(m==7){
	System.out.println("July");
	}
	else if(m==8){
	System.out.println("August");
	}
	else if(m==9){
	System.out.println("September");
	}
	else if(m==10){
	System.out.println("October");
	}
	else if(m==11){
	System.out.println("November");
	}
	else if(m==12){
	System.out.println("December");
	}
	else {
	System.out.println("invalid month");
	}
	
		
	}}

//Q20

class A41{
	public static void main(String args[]){
	int i=1;
	int cnt=1;
	while(cnt<=5){
	if(i%2==0 && i%3==0 && i%5==0){
	cnt++;
	System.out.println(i);
	}
	i++;

	}
	}
}
*/
















 