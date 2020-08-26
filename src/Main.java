public class Main {

    public static void main(String[] args) {
	    /*
	    Create the Dog class. The dog should have a String name and int age.
	    Create getters and setters for all the variables of the Dog class.

	    Requirements:

	    - The program must not read data from the keyboard.
	    - The Dog class must have a String variable name.
	    - The Dog class must have an int variable age.
	    - The class must have a getter for the variable name and variable age.
	    - The class must have a setter for the variable name and variable age.

	    This is the code that I am given with the assignment:

	    public class Dog {

	        public static void main(String[] args) {

	        }
	    }
	     */

        Dog dog1 = new Dog();
        dog1.getName();
        dog1.setName("doggy");
        dog1.getAge();
        dog1.setAge(23);
    }

    public static class Dog {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
