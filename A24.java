//wap to print sum of two matrix
import java.util.Scanner;
class A24{
	public static void main(String args[]){
	int A[][]=new int[][]{
	{10,20,30},
	{40,50,60},
	{70,80,90}
	};
	
	int r,c;
	int r1sum=0;
	int r2sum=0;
	int r3sum=0;
	for(r=0;r<A.length;r++){
		for(c=0;c<A.length;c++){
		if(r==0){
			r1sum=A[r][c];
			}
		else if(r==1){
			r2sum=A[r][c];
		}
		else if(r==2){
			r3sum=A[r][c];
		}
	 }
}
	System.out.println(r1sum);
	

}


}

	