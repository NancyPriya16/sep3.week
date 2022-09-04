package main.newpack;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0, secNum = 1, sum = firstNum+secNum;
		System.out.println(firstNum);
		System.out.println(secNum);
		System.out.println(sum);
		for(firstNum=2;firstNum<=11;firstNum++)
		{		
		    firstNum=secNum;
			secNum=sum;
			sum=firstNum+secNum;			
			System.out.println(sum);
		}
		
	}

}
