package lab1;

import java.util.Scanner;
import java.util.regex.Pattern;


public class StringTask2 {
	
	static double [] data = new double[10];
	static int count = 0;
	
	public static void evaluate(String expression)
	{
		//String [] data = new String[10];
		String [] op = new String[10];
		double result = 0;
		int count = 0;
		
		
		for(int i = 0; i < expression.length(); i++)
		{
			char c = expression.charAt(i);
			if(c =='+' || c == '-' || c == '*' || c == '/')
			{
				op[count] = Character.toString(c);
				count++;
			}
				
		}
		
		
		result = result + data[0];
		//hariugaa bodoh heseg
		for(int j = 0 ; j < data.length; j++)
		{
			if(data[j] != 0)
			{
				if(op[j]!=null)
				{
					switch(op[j])
					{
						case "+" :
							result = result + data[j+1];
							break;
						case "-" :
							result = result -  data[j+1];
							break;
						case "*" :
							result = result *  data[j+1];
							break;
						case "/" :
							result = result /  data[j+1];
							break;	
					}
				}	
			}
		}
		System.out.println(expression + " = " + result);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("tegshitgelee oruulnuu : ");
		
		
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			{
				System.out.println(c + " -н утгыг оруулна уу");
				data[count] = sc.nextInt();
				count ++;
			}
		}
		evaluate(str);
		
		
	}
}