package Project;


	public  class Premutation
	{
	    public String s ;
	    public Premutation(String s)
	    {
	        this.s = s ;
	    }
	    public void getPremu(String s,String end)
	    {
	        if(s == null) return ;
	        if(end.length() ==1)
	            System.out.println(s + end) ;
	        else
	           {
	               for(int i = 0 ; i < end.length() ; i ++)
	               {
	                   getPremu(s+ end.charAt(i) , end.substring(0,i) + end.substring(i+1)) ;
	               }
	           }   
	    }
	    public void getPremu()
	    {
	        getPremu("",this.s) ;
	    }
	    public static void main(String[] agrs)
	    {
	    	//String s = "premutation" ;
	    	//System.out.println(s.substring(0, 0)) ;
	        Premutation pm =new Premutation("String") ;
	        pm.getPremu() ;
	    }

	
}
