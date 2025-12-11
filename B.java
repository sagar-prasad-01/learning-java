

class A{
	
public A(){

System.out.println("default constructor A1 call");
}

public void a(){

System.out.println("this is parent class a1 mothod");

}

}



class B extends A{

public B(){

System.out.println("default constructor A1 call");
}

public void a(){

System.out.println("this is child class a1 mothod");

}

public static void main(String args[]){

	A obj=new B();
	obj.a();
	 

	} 


}