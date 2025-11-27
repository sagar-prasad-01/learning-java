import java.util.Scanner; 
class Rectangle{


int l;
int b;

void acceptData(){
Scanner sk=new Scanner(System.in);
System.out.println("enter length");
 l=sk.nextInt();

System.out.println("enter breadth");
 b=sk.nextInt();

}


void getArea(){
System.out.println("area="+l*b);

}


void getPira(){
System.out.println("pirameter="+2*(l+b));

}

public static void main(String args[]){
Rectangle k=new Rectangle();
k.acceptData();
k.getArea();
k.getPira();

}



}