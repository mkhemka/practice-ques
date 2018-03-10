import java.util.Scanner;

public class Golomb {

	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans[] = new int[n];
		ans[0]=1;
		ans[1]=2;
		int num=2,count=1;
		for (int i =2;i<n;i++)
		{
			ans[i] = num;
			if(count==1)
			{
				num=num+1;
				count = ans[num-1];
			}
			else
			{
				count--;
			}
			
		}
		
		
		for (int i =0;i<n;i++)
		{
			System.out.println(ans[i]);
			
		}
		
	}
}

/*
1
2
2
3
3
4
4
4
5
5
5
*/