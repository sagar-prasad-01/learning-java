//wap to check given character is vowel or not
import java.util.Scanner;
class Condition5{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter charcter");
	char ch=sk.next().charAt(0);
	if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u' ||ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
	System.out.println("this is a vowel");
	}

	else{
	System.out.println("not a vowel");
	}
	


	 
	
	}

}