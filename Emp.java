//wap to read employee inoemation from the user and print it.
import java.util.Scanner;
class Emp{
	public static void main(String args[]){
	String name,job;
	int salary,dn;	
	Scanner s=new Scanner(System.in);
	System.out.println("enter name");
	name=s.nextLine();

	System.out.println("enter salary");
	salary=s.nextInt();
	
	System.out.println("enter department number");
	dn=s.nextInt();
	s.nextLine();

	System.out.println("enter job name");
	job=s.nextLine();

	System.out.println("name="+name);
	System.out.println("salary="+salary);
	System.out.println("job name="+job);
	System.out.println("department number="+dn);
	
	double  hra=salary*0.2;
	double da=salary*0.1;
	double ta=salary*0.1;
	double totala=hra+da+ta;
	double gs=totala+salary;

	System.out.println("HRA="+hra);
	System.out.println("DA="+da);
	System.out.println("TA="+ta);
	System.out.println("Total Incentive="+totala);
	System.out.println("gross salary="+gs);
	
	
	
	 


}

}
