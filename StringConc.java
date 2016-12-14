class StringConc 
{
	public static void main(String[] args) 
	{  //immutable nature
		String s1="cnu";
		s1.concat("soft");
		System.out.println(s1);
       //mutable nature
		StringBuffer sb=new StringBuffer("reddy");
		sb.append("soft");
		System.out.println(sb);
	}
}
