//wap to read student info from the user and print it 
import java.util.Scanner;
class Student2{
	public static void main(String args[]){
	int rn,age; 
	String nm,enr;
	float perc;
	char grade;	
	Scanner s=new Scanner(System.in);
	System.out.println("enter roll number");
	rn=s.nextInt();
	s.nextLine();
	System.out.println("roll number"+rn);
	
	System.out.println("enter name");
	nm=s.nextLine();
	System.out.println("name="+nm);

	System.out.println("enter percentage");
	perc=s.nextFloat();
	System.out.println("percentage="+perc);
	
	System.out.println("enter enrolmet num");
	enr=s.next();
	System.out.println("enrolment_num="+enr);
	
	System.out.println("enter age");
	age=s.nextInt();
	System.out.println("age="+age);

	System.out.println("enter grade");
	grade=s.next().charAt(0);
	System.out.println("grad="+grade);

}

}