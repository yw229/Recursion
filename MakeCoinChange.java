package LinkedIn;
public class MakeCoinChange
{
    public static int makeChange(int n , int demon)  // given the total number of n, and coin value 
    {
        int next_demon = 0 ;
        switch(demon)
        {
            case 25 : 
                next_demon =10;
                break ;
            case 10 : 
                next_demon = 5 ;
                break ;
            case 5 : 
                next_demon = 1 ;
            case 1 : 
                return 1 ;
                
        }
        int ways = 0 ; 
        for(int i= 0 ; i *demon <=n ; i++ )
        {
            ways+= makeChange(n-i*demon,next_demon)  ;
        }
        return ways ;
    }
    public static int makeChange(int n)
    {
    	return makeChange(n,25);
    }
    public static void main(String[] args)
    {
        for(int i= 0 ; i < 100 ; i ++)
        {
            System.out.println("Make Changes (+ " + i + ")=" + makeChange(i) ) ; 
        }
    }
}