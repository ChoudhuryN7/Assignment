class p18{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
  for(int j=5;j>=i;j--)
  {
   int a=70;
   System.out.print((char)(a-j)+" ");
  }
  System.out.println();
}
}
}