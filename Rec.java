import java.util.Scanner; 
class Rec{


int l;
int b;
Rec(){
System.out.println("default constructor is called");
l=1;
b=1;	
}

Rec(int x,int y){
System.out.println("parametrized constructor is called");
l=x;
b=y;	
}

void acceptData(){
Scanner sk=new Scanner(System.in);
System.out.println("enter length");
 l=sk.nextInt();

System.out.println("enter breadth");
 b=sk.nextInt();

}


void showData(){
System.out.println(" breadth = "+b);
System.out.println(" length = "+l);
	}

public static void main(String args[]){
Rec k=new Rec();
k.acceptData();
k.showData();

Rec k2=new Rec(2,3);
k2.showData();

Rec k3=new Rec(2,3);
k3.acceptData();
k3.showData();

}

}