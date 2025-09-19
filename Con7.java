//wap to calculate grade of employ in each subject
import java.util.Scanner;
class Con7{
	public static void main(String args[]){
	
	Scanner sk=new Scanner(System.in);
	System.out.println("enter math marks");
	int m=sk.nextInt();

	System.out.println("enter chem marks");
	int c=sk.nextInt();

	System.out.println("enter phy marks");
	int p=sk.nextInt();

	System.out.println("enter eng marks");
	int e=sk.nextInt();

	System.out.println("enter hindi marks");
	int h=sk.nextInt();
	float range=(p+c+m+e+h)/(5);

	if(range>90){
	System.out.println("grade A+");
	}
	else if(range>80){
	System.out.println("grade A");
	}
	 
	else if(range>70){
	System.out.println("grade B+");
	}

	else if(range>60){
	System.out.println("grade B");
	}	

	else if(range>50){
	System.out.println("grade c+");
	}

	else if(range>=40){
	System.out.println("grade c");
	}

	else{
	System.out.println("grade F");
	}
	System.out.println("%="+range);
	
	}

}