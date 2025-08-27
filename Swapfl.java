//wap to swap first and last digit of the given number.
class Swapfl{
	public static void main(String args[]){
	int n=123;
	int fd=n/10/10;
	int md=n/10%10;
	int ld=n%10;
	System.out.println("before swap digit="+n);
	System.out.println("after swap digit="+((ld*100)+(md*10)+(fd)));
	System.out.println("after swap digit="+(ld+""+md+""+fd)); 

	}


}