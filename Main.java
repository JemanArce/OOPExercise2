 class MainProgram
{
	public static void main(String[] args) {
		MyPet pet;
		Cat cat = new Cat("Dippy", 2, "Siamese");
		Dog dog = new Dog("Khali", 3, "Shi-Tzu");

		pet = dog;
		System.out.println(pet.makeSound() + "   " + "My Name is " + pet.getName());
        System.out.println( " " + dog.getBreed());
		pet = cat;
		System.out.println(pet.makeSound() + "   " + "My Name is " + pet.getName());
	    System.out.println(" " + cat.getType());
	}

}
