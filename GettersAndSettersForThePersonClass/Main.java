public class Main {

    public static void main(String[] args) {
	    /*
	    Create the Person class. A person should have a String name, int age, and char sex.
	    Create getters and setters for all the variables of the Person class.

	    Requirements:
	    1. The program must not read data from the keyboard.
	    2. The Person class must have a public static void main method.
	    3. The Person class should have 3 variables.
	    4. The Person class must have a String variable name with getter and setter.
	    5. The Person class must have a int variable age with getter and setter.
	    6. The Person class must have a char variable sex with getter and setter.
	     */
    }

    public static class Person {

        String name = "Joe";
        int age = 41;
        char sex = 'M';

        public String getName() { // Getter
            return name;
        }

        public void setName(String newName) { // Setter
            this.name = newName;
        }

        public int getAge() { // Getter
            return age;
        }

        public void setAge(int newAge) { // Setter
                this.age = newAge;
        }

        public char getSex() { // Getter
            return sex;
        }

        public void setSex(char newSex) { // Setter
            this.sex = newSex;
        }
    }
}
