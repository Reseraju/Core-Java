package Abstract;

import java.util.Scanner;

public class Permanent extends Employee {
	private int bonus;
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void calBonus() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter salary: ");
		int sal = sc.nextInt();
		
		bonus = sal + (sal * 10/100);
		setBonus(bonus);
		System.out.println("bonus: " + getBonus());
	}
	
}
