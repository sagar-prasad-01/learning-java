import java.util.Scanner;
class University{
String uName;
String uCode;


public University(){
System.out.println("Default constructer called");
}

void University(String uName,String uCode){
uName=uName;
uCode=uCode;
System.out.println("parametrized constructer called");
}

public void acceptData(){
Scanner k= new Scanner(System.in);
System.out.println("enter uName");
uName=k.nextLine();
System.out.println("enter uCode");
uCode=k.nextLine();
}

}



class College extends University{

String cName;
String cCode;

public College(){
System.out.println("Default constructer called");
}

void College(String cName,String cCode){
cName=cName;
cCode=cCode;
System.out.println("parametrized constructer called");
}


public void acceptData(){
Scanner k= new Scanner(System.in);
System.out.println("enter cName");
cName=k.nextLine();
System.out.println("enter cCode");
cCode=k.nextLine();
}

public void showData(){

System.out.println(" cName"+cName);
System.out.println(" cCode"+cCode);
System.out.println(" uName"+uName);
System.out.println(" uCode"+uCode);

}



public static void main(String args[]){

College sk=new College();



}

}