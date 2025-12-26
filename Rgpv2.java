
abstract class Rgpv2{

public abstract void lab();
public abstract void cctv();

public void copyCheck(){
System.out.println("this is copycheck method of rgpv class");

}

}


class College1 extends Rgpv2{

public void lab(){

System.out.println("this is lab method of  rgpv class overiden  by college1");
}

public void cctv(){

System.out.println("this is lab method of  rgpv class overiden  by college1");
}

public void staff(){

System.out.println("this is lab method staff of  college 1");
}

public static void main(String args[]){

Rgpv2 r=new College1();
r.lab();
r.cctv();
r.copyCheck();
//r.staff();

System.out.println("------------------------------");

College1 r2=new College1();
r2.lab();
r2.cctv();
r2.copyCheck();
r2.staff();

}


}