import java.util.Scanner;
class Ftn2{

public int add(int n1,int n2){
Scanner sk=new Scanner(System.in);
return n1+n2;
}



        public static void main(String args[]){
	Ftn f=new Ftn();//creting object of Ftn class
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number 1");
	int n1=sk.nextInt();

	System.out.println("enter number 2");
	int n2=sk.nextInt();
	int r=f.add(n1,n2);//method call
	System.out.println(r);
	}

}