public class Main {

    public static void main(String[] args) {

	    class Cat {
			Cat cat1 = new Cat("Sprinkles", 3, 10, 20);
			Cat cat2 = new Cat("Mittens", 4, 14, 15);
			Cat cat3 = new Cat("Fluffy", 2, 8, 11);

	        private String name;
	        private int age;
	        private int weight;
	        private int strength;

	        public Cat(String name, int age, int weight, int strength) {
	            this.name = name;
	            this.age = age;
	            this.weight = weight;
	            this.strength = strength;
            }
        }
    }
}

//In the main method, create three Cat objects and fill them with data.
//Use the Cat class from the first task.
//You don't need to create the Cat class.

//Requirements:
//1. The program must not read data from the keyboard.
//2. You need to create three Cat objects.
//3. Don't change the Cat class.
//4. The program should not display data on the screen.