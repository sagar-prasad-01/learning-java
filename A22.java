//wap to print sum of two matrix
import java.util.Scanner;
class A22{
	public static void main(String args[]){
	int A[][]=new int[3][3];
	int B[][]=new int[3][3];
	int C[][]=new int[3][3];
	int r,c;
	Scanner sk=new Scanner(System.in);
	
	System.out.println("enter matrix A");
	for( r=0;r<A.length;r++){
	for( c=0;c<A.length;c++){
	System.out.println("enter elements index of"+r+c+" : ");
	A[r][c]=sk.nextInt();
	}

		}

	
	System.out.println("enter matrix B");
	for( r=0;r<B.length;r++){
	for( c=0;c<B.length;c++){
	System.out.println("enter elements index of"+r+c+" : ");
	B[r][c]=sk.nextInt();
	}
	
	}

	for( r=0;r<B.length;r++){
	for( c=0;c<B.length;c++){
		 C[r][c]=A[r][c]+B[r][c];
		}
	}

	System.out.println("output of matrix A");
	for(int[] r1:A){
		for(int x:r1){
		System.out.print("\t"+x);
		}
	System.out.println("");
	}
	
	System.out.println("output of matrix B");
	for(int[] r1:B){
		for(int x:r1){
		System.out.print("\t"+x);
		}
	System.out.println("");
	}

	System.out.println("output of matrix C");
	for(int[] r1:C){
		for(int x:r1){
		System.out.print("\t"+x);
		}
	System.out.println("");
	}

	
	}

}