import java.util.*;
class  TreeSetComparator
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("Shoba Rani");
		t.add("Raja Kumari");
		t.add("Ganga Bhavani");
		t.add("Ramulamma");

		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		//return -s1.compareTo(s2); //Descending order
		//return s2.compareTo(s1); //Descending order
		//return s1.compareTo(s2); //Ascending order 
		return -s2.compareTo(s1); 
	}
}
