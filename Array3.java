//array learning
import java.util.Scanner;
class Array3{
	public static void main(String args[]){
	int num[]=new int[4];
	Scanner sk=new Scanner(System.in);
	System.out.println("enter elements of index o ");
	num[0]=sk.nextInt();
	System.out.println("enter elements of index 1 ");
	num[1]=sk.nextInt();
	System.out.println("enter elements of index 2 ");
	num[2]=sk.nextInt();
	System.out.println("enter elements of index 3 ");
	num[3]=sk.nextInt();
	System.out.println("size of array="+num.length);
	System.out.println("elsements of index o="+num[0]);
	System.out.println("elsements of index 1="+num[1]);

	}
}