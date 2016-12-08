package mini.controller;

import java.util.Scanner;

public class MiniController 
{
	private int[] rows = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	private int[] columns = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	private Scanner keyboard;
	
	public MiniController()
	{
		keyboard = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("test");
		rows = constructArray("rows.");
		columns = constructArray("columns.");
		makeTable();
	}
	
	private int[] constructArray(String array)
	{
		int[] temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int index = 0; index < 10; index ++)
		{
			System.out.println("What you you like to go in spot " + index + " for the " + array);
			temp[index] = getInt();
		}
		
		return temp;
	}
	
	private int getInt()
	{
		int tempInt = 0;
		try
		{
			tempInt = keyboard.nextInt();
		}
		catch(NumberFormatException notIntError)
		{
			System.out.println("Not a valid int defaulting to 0");
		}
		
		return tempInt;
	}
	
	private void makeTable()
	{
		int one = 0;
		int two = 0;
		for(int index1 = 0; index1 < 10; index1 ++)
		{
			
			
			for(int index2 = 0; index2 < 10; index2 ++)
			{
				one = rows[index1];
				two = columns[index2];
				
				System.out.print((one*two) + "        ");
				
				
			}
			
			System.out.println();
		}
	}
	
}
