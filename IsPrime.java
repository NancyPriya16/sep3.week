package main.newpack;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=2;
		int k=1;
		for(k=1;k<7;k++)
		{
		if(k %m==0)
		{
			System.out.println(k+ " Prime");
		}
		else
		{
			System.out.println(k+ " Not Prime");
		}
		}

	}

}

//Hint: Iterate through all numbers from 2 to n-1 (input) and 
//for every number check if it divides n (input). 
//If we find any number that divides, print prime.
//If nothing divides, then print non-prime

