package Project;

public class Shuffle
{
    public int[] array ;
    public Shuffle(int[] array)
    {
        this.array = array ;
    }
    public void shuffleCard()
    {
       for(int i = 0 ; i < array.length ; i ++)
        { 
        int index = (int)(Math.random()*(array.length -i)) + i ;
        System.out.println("Length=" + array.length + "index= " +index + " i=" + i) ;
        int temp = array[i] ;
        array[i] = array[index] ;
        array[index] = temp ;
        }
        
    }
    public static void main (String[] args)
    {
        int array[] = {3,4,5,6,7,8,9,0,10} ;
        Shuffle sf = new Shuffle(array) ;
        sf.shuffleCard() ;
        for(int i = 0 ; i < array.length; i ++)
        System.out.print(" "+array[i]) ;
    }
}