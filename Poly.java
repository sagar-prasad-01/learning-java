class Poly{


public void Add(){
int a=10;
int b=5;
int c=a+b;
System.out.println("add: "+c);
}

public void Add(int a,int b){
int c=a+b;
System.out.println("add with arguments: "+c);
}

public void Add(int b,int a,int d){
int c=a+b+d;
System.out.println("add with three arguments: "+c);
}

public static void main( String args[]){

Poly sk=new Poly();
sk.Add();
sk.Add(2,4);
sk.Add(4,2,4);
}

}