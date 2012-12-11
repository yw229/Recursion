package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortHashMap {
    public String[] words ;
    public HashMap<String, Integer> wordMap ;
    public SortHashMap(String[] words)
    {
        this.words = words ;
        wordMap = new HashMap<String,Integer>() ;
    }
    public HashMap<String, Integer> getFreq()
    {
        for(String s : words)
        {
            Integer freq = wordMap.get(s);
            wordMap.put(s,freq == null ? 1 : freq+1) ;
            
        }
        return wordMap ;
    } 
    @SuppressWarnings("unchecked")
	public HashMap< String,Integer> SortValueMap(HashMap<String,Integer> input)
    {
        HashMap<String, Integer> temp = new HashMap<String,Integer>() ;
        for(String s : input.keySet())
            temp.put(s, input.get(s));
        
        List<String> KeySet = new ArrayList<String>(temp.keySet()) ; // string key 
        List<Integer> ValueSet = new ArrayList<Integer>(temp.values()) ; // freqency 
        HashMap<String,Integer> sortedMap = new LinkedHashMap<String,Integer>() ;
        /* Collections.sort(KeySet) ;
        Collections.sort(ValueSet) ;
        
        
        /*TreeSet<Integer> sortedValueSet = new TreeSet<Integer>(ValueSet); // sorted freqency set 
        Object[] sortedArray = sortedValueSet.toArray() ;
        for(int i= 0 ; i < sortedArray.length ; i ++)
        {
            sortedMap.put(KeySet.get(ValueSet.indexOf(sortedArray[i])) , (Integer)sortedArray[i]) ;
        }*/
        /*Iterator<Integer> valueIt = ValueSet.iterator() ; 
        
        while(valueIt.hasNext())
        {
        	Object val = valueIt.next() ;
        	Iterator<String> keyIt = KeySet.iterator() ; 
        	
        	while(keyIt.hasNext())
        	{
        	Object key = keyIt.next() ;
        	String comp1 =temp.get(key).toString() ;
        	String comp2 = val.toString() ;
        	
        	if(comp1.equals(comp2))
        	{
        		temp.remove(key) ;
        		KeySet.remove(key) ;
        		sortedMap.put((String) key, (Integer) val) ;
        		break;
        	}
        	}
        }
         return sortedMap ;  
         */
      //
       List< Map.Entry<String, Integer> > list = new 
    		   ArrayList< Map.Entry<String,Integer> >(temp.entrySet()) ;
        Collections.sort(list , new Comparator<Object>() 
        {
        	
			public int compare(Object o1, Object o2)
        	{
        		return  ( (Comparable<Integer>) ((Map.Entry<String,Integer>)o1).getValue() ).compareTo 
        				( ((Map.Entry<String,Integer>)o2).getValue() ) ;
        	}
        	
        }
        );
        Iterator<Map.Entry<String, Integer>> listIt = list.iterator() ;
        while (listIt.hasNext())
        {
        	Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) listIt.next() ;
        	sortedMap.put(entry.getKey(), entry.getValue()) ;
        }
        return sortedMap ;
      
    }
    public void printMap()
    {
    	HashMap< String,Integer> sorted = new HashMap< String,Integer>() ;
    	sorted = SortValueMap(wordMap) ;
    	for(String st : sorted.keySet())
    	{
    		System.out.println(st + " " + sorted.get(st)) ;
    	}
    }
    public static void main(String[] args)
    {
    	String[] words= {"a","b" ,"d" ,"a","a","c" , "b"} ;
    	SortHashMap st = new SortHashMap(words) ;
    	HashMap<String, Integer> freq = new HashMap<String,Integer>() ;
    	freq = st.getFreq() ;
    	for(String s : freq.keySet())
    		System.out.println( "before " + s + freq.get(s)) ;
    	st.SortValueMap( freq ) ;
    	
    	st.printMap() ;
    }
}