class p13
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
    for(int j=4;j>=i;j--)
    {
	  System.out.print(" ");
	}
   
    for(int j=1;j<=i;j++)
    {
     int a=64;
     System.out.print((char)(a+i)+" ");
    }
    System.out.println();
}
}
}