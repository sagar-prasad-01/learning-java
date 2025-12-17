class Sk{
public static void main(String args[]){

int a=10;
int b=0;
int c=0;
System.out.println("before Excenption");
try{
System.out.println("try start");
c=a/b;
System.out.println("try end");
}
catch(ArithmeticException k){
System.out.println("inside catch");
System.out.println("denominator should not be zero");
k.printStackTrace();
}

System.out.println("After Excenption");
System.out.println("result= "+c);


}

}