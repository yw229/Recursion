package Blmbg;

public class LCSubstring {
	/*
	 * DP to find the longest common Subsequence 
	 * 
	 * c[i,j] = { 0 (if(i=0,j=0)) ;
	 * 				c[i-1,j-1] + 1  ; if (xi=yi ,i>0,j>0)
	 *  			Max{ c[i-1,j] , c[i,j-1]} ; if(xi!=yi,i>0,j>0)
	 * 			}
	 * 
	 * */
	public String x ;
	public String y ;
	public LCSubstring(String x , String y)
	{
		this.x = x ;
		this.y = y ;
	}
	public String findLCS()
	{
		int M = x.length() ; 
		int N = y.length() ;
		int opt[][] = new int[M+1][N+1] ; // c[i,j] longest length 
		int max = 0;
		for(int i = 0 ; i < M; i++)
			for(int j = 0 ; j < N ; j++)
			{
				if( x.charAt(i) == y.charAt(j))
				{
					opt[i+1][j+1] = opt[i][j] + 1 ; 
					//System.out.println("longest length" +i+j+ opt[i][j]) ;
				}
				
				else
					opt[i+1][j+1] = 0 ;//else = 0 
				
				max= Math.max(max, opt[i+1][j+1] );
			}
		
		for(int i = 0 ; i <M+1 ; i ++)
		{
			for(int j = 0 ; j < N+1 ; j ++)
				System.out.print(" "+opt[i][j]) ;
			System.out.println() ;
		}
		System.out.print(" "+max) ;
	/*	int i = M-1 ;int j= N-1;
		while( i >=1 && j>=1)
		{
			if(x.charAt(i) == y.charAt(j))
			{
				System.out.println(x.charAt(i)) ;
				i-- ;
				j-- ;
			}else
				if( opt[i-1][j] > opt[i][j-1]) i--  ;
				else j-- ;
					
		}
		System.out.println() ;
	}*/
		for(int i = 1 ; i <M ; i++)
			for(int j = 1 ; j < N; j++)
			{
				//if(max>1)
				if(x.charAt(i-1) == y.charAt(j-1) && x.charAt(i) == y.charAt(j)  )
				{
					return ( x.substring(i-1, i-1+max) ) ;
				}
				
				
			}
		//System.out.println() ;
		//return x.substring(0,max) ;
		return null;
	}
	
	public static void main(String[] args)
	{
		String s1 = "abrdefts" ;    	
		String s2 = "aebrd" ;   
		LCSubstring ls = new LCSubstring(s1,s2) ;    	
		System.out.println(ls.findLCS()) ;
	}

}
