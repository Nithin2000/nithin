import java.util.Scanner;
class Demo20
{
 public static void main(String args[])
  {
    int reverse = 0;
    Scanner sc= new Scanner(System.in);
   int n = sc.nextInt();
    while(n>0)
    {
      reverse = reverse * 10;
      reverse = reverse + n%10;
      n = n/10;
    }
    System.out.println(reverse);
  }
}

