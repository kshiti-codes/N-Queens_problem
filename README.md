# N-Queens_problem

## Explanation
1. Main Method:

Initializes the size of the board (n).
Calls the solveNQueens method to solve the problem.

2. solveNQueens Method:

Initializes an empty board.
Calls the solveNQueensUtil method to solve the board starting from the first row.
Prints the board if a solution is found, otherwise prints a message indicating no solution exists.

3. solveNQueensUtil Method:

This is the recursive backtracking method.
Tries placing a queen in each column of the current row.
If placing the queen is safe (checked by isSafe method), it places the queen and recursively tries to solve for the next row.
If placing the queen does not lead to a solution, it removes the queen (backtracks) and tries the next column.
Returns true if all queens are placed successfully; otherwise, false.

4. isSafe Method:

Checks if placing a queen at board[row][col] is safe.
Ensures no other queens are in the same column or diagonals.

5. printBoard Method:

Prints the board with queens represented by 'Q' and empty spaces by '.'.

## Complexity Analysis
### Time Complexity
The time complexity of the N-Queens problem using backtracking can be quite high due to the number of possible configurations:

1. Worst Case:

The worst-case time complexity is O(N!). This is because in the first row we have N choices, in the second row (N-1) choices, in the third row (N-2) choices, and so on, leading to N! possible ways to place the queens.

2. Average Case:

The average case can be better due to the pruning of invalid placements by the isSafe method. However, the worst-case scenario still dominates the complexity.

### Space Complexity
The space complexity is determined by the size of the board and the recursion stack:

1. Space Complexity:
   
The space complexity is O(N^2) for storing the board.
The recursion stack depth is O(N) in the worst case, but since N^2 dominates, the overall space complexity is O(N^2).
