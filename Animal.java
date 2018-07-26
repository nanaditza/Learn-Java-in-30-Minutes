//https://www.youtube.com/watch?v=WPvGqX-TXP0

import java.util.*;

public class Animal {
	public static final double FAVNUMBER = 1.6180;
	/* public = available to anyone else
	 * static = the field will be shared by every instance of the class
	 * final = this field is constant and it cannot be changed
	 * double = double type (accepts decimals places)\
	 * private = the field can only be accessed by methods of the class 
	 * protected = the field can only be accessed by other code in the package (assembly?)
	 * 
	 * variables (fields or attributes) can start with either:
	 * - a letter
	 * - an underscore
	 * - a dollar sign	
	 * 
	 * */
	private String name;
	private int weight;
	/* Java Data Types
	 * int = integer from -2^31 to 2^31
	 * boolean
	 * byte = from -28 to 127
	 * long = from -2^63 to 2^63
	 * char = unsigned integers that represent UTF 16 characters - can only store a single character
	 * double = number with decimal place - 64 bit number
	 * float = 32 bit number with decimals
	 * 
	 * 
	 * */
	
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);

	public Animal() {
		// super(); // call the creator of the super class 
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 =" + sumOfNumbers);
		// "sysout" + CTRL + SPACE will generate "System.out.println()"
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 =" + diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 =" + multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 =" + divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 =" + modOfNumbers);
		
		System.out.print("Enter the name: \n");
		
		
		/*You can also use:
		 * - hasNextInt
		 * - hasNextFloat
		 * - hasNextBoolen
		 * - hasNextByte
		 * 
		 * */
		if(userInput.hasNextLine()) {
			//"this" is a reference to the class which is being created 
			this.setName(userInput.nextLine());
		}
		
		this.setFavoriteColor();
		this.setUniqueID();
		
	}
	
	
	//Eclipse auto generated get and set methods
	//Right Click > Source > Generate Getters and Setters
	
	private void setFavoriteColor() {
		// TODO Auto-generated method stub
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to " + this.uniqueID);
	}
	
	//Method overloading
	public void setUniqueID() {
		//generate a random number
		long minNumber = 1;
		long maxNumber = 1000000;
		
		// casting the "long" type
		// these basic data types are called "primitives"; 
		// you can either have Primitive data types or Object data types
		// 
		
		//to convert a long primitive type to a string (String is an Object):
		String stringNumber = Long.toString(maxNumber);
		
		String intNumber = Integer.toString(10);
		
		String byteNumber = Byte.toString(this.age);
		
		String doubleNumber = Double.toString(this.speed);
		
		// to convert to a primitive type from String Object type:
		int intNumberFromString = Integer.parseInt(stringNumber);
		
		
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
		System.out.println("Unique ID set to " + this.uniqueID);
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126 +1 );
		this.favoriteChar = (char) randomNumber;
		
		/* Java comparison operators
		 * >, <, ==, !=, >=, <=
		 */
		
		if (randomNumber == 32) {
			System.out.println("Favorite Character set to Space.");
		}
		else if (randomNumber == 10) {
			System.out.println("Favorite Character set to NewLine.");
		}
		else {
			System.out.println("Favorite Character set to " + this.favoriteChar);
		}
		
		// Logical Operators in Java
		// ! = Not
		// & = And - evaluates both left and right values
		// && = And - it stops evaluating after the first False
		// | = Or - evaluates both left and right values
		// || = Or - it stops evaluating after the first True
		// ^ = AndOr - returns True if there is one True and one False
		
		if (randomNumber > 97 && randomNumber < 122) {
			System.out.println("Favorite character is a lower case.");
		}
		
		if ((randomNumber > 97 && randomNumber < 122) || (randomNumber > 64 && randomNumber < 91)) {
			System.out.println("Favorite character is a letter.");
		}
		
		//Using the Ternary operator
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
		
		//Using the switch statement
		switch(randomNumber){
		//case '8' //for char type
		//case "8" //for strings
		case 8:
			System.out.println("Favorite character set to Backspace.");
			break;
		case 10:
			
		case 13:
			
		default:
			System.out.println("Favorite character was set.");
		} //switch
		
		
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public static double getFavnumber() {
		return FAVNUMBER;
	}

	
	
	// demonstrating for loop
	protected static void countTo(int startingNumber) {
		for (int i = 0; i <= 100; i++) {
			if (i == 90) continue; // jump to the begining of for statement
			System.out.println(i);
		}
	}
	
	
	//demonstrating while loop
	protected static String printNumbers(int maxNumbers) {
		int i = 1;
		
		while (i < (maxNumbers / 2)) {
			System.out.println(i);
			i++;
			if (i == (maxNumbers / 2)) break; //exit out of the while loop
		}// while
		
		Animal.countTo(maxNumbers / 2);
		return "End of printNumbers.";
	}
	
	//demonstrating Do-While loop
	protected static void guessMyNumber(){
		int number; 
		
		//Do-While loops guarantees it will execute at least one time
		//This can be used when asking for user input
		do {
			System.out.println("Guess number to up 100.");
			
			while (!userInput.hasNextInt()) {
				String numberEntered = userInput.next();
				//System.out.printf("%s is not a number. \n", numberEntered);
				System.out.println(numberEntered + "is not a number.");
			} //while
			
			number = userInput.nextInt();
			
		} while (number != 50); 
	}
	
	
	// demonstrating polymorphism
	public String makeSound(){
		return "Grrrrr";
	}
	
	
	//also demonstrating polymorphism
	public static void speakAnimal(Animal randomAnimal) {
		System.out.println(randomAnimal.getName() + " says " + randomAnimal.makeSound());
	}
	
	// "main" + CTRL + SPACE will generate the main method for the class
	public static void main(String[] args) {
		Animal theAnimal = new Animal();
	}
	
	
	
	

}
