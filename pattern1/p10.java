class p10
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
  {
	for(int j=1;j<=4;j++)
	{
		System.out.print(" ");
	}		
    for(int j=1;j<=i;j++)
     {
       
       int b=69-i+j;
       System.out.print((char)b+" ");
     }
    System.out.println();
  }
}
}