class String{
	public static void main(String args[]){
	String x="hello";
	String y="hello";
	String z=x;
	System.out.println(x.hashCode());
	System.out.println(y.hashCode());
	System.out.println(x==y);
	System.out.println(x.equals(z));

	String m=new String("hello");
	String n=new String("hello");
	System.out.println(m==n);//false
	System.out.println(m.equals(n));//true

}
}