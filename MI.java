//multiple inheritance 

interface ia{
void a();

}

interface ib{
void b();

}

interface ic extends ia,ib{
void c();

}

class MI implements ic{
public void a(){
System.out.println("this is ia interface method");
}

public void b(){
System.out.println("this is ib interface method");
}

public void c(){
System.out.println("this is ic interface method");
}

public void l(){
System.out.println("this is MI class method");
}

public static void main(String args[]){

ic c=new MI();
c.a();
c.b();
c.c();
//c.l();

MI k=new MI();
k.a();
k.b();
k.c();
k.l();

}

}



//syntax error is compile type error