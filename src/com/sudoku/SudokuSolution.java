package com.sudoku;

import java.util.Set;

public class SudokuSolution
{
	private Sudoku puzzle;

	public SudokuSolution(Sudoku puzzle)
	{
		this.puzzle = puzzle;
	}

	public void solve()
	{
		Set<Integer> possVal = null;
		for (int iteration = 0; iteration < 82; iteration++)
		{
			for (int row = 0; row < 9; row++)
			{
				for (int col = 0; col < 9; col++)
				{
					if (puzzle.getData(row, col) == -1)
					{
						possVal = puzzle.getPossibleVals(row, col);
						if (possVal.size() == 1)
						{
							for (Integer integer : possVal)
							{
								puzzle.setData(row, col, integer);
							}

						}
					}
				}
			}
		}
	}
}
