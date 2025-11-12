class S1{
	public static void main(String args[]){
	String x="hello";
	String y="hello";
	String z=x;
	System.out.println(x.hashCode());
	System.out.println(y.hashCode());
	System.out.println(x==y);
	System.out.println(x.equals(z));

	

}
}