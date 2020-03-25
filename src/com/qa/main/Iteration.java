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

}
