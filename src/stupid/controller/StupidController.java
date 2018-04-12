package stupid.controller;

import stupid.model.ThirdStupid;

public class StupidController
{
	private String [] words = {"Ryan", "Mason", "Sheradon", "Preston"};
	private int [] numbers;
	private ThirdStupid [] stupids;
	
	public StupidController()
	{
		words = new String [5];
		numbers = new int [10];
	}
	
	public void start()
	{
		
		int x = 10;
		int y = 5;
		System.out.println("My name is Sean, I like DECA!"+x+y);
		System.out.println(words);
		System.out.println(numbers);
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		// keep on going or use a loop
		words = new String [] {"Brandon", "Zane", "Amber", "Brittany", "Jeran", "Dylan"};
		
		for (int index = 0; index < numbers.length; index += 1)
		{
			numbers[index] = index + 1;
		}
		
		showLoopWithArray();
	}
	
	private void showLoopWithArray()
	{
		for (String current : words)
		{
			System.out.println(current);;
		}
		
		for (int index = 0; index < numbers.length; index += 1)
		{
			System.out.println(numbers[index]);
		}
	}
}
