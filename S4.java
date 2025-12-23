class S4{

int a;
static int count;
static{
count=0;
System.out.println("this is static block 1");

}

public S4(){
System.out.println("Default constructor called");
count++;

}
public S4(int a){
this.a=a;
System.out.println("Default constructor called");
count++;

}

public void show(){
System.out.println("number of obj created"+count);
}

public static int getCount(){
return count;
}

public static void main(String args[]){

System.out.println("main method executed");
S4 obj1=new S4();
S4 obj2=new S4();
S4 obj3=new S4(10);
obj1.show();
obj2.show();
obj3.show();
System.out.println(" static method"+getCount());
System.out.println(" static method"+S4.getCount());
System.out.println(" static method"+obj1.getCount());
}


static{
count=0;
System.out.println("this is static block 2");

}

}