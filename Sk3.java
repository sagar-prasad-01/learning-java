class InvalidAgeException extends Exception{
	private String msg;
	public InvalidAgeException(String msg){
	this.msg=msg;
	}


	public String getMsg(){
	return msg;
	}
}


class Sk3{
public static void main(String args[]){

int age=0;

try{
age=Integer.parseInt(args[0]);
if(age<18){
InvalidAgeException k=new InvalidAgeException("invalid age");
throw k;
}
System.out.println("you are eligible for voting");
}
catch(InvalidAgeException ae){
System.out.println(ae.getMsg());
}
catch(ArrayIndexOutOfBoundsException k){
System.out.println("please enter at least one value from cmd");

}
catch(NumberFormatException ne){
System.out.println("only number is allowed");

}
}

}