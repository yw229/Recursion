package LinkedIn;

public class EightQueen {
	public static int[] rowColum = new int[8] ;
	
	public static boolean Validation(int row) // given a row ,check if the position is valid 
	{
		for(int i = 0 ; i < row ; i ++)
		{
			int diff = Math.abs(rowColum[row] - rowColum[i]) ; 
			if(diff == 0 || diff ==row - i) // same column or diagonal   not valid 
				return false ;
		}
		return true ;
	}
	public static void printBorad()
	{
		System.out.println("-----------------");
		for(int i = 0 ;i <8 ; i ++)
		{
			System.out.print("|"); 
			for(int j = 0 ; j < 8 ; j ++)
			{
				if(rowColum[i] == j)
					System.out.print("Q|") ;
				else
					System.out.print(" |") ;
				
			}
			System.out.println("\n-----------------");
		}
		System.out.println("") ;
	}
	public static void placeQueen(int row)
	{
		if(row == 8)
		{
			printBorad() ; 
			return ; 
		}
		for(int i = 0; i < 8 ; i ++)
		{
			rowColum[row] = i ;
			if(Validation( row))
			{
				placeQueen(row+1) ;
			}
		}
			
	}
	public static void main(String[] args)
	{
		placeQueen(0) ;
	}

}
