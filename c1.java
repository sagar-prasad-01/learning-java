class AgeException extends Exception{
private String msg;

public AgeException(String msg){
this.msg=msg;
}

public String getMsg(){
return msg;
}
}

class c1{
public static void main(String args[]){

int age=0;
try{

age=Integer.parseInt(args[0]);//string ko integer me convert krta hai
if(age<0 || age>100){
AgeException k=new AgeException("invalid age");
throw k;
}
System.out.println("your age is valid within range 1-100"+age);
}

catch(AgeException k){
System.out.println(k.getMsg());
}



}
}