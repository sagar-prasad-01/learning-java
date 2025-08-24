//wap to convert given amount into number of years ,num of months and days
import java.util.Scanner;
class Day{
	public static void main(String args[]){
	int nod,m,y,d,r; 	
	Scanner s=new Scanner(System.in);
	System.out.println("enter total amount");
	nod=s.nextInt();

	y=nod/365;
	r=nod%365;

	m=r/30;
	r=r%30;

	d=r/1;

	System.out.println("total years="+y);
	System.out.println("total monts="+m);
	System.out.println("total days="+d);



}

}
