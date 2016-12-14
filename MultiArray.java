class Animal{}
class Dog extends Animal{}
class DogKid extends Dog{}

class MultiArray 
{
	public static void main(String[] args) 
	{
		Animal[] a=new Animal[3];
		a[0]=new Animal();
		a[1]=new Dog();
		a[2]=new DogKid();
		for(Animal aa:a)
		{
			System.out.println(aa.toString());
			}
	}
}
