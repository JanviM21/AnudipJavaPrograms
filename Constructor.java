Program Name:-Default Constructor

package anudip;

public class DefaultConstructor
{
 int id;
 String name;
 
 DefaultConstructor()
 {
	 id='1';
	 name="janvi";
 }
 void display()
 {
	 System.out.println("Id: "+id);
	 System.out.println("Name: "+name);
 }
	
 public static void main(String[] args)
 {
	 DefaultConstructor s1=new DefaultConstructor();
	 s1.display();
  }

}

Output:-
Id: 49
Name: Janvi


Program Name:-Parameterized Constructor

package anudip;

public class ParametrizedConstructor
{
  int id;
  String name;
  
  ParametrizedConstructor(int id,String name)
  {
	  this.id=id;
	  this.name=name;
  }
  void display()
  {
	  System.out.println("Id: "+id);
	  System.out.println("Name: "+name);
  }
  public static void main(String args[])
  {
	  ParametrizedConstructor pc=new ParametrizedConstructor(101,"Janvi");
	  pc.display();
  }
}

Output:
Id: 101
Name: Janvi
