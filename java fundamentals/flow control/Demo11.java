import java.util.*;
public class Demo11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>='a' && ch<='z')
{
char c1=ch.toUpperCase();
System.out.println(c1);
}
if(ch>='A' && ch<='Z')
{
System.out.println(ch.toLpperCase());
}
}
}