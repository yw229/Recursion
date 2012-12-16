package Project;

public class isRotatedString {
	public String s1 ;
	public String s2 ;
	public isRotatedString(String s1, String s2)
	{
		this.s1= s1 ;
		this.s2 = s2 ;
	}
	public boolean isRotated()
	{
		return (s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1) ;
	}
	public static void main(String[] args)
	{
		String s1 = "abcd" ;
		String s2 = "cdab" ;
		isRotatedString is = new isRotatedString(s1,s2) ;
		System.out.println( is.isRotated() ) ;
		
	}
}
