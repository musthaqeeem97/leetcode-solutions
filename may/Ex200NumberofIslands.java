package may;

public class Ex200NumberofIslands {

	 public int numIslands(char[][] grid) {
		 
	        int islandCount = 0;
	        
	        int rows = grid.length;
	        if (rows==0) {
				return 0;
			}
	        int col = grid[0].length;
	        
	        for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					
					if (grid[i][j]=='1') {
						
						markIslands(grid, i, j, rows, col);
						islandCount += 1;
					}
				}
			}
	        return islandCount;
	    }

	private void markIslands(char[][] grid, int i, int j, int rows, int col) {
		
		//here it is important that i and j should never be >= rows and col respectively
		//here "=" is used because if i and j becomes equal to rows and col ,
		// they are already out of bound of index
		if (i<0||j<0||i>=rows||j>=col||grid[i][j]!='1') {
			return;
		}
		
		grid[i][j] = '2';
		
		markIslands(grid, i+1, j, rows, col);
		markIslands(grid, i-1, j, rows, col);
		markIslands(grid, i, j-1, rows, col);
		markIslands(grid, i, j+1, rows, col);
		
	}


		
	}

