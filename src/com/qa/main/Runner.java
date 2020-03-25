package com.qa.main;

public class Runner 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numberToLoop = 100;
		int loopMaxNumber = 11;
		int loopCurrentNumber = 1;
		Iteration iterateNumbers = new Iteration();
		iterateNumbers.appendixBFlowchartLoop(numberToLoop);
		iterateNumbers.printOneToTenTenTimes();
		iterateNumbers.printNumbersToValues(loopMaxNumber, loopCurrentNumber);

	}

}
