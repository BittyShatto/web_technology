import java.io.*;
public class CSum
{
	public static void main(String args[])
	{
		DataInputStream din;
		int num1;
		int num2;
		String s;
		din= new DataInputStream(System.in);

		try
		{
			System.out.println("Enter the first number:");
			s=din.readLine();
			num1=Integer.parseInt(s);
			System.out.println("Enter the second number:");
			s=din.readLine();
			num2=Integer.parseInt(s);

			System.out.println("Sum= " +(num1+num2));
		}
		catch(Exception e)
		{
			System.out.println("Error:" +e);
		}

	}
}