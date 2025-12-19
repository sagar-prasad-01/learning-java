class Ab{

public String name;

public Ab(){
System.out.println("this is default constructor");

}

public Ab(String name){
this();
this.name=name;
System.out.println("this is parametrized constructor");

}

public void show(){
System.out.println("name : "+name);
}

public void Display(){
this.show();//to call current class method
}

public static void main(String args[]){
Ab sk=new Ab("sagar");
sk.Display();
}



}



