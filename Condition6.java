//wap to check given character is vowel or not
import java.util.Scanner;
class Condition6{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter charcter");
	char ch=sk.next().charAt(0);
	if(ch>='A'&&ch<='Z'){
	System.out.println("upper case");
	}

	else if(ch>='a'&&ch<='z'){
	System.out.println("lower case");
	}

	else if(ch>='0'&&ch<='9'){
	System.out.println("upper case");
	}

	else{
	System.out.println("special case");
	}
	
	}

}