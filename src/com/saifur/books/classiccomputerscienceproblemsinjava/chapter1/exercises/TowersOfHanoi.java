package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.exercises;

public class TowersOfHanoi
{
	

	public static void main(String[] args)
	{
		TowersOfHanoi th = new TowersOfHanoi();
		
		th.move(3, 1, 3, 2);

	}
	
	
	public void move(int disks, int towerA, int towerC, int helperTower)
	{
		if(disks <= 0)
		{
			return;
		}
		else
		{
			move(disks-1, towerA, helperTower, towerC);
			System.out.println("Moved disk " + disks + " from " + towerA + " to " + towerC);
			move(disks-1, helperTower, towerC, towerA);
		}
	}

}
