public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Rex"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Dog("Fido"));
        shelter.enqueue(new Cat("Mittens"));

        System.out.println("Adopted: " + shelter.dequeueAny().getName()); 
        System.out.println("Adopted Dog: " + shelter.dequeueDog().getName()); 
        System.out.println("Adopted Cat: " + shelter.dequeueCat().getName()); 
    }
}
