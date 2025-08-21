//wap to convert given amout into smallet possible bank notes
   import java.util.Scanner;
	class AmountConvert{
	public static void main(String args[]){
        Scanner am=new Scanner(System.in);	
	System.out.println("enter amount");
	int amount=am.nextInt();
	int r,hd,fifty,twn,ten,five,two,one;
	hd=amount/100;
	r=amount-(hd*100);
	fifty=r/50;
	r=r-(fifty*50);
	twn=r/20;
	r=r-(twn*20);
	ten=r/10;
	r=r-(ten*10);
	five=r/5;
	r=r-(five*5);
	two=r/2;
	r=r-(two*2);
	one=r/1;
	

	
	System.out.println("notes of hundred="+hd);
	System.out.println("notes of fifty="+fifty);
	System.out.println("notes of twenty="+twn);
	System.out.println("notes of ten="+ten);
	System.out.println("notes of five="+five);
	System.out.println("notes of two="+two);
	System.out.println("notes of one="+one);

	}
}