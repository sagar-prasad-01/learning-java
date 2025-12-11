
//private access specifier
class Student{

private String name;
private String enroll;
private String branch;
private String coarse;
private int id;
private int p;
private int c;
private int m;
private int h;
private int e;
private char section;



public String getName(){
return name;
}
public String getEnroll(){
return enroll;
}
public String getBranch(){
return branch;
}
public String getCoarse(){
return coarse;
}
public int getId(){
return id;
}
public int getP(){
return p;
}
public int getC(){
return c;
}
public int getM(){
return m;
}
public int getH(){
return h;
}
public int gete(){
return e;
}
public char getSection(){
return section;
}

public void setName(String s){
name=s;
}

public void setEnroll(String e){
enroll=e;
}

public void setBranch(String b){
branch=b;
}

public void setCoarse(String c){
coarse=c;
}

public void setId(int i){
id=i;
}

public void setP(int p){
p=p;
}
public void setC(int c){
c=c;
}
public void setM(int m){
m=m;
}
public void setH(int h){
h=h;
}
public void setE(int e){
e=e;
}



public static void main(String args[]){

Student s1=new Student();
s1.setName("sagar");
s1.setEnroll("0191cs231229");


System.out.println(x);
System.out.println(s1.getEnroll());


}

}