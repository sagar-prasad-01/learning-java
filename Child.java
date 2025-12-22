//method overriding:-- 
//when a child class provide its own emplimetation of a method that is already defined in its //parent class. same signature


class Parent{
public void Add(){
System.out.println("parent class method");
}

}

class Child extends Parent{
public void Add(){
System.out.println("child class method");
}

public static void main(String args[]){

Parent k=new Parent();
k.Add();

Child c=new Child();
c.Add();

Parent p=new Child();
p.Add();
}

}