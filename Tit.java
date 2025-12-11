

abstract class Rgpv{
	
public Rgpv(){
System.out.println("default constructor Rgpv call");
}

public abstract void cctv();
public abstract void lab();

public void copyCheck(){
System.out.println("rgpv own copycheck method");
}
}


class Tit extends Rgpv{

public Tit(){
System.out.println("default constructor Tit call");
}

public void cctv(){
System.out.println("this is rgpv class cctv method ovverriden");
}

public void lab(){
System.out.println("this is rgpv class lab method ovverriden");
}

public void staff(){
System.out.println("this is tit class staff mothod");

}

public static void main(String args[]){

	Rgpv r=new Tit();
	r.cctv();
	r.lab();
	r.copyCheck();
	//r.staff();

	System.out.println("t=======================");
	
	Tit t=new Tit();
	t.staff();
	t.cctv();
	t.lab();
	t.copyCheck();
	} 


}