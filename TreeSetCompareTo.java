class TreeSetCompareTo 
{
	public static void main(String[] args) 
	{
		System.out.println("A".compareTo("Z")); //+ve
		System.out.println("Z".compareTo("B")); //-Ve
		System.out.println("A".compareTo("A")); //0
		System.out.println("A".compareTo(null));//NullPointerException
	}
}
