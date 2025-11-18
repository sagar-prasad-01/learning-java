/*
//methods os String class
class S3{
	public static void main(String args[]){
     	String x="sagar";
	for(int i=x.length()-1;i>=0;i--){
	char c=x.charAt(i);
	System.out.print(c);
	}
	

}}


class S3{
	public static void main(String args[]){
     	String x="sag";
	String x2="SAG";
	String x3="G";
	System.out.print(x.compareTo(x2));
	System.out.print(x.compareTo(x3));
	System.out.print(x.compareToIgnoreCase(x2));
	
	

}}



class S3{
	public static void main(String args[]){
     	String x="sag";
	String y="ar";
	
	System.out.print(x.concat(y));
	
	

}}


class S3{
	public static void main(String args[]){
     	String x="bhopal is this";
	boolean b=x.contains("is");//true
	boolean c=x.contains("iS");//case sensitive hota ye method---false
	System.out.println(b);
	System.out.print(c);
	
	

}}


class S3{
	public static void main(String args[]){
     	String x="bhopal is know city of lack";
	boolean b=x.endsWith("city of lack");//true
	boolean c=x.startsWith("bhopal");//true
	System.out.println(b);
	System.out.println(c);
	

}}


import java.util.Scanner;
class S3{
	public static void main(String args[]){
     	Scanner sk=new Scanner(System.in);
	System.out.println("enter user name");
	String un=sk.nextLine();
	System.out.println("enter password");
	String ps=sk.nextLine();

	if(un.equalsIgnoreCase("admin") && ps.equals("111")){
	System.out.println("login succes");
	}
	else{
	System.out.println("login failed");
	}

}}


class S3{
	public static void main(String args[]){
     	String x="bhopal is bhopal know city of lack bhopal";
	int b=x.indexOf("pal");//3
	int c=x.indexOf("pal",6);//13

	int d=x.lastIndexOf("pal");//3
	
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);

}}



class S3{
	public static void main(String args[]){
     	String x="";
	String y=" ";
	System.out.println(x.isEmpty());
	System.out.println(y.isEmpty());
}}



class S3{
	public static void main(String args[]){
     	String x=String.join("-","welcome","to","bhopal"); 
	System.out.println(x);
}}


class S3{
	public static void main(String args[]){
     	String x="welcome to bhopal this is old city";
	String arr[]= x.split(" ");
	for(String a:arr){
	System.out.println(a);
	}
}}


class S3{
	public static void main(String args[]){
     	String x="welcome to bhopal this is old city";
	String arr[]= x.split(" ");
	String r=String.join("-",arr);
	System.out.println(r);
}}


class S3{
	public static void main(String args[]){
     	String x="welcome";
	String r=x.substring(3);
	String m=x.substring(2,6);
	System.out.println(r);
	System.out.println(m);
}}


class S3{
	public static void main(String args[]){
     	String x="welcome";
	String r=x.substring(3);
	String m=x.substring(2,6);
	System.out.println(r);
	System.out.println(m);
}}




*/
class S3{
	public static void main(String args[]){
     	String x="wElcome";
	String r=x.toUpperCase();
	String s=r.toLowerCase();
	System.out.println(x+"  "+r+"	"+s);
}}















 