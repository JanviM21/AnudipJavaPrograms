

/*1.Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
Subclasses extend the superclass and override its location() and famousFor() method. 
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. 
As it refers to the base class object and the base class method overrides the superclass method; 
the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,
and print accordingly.*/
package javaprograms;


class HillStations
{
	void location()
	{
		System.out.println("Location Of Hillstations");
	}
	void famousFor()
	{
		System.out.println("Something is famous for");
	}
}

class Manali extends HillStations
{
	@Override
	void location()
	{
		System.out.println("Manali is famous for trek and adventures");
	}
	@Override
	void famousFor()
	{
		System.out.println("Manali is located in Himachal Pradesh");
	}
}
class Mussoorie extends HillStations
{
	@Override
	void location()
	{
		System.out.println("Mussoorie is located in Uttarakhand");
	}

	@Override
	void famousFor() 
	{
		System.out.println("Mussoorie is famous for Scenic Beauty");
	}
}
class Gulmarg extends HillStations
{
	@Override
	void location() {
		System.out.println("Gulmarg is located in Jammu & Kashmir");
	}

	@Override
	void famousFor() {
		System.out.println("Gulmarg is famous for Skiing");
	}
}

public class Main 
{
	public static void main(String args[])
	{
		HillStations hs;
		hs=new Manali();
		hs.location();
		hs.famousFor();

		hs=new Mussoorie();
		hs.location();
		hs.famousFor();

		hs=new Gulmarg();
		hs.location();
		hs.famousFor();
		
		Manali m=new Manali();
		m.location();
		m.famousFor();

		Mussoorie mu=new Mussoorie();
		mu.location();
		mu.famousFor();

		Gulmarg g=new Gulmarg();
		g.location();
		g.famousFor();
	}
}

/*
 Output:-
Manali is famous for trek and adventures
Manali is located in Himachal Pradesh
Mussoorie is located in Uttarakhand
Mussoorie is famous for Scenic Beauty
Gulmarg is located in Jammu & Kashmir
Gulmarg is famous for Skiing
*/
