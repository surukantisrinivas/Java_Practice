package com.tcs.bank.deposit;
package com.ibm.bank.loan;
class Test 
{
	public static void main(String[] args) 
	{    //string class equals() executed
		String s1="cnu";
		String s2="reddy";
		String s3="cnu";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
		System.out.println("CNU".equals("cnu"));
		System.out.println("CNU".equalsIgnoreCase("cnu"));
		
     //compareTo--->int
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));

		
		System.out.println("CNU".compareTo("cnu"));
		System.out.println("CNU".compareToIgnoreCase("cnu"));


	}

}
