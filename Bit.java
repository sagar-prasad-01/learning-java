//~(bitwise not rightshift leftshift operator)
class Bit{
	public static void main(String args[]){
	int x=8;
	int y=~x; 
	System.out.println(y);
	int a=8;
	int b=a<<1;//(right shift) value double hoga 8 se 16
	int c=a<<2;
	System.out.println(c);
	System.out.println(b);
	b=a>>1;//(left shift) value half hoga 8 se 4
	System.out.println(b);

	}
}