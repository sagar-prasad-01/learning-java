//wap to delete first and last digit of given number
class Gt{
	public static void main(String args[]){
	int n=1234;
	int n1=n/10%10;
	int n2=n/10/10%10;
	String ans=n2+""+n1;
        System.out.println("after deleting fist and last digit of number"+ans);
	
	
	
	}


}