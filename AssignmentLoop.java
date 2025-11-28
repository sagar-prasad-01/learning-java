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

//Q6
import java.util.Scanner;
class AssignmentLoop{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int k=n;
	int rev=0;
	while(n>0){
	int r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
	System.out.println(rev);
	int sumOfEven=0;
	while(rev>0){
	rev=rev/10;
	int r=rev%10;
	rev=rev/10;
	System.out.println(r);	
	sumOfEven=sumOfEven+(int)Math.pow(r,2);
	}
	if(sumOfEven%9==0){
	System.out.println("the number "+k+" is a lucky number");
	}
	else{
	System.out.println("the number "+k+" is not a lucky number");
	}
}}

//Q7
import java.util.Scanner;
class AssignmentLoop{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number n1");
	int n1=sk.nextInt();
	System.out.println("enter number n2");
	int n2=sk.nextInt();
	int max=(n1>n2)?(n1):(n2);
	int lcm;
	while(true){
	if(max%n1==0 && max%n2==0){
	lcm=max;
	break;
	}
	max++;
	}
	System.out.println("lcm of "+n1 +" and "+ n2+" = "+lcm);
}}


//Q8
class AssignmentLoop{
	public static void main(String args[]){
	int k=0;
	for(int i=0;i<5;i++){
	for(int j=0;j<=i;j++){
	System.out.print((i+j)%2);
	}
	System.out.println("");
	}
}}




//Q9
class AssignmentLoop{
	public static void main(String args[]){
	for(int i=1;i<=5;i++){
	int k=1;
	for(int j=1;j<=5;j++){

	if(j<6-i){
	System.out.print(" ");
	}
	else{
	System.out.print(k++);
	}
	}
	System.out.println("");
	}
}}

*/
//Q10
class AssignmentLoop{
	public static void main(String args[]){
	int k=0;
	for(int i=1;i<=11;i++){
	for(int j=1;j<=6;j++){
	if(i<=6){
	if(j>=i){
	System.out.print("*");
	}
	}

	if(i>6){
	if(j<=i && j<=i-5){
	System.out.print("*");
	}
	}
	
	}
	System.out.println("");
	}
}}
