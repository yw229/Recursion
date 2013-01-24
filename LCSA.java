package Project;


/*
 * DP classic problem 
 * LCs longest common subsequence c[i,j], we can recursively get
 * c[i,j] = { 0   if i=0 or j = 0 ;
 * 			  c[i-1,j-1] if i,j > 0 and Xi=Yj ;
 *           Max( c[i-1,j] , c[i,j-1] ) if(i,j>0 and Xi!=Yi) 
 *           }
 * 
 * */
public class LCSA
{
    public String s1 ;
    public String s2 ;
    
    public LCSA(String s1, String s2)
    {
        this.s1 = s1 ;
        this.s2 = s2 ;
    }
    
    public void LongestCommonSubSequence()
    {
        int M = s1.length() ;
        int N = s2.length() ;
        
        int opt[][] = new int[M+1][N+1] ;
        int max = 0 ;
        
        for(int i =0 ; i <M; i++)
        	for(int j = 0 ; j<N; j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    opt[i+1][j+1] = opt[i][j] +1 ;
                    max = Math.max(max, opt[i+1][j+1]) ;
                }
                else
                opt[i+1][j+1] = Math.max( opt[i][j+1] , opt[i+1][j]  ) ;
            }
        
        for(int i= 0; i<M+1; i ++)
        	{
        		for(int j =0 ; j <N+1 ; j ++)
        		{
        			System.out.print(" " + opt[i][j]) ;
        			
        		}
                System.out.println();
        	}
        		
        System.out.println("longest" + max) ;
      
            
          // backtrack to get print the LCS   
        int i = 0 ; int j = 0 ;
        while(i<M && j < N)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                System.out.println(s1.charAt(i)) ;
                i++ ;
                j++ ;
            }
            else //left > above 
            	if( opt[i+1][j] >=  opt[i][j+1] )
            			i++ ;
            else 
            	j ++ ;
        }
        
        System.out.println() ;
    }
    public static void main(String[] args)
    {
    	String s1 = "abrdefts" ;
    	String s2 = "beftsa" ;
    	LCSA lsa = new LCSA(s1,s2) ;
    	lsa.LongestCommonSubSequence() ;
    }
}

