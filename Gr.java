import java.util.Scanner;
class Gr  {
	public static void main(String args[]){
	Scanner k=new Scanner(System.in);
	System.out.println("enter number one");
	int n1=k.nextInt();
	System.out.println("enter number two");
	int n2=k.nextInt();
	System.out.println("enter number three");
	int n3=k.nextInt();
	int r=(n1>n2)? ((n1>n3)?n1:n3):((n2>n3)?n2:n3);
	System.out.println(r);

	String r2=(n1>0)?("+ve"):n1==0?("zero"):("-ve");
	System.out.println(r2);

	}
}