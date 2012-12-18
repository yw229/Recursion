package LinkedIn;

import java.awt.Point;
import java.util.ArrayList;

public class Robot
{
    public int[][] maze = new int[10][10] ;
    public boolean is_free(int x, int y)
    {
        if(maze[x][y] == 0) return false ;
        else return true ;
    }
    public ArrayList<Point> currentPath = new ArrayList<Point>();
    public boolean getPaths(int x, int y)
    {
    	Point p = new Point(x, y);
		currentPath.add(p);
		if (0 == x && 0 == y) {
			return true; // current_path;
		}
		boolean success = false;
		if (x >= 1 && is_free(x - 1, y)) { // Try right
			success = getPaths(x - 1, y); // Free!  Go right
		}
		if (!success && y >= 1 && is_free(x, y - 1)) { // Try down
			success = getPaths(x, y - 1); // Free!  Go down
		}
		if (!success) {
			currentPath.remove(p); // Wrong way! Better stop going this way
		}
		return success;
    } 
    public static void main(String[] args)
    {
    	Robot rb = new Robot();
        rb.maze = Matrix.randomMatrix(10, 10, 0, 9); 
        Matrix.printMatrix(rb.maze);
        rb.getPaths(9,9) ;
        String s =Matrix.listOfPointToString(rb.currentPath);
        System.out.println(s) ;
    }

}
