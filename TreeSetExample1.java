import java.util.*;

class  TreeSetExample1
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;
		//return I1.compareTo(I2); //[0,10,15,20]ascending order
		//return -I1.compareTo(I2);//[20,15,10,0]Descending order
		//return I2.compareTo(I1);  //[20,15,10,0]Descending order
		//return -I2.compareTo(I1);//[0,10,15,20]ascending order
        //return +1;//[10,0,15,20,20]insertion order
		//return -1;//[20,20,15,0,10]reverse of insertion order
		return 0; //[10] only first element will be inserted & all other as duplicate
	}
}
