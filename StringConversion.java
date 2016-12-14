class Test 
{
	public static void main(String[] args) 
	{
		//string to stringbuffer
		String str="cnu";
		StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
		//StringBuffer to string
		StringBuffer sb1=new StringBuffer("reddy");
        String  ss=sb1.toString();
		System.out.println(ss);
	}
}
