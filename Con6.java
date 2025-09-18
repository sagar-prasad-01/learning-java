import java.util.Scanner;
class Con6{
	public static void main(String args[]){
	
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	if(n>=0 && n<=9){
	System.out.println("single digit");
	}
	else if(n>=10 && n<=99){
	System.out.println("double digit");
	}
	 
	else if(n>=100 && n<=999){
	System.out.println("three digit");
	}
	else{
	System.out.println("more than three digit");
	}
	}

}