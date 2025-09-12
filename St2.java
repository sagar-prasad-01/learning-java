import java.util.Scanner;
class St2{
	public static void main(String args[]){
	Scanner kb=new Scanner(System.in);
	
	System.out.println("enter marks in phy");
	int pm=kb.nextInt();
	System.out.println("enter marks in phy");
	int cm=kb.nextInt();
	System.out.println("enter marks in phy");
	int mm=kb.nextInt();
	float average=(pm+cm+mm)/3;
	String r=average<40?"fail":"pass";
	System.out.println(r);

	System.out.println("enter number");
	int n=kb.nextInt();
	String r2=(n%2)==0?"even":"odd";
	System.out.println("number is "+r2);
	String r3=(n>=0)?"positive":"negative";
	System.out.println("number is "+r3);


	
	}
	
}