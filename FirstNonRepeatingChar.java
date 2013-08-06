package Blmbg;

import java.util.HashMap;

public class FirstNonRepeatingChar
{
    public static Character firstNon(String s)
    {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>() ;
        char[] words =s.toCharArray() ;
        for(int i = 0 ; i <s.length() ; i ++ )
        {
            Integer freq = map.get(words[i]) ;
            map.put(words[i], freq == null ? 1 : freq+1) ;
        }
        
        for(int i = 0 ; i <s.length() ; i ++)
        {
            if( map.get(words[i]) == 1)
                {
                    return words[i];
                }
        }
        
        return null ;
    }
    
    public static void main(String[] args)
    {
        String s = "aabbccddeffghic" ;
        System.out.println("The first non-repeating char is : " + firstNon(s) ) ;
    }
}
