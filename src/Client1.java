
public class Client1 {

	public static void main(String[] args) {
				
		Dog myDog = new Dog("Rex");
		Dog yourDog = new Dog("Fred");
		
		//Making a reference
		Dog youngestDog = myDog;
		
		System.out.println("youngestDog.name" + youngestDog.name);
		
		// Changing the dog's name, using the reference:
		youngestDog.name = "Mutt";
		
		System.out.println("myDog.name: " + myDog.name); // now "Mutt"
		
		
		// Eliminate objects by changing references
		Dog one = new Dog("A");
		Dog two = new Dog("B");
		Dog three = new Dog("C");
		
		three = one;
		System.out.println("after three = one :");
		System.out.println("one.name: " + one.name);
		System.out.println("two.name: " + two.name);
		System.out.println("three.name: " + three.name);	// No more "C" dog!
		// "C" is now up for "Garbage Collection", and is no longer in memory
		
		
		// Remove an object from memory manually:
		three = null;
		System.out.println("after three = null :");
		System.out.println("one.name: " + one.name);
		System.out.println("two.name: " + two.name);
		System.out.println("three.name: " + three.name);
		
		try {
			System.out.println("three.name: " + three.name);	//pointing to no object
		}
		catch(NullPointerException e){
			System.out.println("no object assigned to 'three'");
		}
		/*
		 * catch(Exception e) {
		{
			System.out.println("general exception");
		}
		*/
	}

}
