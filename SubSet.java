package Project;

public class SubSet
{
    public int[] Array ;
    public SubSet(int[] A)
    {
        this.Array = A ;
    }
    public void findSubset()
    {
        int totalSubsets = 1<< Array.length ; // total of subsets
        for(int i = 0 ; i < totalSubsets ; i ++)
        {
            int index = 0;
            int bitmask = i ;
            System.out.print("{") ;
            while( bitmask>0)
            {
                if((bitmask&1) ==1) // only when last position bitmask =1  then print the element
                {
                    System.out.print( Array[index] + ",");
                }
                index ++ ;
                bitmask>>=1 ;
            }
            System.out.print("}") ;
        }
    }
    public static void main(String[] args)
    {
        int A[] ={1,2,3,4} ;
        SubSet sb = new SubSet(A) ;
        sb.findSubset();
    }
}
