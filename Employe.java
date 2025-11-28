import java.util.Scanner;
class Employe{

	String name;
	int number;
	int salary;
	String deptNumber;
	String job;
	String hireDate;
	
	
	void getData(){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter name : ");
	name=sk.nextLine();
	System.out.println("enter number : ");
	number =sk.nextInt();
	

	System.out.println("enter salary : ");
	salary=sk.nextInt();
	sk.nextLine();

	System.out.println("enter Department number : ");
	deptNumber =sk.nextLine();
	System.out.println("enter job name : ");
	job =sk.nextLine();
	System.out.println("enter hire date: ");
	hireDate =sk.nextLine();
	
	}

	void showData(){
	System.out.println("name : "+name);
	System.out.println("number is : "+number);
	System.out.println("salary : "+salary);
	System.out.println("department number: "+deptNumber);
	System.out.println("job name : "+job);
	System.out.println("hireDate is : "+hireDate);
	}

	float getHRA(){
	return salary*0.2f; 
	}

	float getDA(){
	return salary*0.1f;
	}

	float getTA(){
	return salary*0.1f;
	}

	float getAllIncentive(float t){
	return t;
	}

	float getGrossSalary(float t){
	return salary+t;
	}

	public static void main(String args[]){
	Employe st=new Employe();
	st.getData();
	st.showData();
	float m=st.getHRA();
	float n=st.getDA();
	float o=st.getTA();
	System.out.println("HRA  :"+m);
	System.out.println("DA  :"+n);
	System.out.println("TA  :"+o);
	float te=m+n+o;

	System.out.println("total incentive :"+st.getAllIncentive(te));
	System.out.println("total gross salary :"+st.getGrossSalary(te));

	}

 }