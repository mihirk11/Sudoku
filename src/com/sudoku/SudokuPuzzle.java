package com.sudoku;
import java.util.Scanner;


public class SudokuPuzzle
{
	static Sudoku myPuzzle= new Sudoku();
	
	public static void main(String args[])
 {	
		int row,col,val;
		System.out.println("Enter given triplets");
		Scanner sc= new Scanner(System.in);
		/*while(true)
		{
			System.out.print("Enter row:");
			row= sc.nextInt();
			System.out.print("Enter column:");
			col= sc.nextInt();
			System.out.print("Enter value:");
			val= sc.nextInt();
			try{
				myPuzzle.setData(row, col, val);
				
			}
			catch(IllegalArgumentException ex)
			{
				System.out.println("Entered values are wrong");
				continue;
			}
			System.out.print("Anymore values?(y/n):");
			if("n".equals(sc.next()))
			{
				break;
			}
		
		}*/
		myPuzzle.setData(0, 4, 2);
		myPuzzle.setData(0, 6, 7);
		myPuzzle.setData(0, 8, 5);
		myPuzzle.setData(1, 0, 9);
		myPuzzle.setData(1, 6, 6);
		myPuzzle.setData(1, 7, 8);
		myPuzzle.setData(2, 1,7 );
		myPuzzle.setData(2, 3, 8);
		myPuzzle.setData(2, 4, 9);
		myPuzzle.setData(2, 5, 5);
		myPuzzle.setData(2, 6, 2);
		myPuzzle.setData(3,1,3);
		myPuzzle.setData(3,3,4);
		myPuzzle.setData(3,4,6);
		myPuzzle.setData(3,5,1);
		myPuzzle.setData(3,8,8);
		myPuzzle.setData(4,0,4);
		myPuzzle.setData(4,3,2);
		myPuzzle.setData(4,5,9);
		myPuzzle.setData(4,8,7);
		myPuzzle.setData(5,0,2);
		myPuzzle.setData(5,3,7);
		myPuzzle.setData(5,4,5);
		myPuzzle.setData(5,5,8);
		myPuzzle.setData(5,7,4);
		myPuzzle.setData(6,2,6);
		myPuzzle.setData(6,3,5);
		myPuzzle.setData(6,4,8);
		myPuzzle.setData(6,5,3);
		myPuzzle.setData(6,7,7);
		myPuzzle.setData(7,1,8);
		myPuzzle.setData(7,2,7);
		myPuzzle.setData(7,8,1);
		myPuzzle.setData(8,0,5);
		myPuzzle.setData(8,2,9);
		myPuzzle.setData(8,4,1);
		System.out.println("Your puzzle is:");
		printGrid();
		
		SudokuSolution solution=new SudokuSolution(myPuzzle);
		solution.solve();
		System.out.println();
		System.out.println();
		System.out.println("solution is:");
		printGrid();
		
 }
	private static void printGrid()
	{
		Integer a[][]=new Integer[9][9];
		for(int i=0;i<9;i++)
		{
			if (i%3==0)
			{
				System.out.println();
			}
			for(int j=0;j<9;j++)
			{
				if (j%3==0)
				{
					System.out.print("  |  ");
				}
				if(myPuzzle.getData(i, j)==-1)
				{
					System.out.print(" _ ");
				}else
				{
					System.out.print(" "+myPuzzle.getData(i, j)+" ");
				}
					
			}
			System.out.println("|");
			
		}
	}
  
}
