/*1)wap to remove leeding zero from the string
exa:
str=00012345


import java.util.Scanner;
class Test2{
public static void main(String args[]){
System.out.println("enter string");
Scanner sk=new Scanner(System.in);
String s1=sk.nextLine();
String s2=sk.nextLine();

for(int i=0;i<s1.length();i++)
{

if(s1.charAt(i)=='0')
{
System.out.println("zero");
}

else{ s2=s1.charAt(0)}

}
System.out.println("zero"+s1);

}

}

//////////


import java.util.Scanner;
class Test2{
public static void main(String args[]){
System.out.println("enter string");
Scanner sk=new Scanner(System.in);
String s1=sk.nextLine();
int p=0;
for(int i=0;i<s1.length();i++)
{
 char k=s1.charAt(i);
 
if(

    
{
p=1;
}


}
if(p==1){
System.out.println("String is panagram");
}
else{
System.out.println("String is not panagram");
}
}

}


//////1
import java.util.Scanner;
class Test2{
public static void main(String args[]){
System.out.println("enter string");
Scanner sk=new Scanner(System.in);
String s1=sk.nextLine();
String s2="";

for(int i=0;i<s1.length();i++)
{

if(s1.charAt(i)!='0')
{
 s2=s2+s1.charAt(i);
}

}
System.out.println(s2);

}

}
*/
import java.util.Scanner;

class Test2 {
    public static void main(String args[]) {
        System.out.println("Enter string:");
        Scanner sk = new Scanner(System.in);
        String s1 = sk.nextLine();
        String s2 = " ";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);   

            if (ch >= 'a' && ch <= 'z') {   
            }
            else{
                s2=s2+ch+"";
            }
        }

        System.out.println("Digits: " + s2);
    }
}

