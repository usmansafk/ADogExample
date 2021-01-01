class Dog {
	String name;

	public static void main (String[] args) {

		Dog myDog = new Dog();
		myDog.bark();
		myDog.name = "Alfie";
		

		Dog[] coolDogs = new Dog[3];
		coolDogs[0] = new Dog();
		coolDogs[1] = new Dog();
		coolDogs[2] = myDog;

		coolDogs[0].name = "Duffie";
		coolDogs[1].name = "Buffie";

		System.out.print("the last dogs name is ");
		System.out.println(coolDogs[2].name);

		int x = 0;

		while (x < coolDogs.length) {
			coolDogs[x].bark();
			x++;
		}
	}

	public void bark() {
		System.out.println(name + " barks Woof! Woof!");



	}
}
