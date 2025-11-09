//wap to print sum of two matrix
class A23{
	public static void main(String args[]){
	int A[][]=new int[][]{
	{10,20,30},
	{40,50,60},
	{70,80,90}
	};
	int x[]=new int[3];
	int csum=0;
	int r,c;
	for(r=0;r<A.length;r++){
	int r1sum=0;
		for(c=0;c<A.length;c++){
		System.out.print("\t"+A[r][c]);
		r1sum=r1sum+A[r][c];
		csum=csum+A[c][r];
	     }
		x[r]=csum;
		csum=0;

		for(int a:x){
		}
	System.out.print("\t\t"+r1sum);
	System.out.print("\t\t"+a);
	System.out.println("");
		
     }
	
	

}


}

	