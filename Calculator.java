package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1, num2, ch, cal;
		System.out.println("enter two numbers");
		Scanner s=new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println("select operation");
		ch=s.nextInt();
		
		 if(ch==1)
		{
			cal=num1+num2;
			System.out.println("Addition is " +cal);
		}
		else if(ch==2)
		{
			cal=num1-num2;	
			 System.out.println("Subtraction is " +cal);
		}
		else if(ch==3)
		{
			cal=num1*num2;	
			 System.out.println("Multiplication is " +cal);
		}
		else if(ch==4)
		{
			cal=num1/num2;	
			 System.out.println("Division is " +cal);
		}
		else
		{
			cal=num1%num2;	
			 System.out.println("Remainder is " +cal);	
		}
		
		
	}

}
