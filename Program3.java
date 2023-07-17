package screeningtest;

import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter the value of x: ");
		int x = sc.nextInt();
		if(x%2==0)
		{
			x=x-1;
		}

		System.out.print("Output : ");
		for(int i=1;i<=x;i++)
		{
			System.out.print(2*i-1);
			if(i!=x)
				System.out.print(",");
		}
	}
}




