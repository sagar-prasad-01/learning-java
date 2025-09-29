import java.util.Scanner;
class L9{
  public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("enter number");
	int n=sk.nextInt();
	int i=2;
	int cnt=0;
	while(i<n){
	if(n%i==0){cnt++;}
	i++;
	
	}
	if(cnt>0){
	System.out.println("not a prime number");
	}
	else{
	System.out.println("prime number");
	}
	
	}

}