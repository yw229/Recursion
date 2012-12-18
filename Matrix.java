package LinkedIn;

import java.awt.Point;
import java.util.ArrayList;

public class Matrix {
	public static int randomIn(int n)
	{
		return (int) (Math.random()*n) ;
	}
	public static int randomInt(int m, int n)
	{
		return randomIn(m+1-n) + n ;
	}
	public static int[][] randomMatrix(int M, int N, int min, int max)
	{
		int[][] matrix = new int[M][N] ;
		for(int i= 0 ; i < M ; i ++)
			for(int j = 0 ; j < N; j ++)
			{
				matrix[i][j] = randomInt(max,min) ;
			}
		return matrix ;
	}
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}				
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}					
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);				
			}
			System.out.println();
		}
	}
	public static String listOfPointToString(ArrayList<Point> list)
	{
		StringBuffer sb = new StringBuffer() ;
		for(Point p : list)
		{
			sb.append("("+ p.x +","+ p.y + ")") ;
		}
		return sb.toString() ;
	}
}
