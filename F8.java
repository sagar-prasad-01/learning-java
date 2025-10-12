/*
//wap to print following pattern
0
10
010
1010
01010

class F8{
	public static void main(String args[]){
	for(int i=1;i<=5;i++){
	
		for(int j=1;j<=i;j++){
		if((i+j)%2==0)
	{System.out.print("0");}
		else{
	System.out.print("1");}
		}
	System.out.println("");
	}

}} 


class F8{
	public static void main(String args[]){
	for(int i=1;i<=5;i++){

		
	
		for(int j=1;j<=i;j++){
		System.out.print((i+j)%2);

		}
	System.out.println("");
	}

}} 

class F8{
	public static void main(String args[]){
	for(int i=1;i<=5;i++){

		for(int j=5;j>i;j--){
		System.out.print(" ");

		}
	
		for(int j=1;j<=i;j++){
		System.out.print("*");

		}
	System.out.println("");
	}

}}



class F8{
	public static void main(String args[]){
	for(int i=1;i<=5;i++){

		for(int j=5;j>i;j--){
		System.out.print(" ");

		}
	
		for(int j=1;j<=2*i-1;j++){
		System.out.print("*");

		}
	System.out.println("");
	}

}}
*/

class F8{
	public static void main(String args[]){
		int i,j;
	for(i=1;i<=5;i++){

		for(j=5;j>i;j--){
		System.out.print(" ");

		}
	
		for( j=1;j<=2*i-1;j++){
		System.out.print("*");

		}
	System.out.println("");
	}
	for( i=4;i>=1;i--){
		
		
		for( j=5;j>i;j--){
		System.out.print(" ");

		}
	
		for( j=1;j<=2*i-1;j++){
		System.out.print("*");

		}
	System.out.println("");
	}

}}