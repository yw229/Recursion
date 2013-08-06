package Project;

public class LongestCommonPrefix {
	public static String longest(String[] words)
	{
		if(words.length == 0) return "";
		int i = 0 ; int len=words[0].length() ;
		for(int j = 1 ; j < len ; j ++)
		{
			if (len > words[j].length())
			{
				len = words[j].length() ;
				i = j ;
			}
		}
		
		
		for(int l = 0 ; l < len ; l ++)
		{
			for(int k = 1 ; k < words.length ; k ++)
			{
				if( words[k].charAt(l) !=words[0].charAt(l)) 
				{
					return words[0].substring(0,l);
				}
			}
				
		}
		return words[i] ;
	}
	public static void main(String[] args)
	{
		String[] words = {"ac", "abc","aac"} ;
		System.out.println(longest(words)) ;
	}
}
