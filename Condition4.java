import java.util.Scanner;
class Condition4{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sk.nextInt();
	if(n>0){
	System.out.println("+ve number");
	}

	else{
	System.out.println("-ve number");
	}
	

	if(n%2==0){
	System.out.println(" number is even");
	}

	else{
	System.out.println("number is odd");
	}
	
	
	}

}