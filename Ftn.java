import java.util.Scanner;
class Ftn{

 public int add(){

Scanner sk=new Scanner(System.in);
System.out.println("enter n1");
int n1=sk.nextInt();

System.out.println("enter n2");
int n2=sk.nextInt();
int c=n1+n2;
return c;
}



        public static void main(String args[]){
	Ftn f=new Ftn();//creting object of Ftn class
	int r=f.add();//method call
	System.out.println(r);
	}

}