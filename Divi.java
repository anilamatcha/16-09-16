public class Divi
{
	public static void main(String args[])
	{
		Div d=new Div();
		int sum=d.checkSum(10,15);
		System.out.println(sum);
	}
}
class Div
{
	public int checkSum(int a ,int b)
	{
		int s=0;
		for(int i=a;i<=b;i++)
		{
			if((i%13==0 || i%15==0 || i%17==0) && i%30!=0)
			{
				s=s+i;
			}
		}
		return s;
	}
}
