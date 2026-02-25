

/*
 2.Write a Java program that demonstrates method overriding by creating a superclass called Animal
   and two subclasses called Dog and Cat. ● TheAnimal class should have a method called makeSound(),
   which simply prints "The animal makes a sound." ● TheDogandCatclasses should override this method
   to print "TheCat/The dog meows/barks" respectively. ● Theprogram should allow the user to create 
   and display objects of each class. [Hint:Use multilevel inheritance]
 */

package javaprograms;
class Animal
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog barks");
	}
}

class Cat extends Dog
{
	void makeSound()
	{
		System.out.println("The Cat meows");
	}
}
public class Main1 {

	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.makeSound();

		Dog d=new Dog();
		d.makeSound();

		Cat c= new Cat();
		c.makeSound();
	}

}

/*
 Output:-
 Animal makes a sound
 Dog barks
 The Cat meows
 */


