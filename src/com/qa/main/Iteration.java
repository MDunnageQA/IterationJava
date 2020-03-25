package com.qa.main;

public class Iteration 
{
	public void appendixBFlowchartLoop(int loopNumber)
	{
		while (loopNumber != 201)
		{
			if (loopNumber % 2 == 0)
			{
				System.out.println("-");
			}
			else
			{
				System.out.println("*");
			}
			loopNumber++;
		}
	}
	
	public void printOneToTenTenTimes()
	{
		for (int oneToTenNumberOne = 1; oneToTenNumberOne < 11; oneToTenNumberOne++)
		{
			
			for (int oneToTenNumberTwo = 1; oneToTenNumberTwo < 11; oneToTenNumberTwo++)
			{
				System.out.println(oneToTenNumberTwo);
			}
		}
	}

}
