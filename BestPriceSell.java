package Project;

import java.util.Random;

public class BestPriceSell
{
    public int[] array ;
    public BestPriceSell(int array[])
    {
        this.array = array ;
    }
    public void BestSell()
    {
        int min =0 ;
        int maxdiff = 0 ;
        int sell = 0 ; int buy = 0 ;
       
        for(int i=0 ; i < array.length; i ++)
        {
            if(array[i] < array[min])
                min = i ;
            int diff = array[i] - array[min] ;
            if(maxdiff <diff)
            { 
                sell = i ;
                buy =min ;
                maxdiff = diff ;
            }
        }
        System.out.println("buy at" + buy + ":" + "sell at" + sell + "maxdiff" + maxdiff) ;
    }
    public static void main(String[] args)
    {
    	int[] array= new int[10] ;
    	Random ran = new Random() ;
    	for(int i= 0 ; i < array.length ; i ++)
    	{
    		array[i] = ran.nextInt(10) ;
    		System.out.print(array[i]) ;
    	}
    	BestPriceSell bs = new BestPriceSell(array) ; 
    	bs.BestSell() ;
    }
}
