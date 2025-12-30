class ExceptionHandling2{

public static void main(String args[]){

int num=0;


try{
num=Integer.parseInt(args[0]);
}catch(ArrayIndexOutOfBoundsException ae){

System.out.println(" you sholild pass at least one elemnts from the command line");
ae.printStackTrace();

}catch(NumberFormatException ae){

System.out.println("please enter only number ");
ae.printStackTrace();

}
finally{
System.out.println("finally block always executed");
System.out.println("Square are "+(num*num));
}

}
}