import java.util.*;
import java.lang.Math.*;
class  Homework14  //Armstrong 
{
	static boolean Armstrong (int n)
	{
		int temp,digit=0,last=0,sum=0;
		temp = n;
		while(temp>0)
		{
			temp = temp/10;
			digit++;
			
		}
		temp=n;
		{
			last=temp%10;
			sum+=(Math.pow(last,digit));
			temp =temp/10;
			
			
		}
		if(n==sum)
			return true;
		else
			return false;
	}
	public static void main(String args [])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit");
		num= sc.nextInt();
		System.out.println("Armstrong no. up to "+num+"are");
		for(int i=0;i<=num;i++)
		if(Armstrong(i))
		{
			System.out.println(i+",");
		}
	}
}