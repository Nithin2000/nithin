import java.util.*;
public class Demo12
{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("no values");
}
else
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
switch(c)
{
case 'r':
System.out.println("red");
break;
case 'b':
System.out.println("blue");
break;
case 'o':
System.out.println("orange");
break;
case 'y':
System.out.println("yellow");
break;
case 'w':
System.out.println("white");
break;
}
}
}
}