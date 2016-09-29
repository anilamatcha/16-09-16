public class Range
{
	public static void main(String args[])
	{
		Ran r1=new Ran();
		Ran r2=new Ran();
		if(r1.inRange(20,50))
			System.out.println("yes");
		else
			System.out.println("no");
		if(r2.inRange(30,100))
			System.out.println("yes");
		else
			System.out.println("no");
	
	}
}
class Ran
{
	public boolean inRange(int a,int b)
	{
		for(int i=10;i<=20;i++)
		{
			if(a==i || b==i)
			{
				return true;
			}
		}
		return false;
	}
}
		
