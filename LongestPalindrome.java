package Blmbg;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function     
        String max = new String() ;
        int maxl = 0 ; 
        
        for(int i = 0 ; i < s.length() ; i ++) // arbitrarily  select(start,end) from original string O(n2)
         for(int j = i+1 ; j < s.length() ; j++) // brute force solution
         {
           
                if( valid(s.substring(i,j) )) // check if it is palidrome 
                {
                    if(maxl< s.substring(i,j).length())
                    {
                        max=  s.substring(i,j) ; // return the palidrome with longest length 
                        maxl = Math.max( s.substring(i,j).length() , maxl );
                    }
                } 
         }
           
    return max ;
    }
    /*Optimized solution 
     * pick each value as mid in panlidrome ;
     * traverse in both directions left, right to find the panlidrom 
     * */
    public String longestP(String s)
    {
    	int maxl = 0 ;
    	String max = new String();

    	for(int i = 0 ; i < s.length() ; i++)
    	{
    		int start = i ,end = i ; //  odd 1234321
    		while(start >=0 && end <s.length())  // make sure both edge valid 
    		{
    			if(s.charAt(start) == s.charAt(end ))
    			{ 				
    				//if(end - start > lend - lstart)
    				if(maxl < s.substring(start,end+1).length() )
    	    		{
    	    			maxl = s.substring(start,end+1).length() ;
    	    			max = s.substring(start, end+1) ;
    					//lstart = start ;
    					//lend = end ;
    	    		}
    			}
    			start -- ;
    			end ++ ;
    		}
    		
    		start = i ; end = i+1 ; // even 123321
    		while(start >=0 && end <s.length())  // make sure both edge valid 
    		{
    			if(s.charAt(start) == s.charAt(end ))
    			{ 				
    				if(maxl < s.substring(start,end).length())
    				//if(end-start > lend-lstart)
    	    		{
    					maxl = s.substring(start,end+1).length() ;
    	    			max = s.substring(start, end+1) ;
    					//lstart = start ;
    					//lend = end ;
    	    		}
    			}
    			start -- ;
    			end ++ ;
    		}
    		
    		
    	}
    	return  max;//s.substring(lstart, lend+1) ;
    }
    
    public boolean valid(String s) // support method to check palidrome validation 
    {
        if(s==null) return true ;
        for(int i = 0 ; i < s.length()/2 ; i ++)
        {
            if(s.charAt(i)!= s.charAt(s.length()-1-i) )
                return false ;
        }
        return true ;
        
    }
    public static void main(String[] args)
    {
    	String s = "aaaaaabcdeffedcbfff";
    	LongestPalindrome lp = new LongestPalindrome() ;
    	System.out.println(lp.longestPalindrome(s) +" " + lp.longestP(s)) ;
    }
}