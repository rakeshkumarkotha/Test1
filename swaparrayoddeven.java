public class swaparrayoddeven
{
	public static void main(String[] args)
	{
		int a[]  = {5,6,8,12,15,17,22,25};
		int b[] = {};
		System.out.println("Actual Array is : ");
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);		
		}
		int t;
		//for(int i = 0;i<a.length;i++)
		//{	
			t = a[i];
			a[i] = b[i];
			b[i] = t;
		//}
		for(int i = 0;i<a.length;i++)
		{
		System.out.println(b[i]);		
		}
	}
}