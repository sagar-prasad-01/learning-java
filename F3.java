//wap to check numb is duck number or not
import java.util.Scanner;
class F3{
	public static void main(String args[]){
	Scanner sk = new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int k=0;
	for(;n>0;){
	int r=n%10;
	
	if(r==0){
	k++;
	}
	if(n>0){
	n=n/10;
	}
	}

	if(k>0){
	System.out.println("this is duck number");
	}
	else{
	System.out.println("this is not duck number");
	}


}}