public class Main {

    public static void main(String[] args) {
	    /*
	    Use the CAT class to create three cats. Hold three pairwise battles between the cats.
	    You don't need to create the Cat class.
	    For combat, use the boolean fight(Cat anotherCat) method.
	    Display the result of each battle on the screen on a new line.

	    Requirements:
	    The program must not read data from the keyboard.
	    You need to create three Cat objects.
	    You need to conduct three fights.
	    The program should display the result of each battle on a new line.
	     */
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
