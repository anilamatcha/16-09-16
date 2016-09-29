public class Leapy
{
	public int checkLeap(int a, int b)
	{
		int i;
		int count=0;
		for(i=a;i<=b;i++)
		{
			if(i%4==0&&i%100!=0||i%400==0)
			{	
				count=count+1;
			}
		}
		return count;
	}
}
