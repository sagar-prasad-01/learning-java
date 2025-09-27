//wap to print sum of all odd number from 1 to 10
class L5{
	public static  void main(String args[]){
	int n=1;
	int sum=0;
	while(n<=10){
	if(n%2!=0){
	sum=sum+n;
	}
	n++;
	}
	System.out.println(sum);
		
	}

}