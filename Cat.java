import java.util.Arrays;


public class Cat extends Animal {
	// extends = the class declared with "extends" is a sub-class of the super-class (Animal)
	// this is called Inheritance (every field and method from the super-class will be available to the sub-class

	// constructor
		public Cat (){
			
		}

		
		public String makeSound(){
			return "Moew";
		}
		
		public static void main(String[] args) {
			Animal fido = new Dog();
			Animal fluffy = new Cat();
			
			//creating an array
			Animal[] theAnimals;
			theAnimals = new Animal[10];
			
			//create an array in one line
			//Animal[] theAnimals = new Animal[10];
			
			//string array
			String[] stringArray = {"Random","Words","Here"};
			
			//create a copy of an array
			String[] cloneOfArray = Arrays.copyOf(stringArray, 3);
			
			//print an array
			System.out.println(Arrays.toString(cloneOfArray));
			
			//search an array
			System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));
			
			//cycle through the array
			for(String word : stringArray) {
				System.out.println(word);
			}
			
			String[][][] multiArray = {{{"000","001"}}, {{"003","004"}}, {{"005","006"}} };
			

			
			
			
			theAnimals[0] = fido;
			theAnimals[1] = fluffy;
			
			System.out.println(theAnimals[0].getName() + " says " + theAnimals[0].makeSound());
			System.out.println(theAnimals[1].getName() + " says " + theAnimals[1].makeSound());
			
			speakAnimal(fluffy);
		}
	
}
