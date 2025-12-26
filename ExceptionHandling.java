class ExceptionHandling{

public static void main(String args[]){

int a,b,c;
a=10;
c=0;
b=0;
System.out.println("before"+c);

try{
c=a/b;//infinite value ayega to exception hoga java me
}catch(ArithmeticException ae){

System.out.println(" dominator should not be 0");
ae.printStackTrace();

}

System.out.println("After"+c);

}

}