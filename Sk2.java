class Sk2{
public static void main(String args[]){

int num=0;

try{
num=Integer.parseInt(args[0]);
System.out.println(num);
}
catch(ArrayIndexOutOfBoundsException k){
System.out.println("please enter at least one value from cmd");
k.printStackTrace();
}
catch(NumberFormatException ne){
System.out.println("only number is allowed");
ne.printStackTrace();
}


}

}