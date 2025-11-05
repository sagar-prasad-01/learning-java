/*
//2d array 
//array of array
class A21{
	public static void main(String args[]){
	int arr[][]=new int[3][3];
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;

	arr[1][0]=40;
	arr[1][1]=50;
	arr[1][2]=60;

	arr[2][0]=70;
	arr[2][1]=80;
	arr[2][2]=90;

	System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]);
	System.out.println(arr[1][0]+"\t"+arr[1][1]+"\t"+arr[1][2]);
	System.out.println(arr[2][0]+"\t"+arr[2][1]+"\t"+arr[2][2]);
	}

}

//
class A21{
	public static void main(String args[]){
	int arr[][]=new int[][]{
	{11,12,13},
	{14,15,16},
	{17,18,19}
	};
	
	System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]);
	System.out.println(arr[1][0]+"\t"+arr[1][1]+"\t"+arr[1][2]);
	System.out.println(arr[2][0]+"\t"+arr[2][1]+"\t"+arr[2][2]);
	}

}

import java.util.Scanner;
class A21{
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	int arr[][]=new int[3][3];

	System.out.println("enter elements index of 00");
	arr[0][0]=sk.nextInt();
	System.out.println("enter elements index of 01");
	arr[0][1]=sk.nextInt();
	System.out.println("enter elements index of 02");
	arr[0][2]=sk.nextInt();
	
	System.out.println("enter elements index of 10");
	arr[1][0]=sk.nextInt();
	System.out.println("enter elements index of 11");
	arr[1][1]=sk.nextInt();
	System.out.println("enter elements index of 12");
	arr[1][2]=sk.nextInt();

	System.out.println("enter elements index of 20");
	arr[2][0]=sk.nextInt();
	System.out.println("enter elements index of 21");
	arr[2][1]=sk.nextInt();
	System.out.println("enter elements index of 22");
	arr[2][2]=sk.nextInt();

	
	
	System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]);
	System.out.println(arr[1][0]+"\t"+arr[1][1]+"\t"+arr[1][2]);
	System.out.println(arr[2][0]+"\t"+arr[2][1]+"\t"+arr[2][2]);
	}

}

*/
import java.util.Scanner;
class A21{
	public static void main(String args[]){
	int arr[][]=new int[3][3];
	Scanner sk=new Scanner(System.in);

	for(int r=0;r<arr.length;r++){
	for(int c=0;r<arr.length;c++){
	System.out.println("enter elements index of"+r+c+" : ");
	arr[r][c]=sk.nextInt();
	}
	System.out.println("");
	}

	for(int r=0;r<arr.length;r++){
	for(int c=0;r<arr.length;c++){
	System.out.print("\t"+arr[r][c]);
	
	}
	System.out.println("");
	}

	for(int []a:arr){
	for(int x:a){
	System.out.print("\t"+x);
	
	}
	System.out.println("");
	}
	
	


	}

}

