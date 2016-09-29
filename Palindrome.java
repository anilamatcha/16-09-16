public class Palindrome
{
	public static void main(String args[])
	{
			String s="aniina";
			int l=s.length();
			int n=l+1,c=0,i;
			int p=l/2;
			if(l%2==0)
			{
			for(i=1;i<=p;i++)
			{
				if(s.charAt(i)!=s.charAt(n))
				{	
					c=0;
					break;
				}
				else
				{
					c=1;
				}
				n--;
			}
			}
			else
			{
			for(i=1;i<p+1;i++)
			{
				if(s.charAt(i)!=s.charAt(n))
				{	
					c=0;
					break;
				}
				else
				{
					c=1;
				}
				n--;
			}
			}
			if(c==0)
				System.out.println("Not");
			else
				System.out.println("Yes");
	}
}
