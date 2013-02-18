package Blmbg;

public class ShortestEditDistance {
	/*
	 * Dynamic Programming
	 * Similar with LCS
	 * F(i,j) = Base case f(0,0) = 0 ;
	 * 			f(i,0) = i ; // string x prefix i to an empty string delete 
	 * 			f(0,j) = j ; // empty string to prefix j, insert 
	 * 			F(i-1,j-1) if i=j ;
	 * 			min {F(i-1,j) + 1 , F(i,j-1)+1, F(i-1,j-1) +1  }
	 * 				// delete a letter from x to convert to y     , insert  a letter from i to convert to y , replace 
	 * */
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int M = word1.length() ;
        int N = word2.length() ;
        int[][] min = new int[M+1][N+1] ;
        for(int i = 0; i <M+1; i++) // delete from x to y empty string
          min[i][0] = i ;    
        for(int j = 0 ; j < N+1 ; j++) // insert character from empty string to y 
            min[0][j] = j ; 
            
        for(int i=1; i <= M ; i ++)
            for(int j = 1 ; j<= N ; j ++)
            {
                if(word1.charAt(i-1) == word2.charAt(j-1))
                {
                    min[i][j] = min[i-1][j-1] ; // (x-1,y-1 same)
                }
                else
                {
                    min[i][j] = Min(min[i-1][j]+1, min[i][j-1]+1, min[i-1][j-1]+1) ; // delete, insert, replace
                }
            }
        
        for(int i = 0 ; i < M+1; i ++)
        {
        	for(int j = 0 ; j < N+1 ; j ++)
        		 System.out.print(" " + min[i][j]) ;
        	 System.out.println() ;
        }
  			 
  	 
            
            return min[M][N]; 
      }
      public int Min(int a, int b, int c)
      {
        return Math.min( Math.min(a,b),c) ;
      }
 
      
      public static void main(String[] arsg)
      {
    	  ShortestEditDistance sd = new ShortestEditDistance();
    	  
    	  System.out.println( sd.minDistance("wangyan", "yanwang")) ;
      }
}