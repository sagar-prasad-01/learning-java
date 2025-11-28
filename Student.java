import java.util.Scanner;
class Student{

	String name;
	String enroll;
	char s;
	int p,c,m,h,e;
	
	void getData(){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter name : ");
	name=sk.nextLine();
	System.out.println("enter enroll : ");
	enroll =sk.nextLine();

	System.out.println("enter section : ");
	s=sk.next().charAt(0);

	System.out.println("enter phy marks : ");
	p =sk.nextInt();
	System.out.println("enter chem marks : ");
	c =sk.nextInt();
	System.out.println("enter math marks : ");
	m =sk.nextInt();
	System.out.println("enter hindi marks : ");
	h =sk.nextInt();
	System.out.println("enter eng marks : ");
	e =sk.nextInt();
	
	}

	void showData(){
	System.out.println("name : "+name);
	System.out.println("enrollment : "+enroll);
	System.out.println("section : "+s);
	System.out.println("marks in phy : "+p);
	System.out.println("marks in chem : "+c);
	System.out.println("marks in math : "+m);
	System.out.println("marks in hindi : "+h);
	System.out.println("marks in eng : "+e);
	}

	int tM(){
	return p+c+m+h+e;
	}

	float per(int t){
	return t/5.0f;
	}


	public static void main(String args[]){
	Student st=new Student();
	st.getData();
	st.showData();
	int k=st.tM();
	float pr=st.per(k);
	System.out.println("total marks :"+k);
	System.out.println("percentage :"+pr);

	}

 }