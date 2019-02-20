
public class Animals 
{
	String color;
	int legs;
	String name;
	String species;
	String gender;
	
	public Animals(String color, int legs, String name, String species, String gender)
	{
		this.color = color;
		this.legs = legs;
		this.name = name;
		this.species = species;
		this.gender = gender;
	}
	int mutation()
	{
		return legs + 1;
	}
	
	
	void welcome()//run do what it has to do, won't return value
	{
		System.out.println("Aren't you a cute... " + species);
	}


	public static void main(String[] args)
	{
		Animals ani = new Animals("Yellow", 4, "Teddy", "Mongoose", "Female");
		Animals ani1 = new Animals("Orange", 2, "Trump", "Human", "Male");
		
		System.out.println(ani.name);
		System.out.println(ani1.name);
		System.out.println(ani.legs);
		ani.legs = ani.mutation();
		System.out.println(ani.legs);
		
		ani1.welcome();
	}
}
	