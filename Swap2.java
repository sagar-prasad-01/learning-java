//swap two number without third variable and arithmetic operator
class Swap2{
	public static void main	(String args[]){
	int a=6;
	int b=7;
	System.out.printf("before swappinng a %d b %d",a,b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.printf("after swapping a %d b %d",a,b);
	
	
}
} 