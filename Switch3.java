import java.util.Scanner;
class Switch3 {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("press 1 for area of rectangle");
	System.out.println("press 2 for parameter of rectangle");
	System.out.println("press 3 area of circle");
	System.out.println("press 4 for circumference of circle");
	char choice=sc.next().charAt(0);
	
	int l=0;
        int b=0;
        int r=0;
	
	if(choice=='1' || choice=='2'){
	   
	    System.out.println("enter length of rectangle"); 
	     l=sc.nextInt();
	    System.out.println("enter breadth of rectangle");
	     b=sc.nextInt();
	    
	}

	else{
		System.out.println("invalid choice");
	}
    

	if(choice=='3' || choice=='4'){
		
	    System.out.println(" enter radious of circle"); 
	     r=sc.nextInt();
		
	   
	}

	else{
		System.out.println("invalid choice");
	}



	switch(choice){
	case '1':
		System.out.println("area of rectangle="+(l*b));
	break;
	case '2':
		System.out.println("parameter of reactangle="+(2*l));
	break;
	case '3':
		System.out.println("area of circle="+(r*3.14*r));
	break;
	case '4':
		System.out.println("circumfarence of circle="+(2*3.14*r));
	break;

	}
}
}