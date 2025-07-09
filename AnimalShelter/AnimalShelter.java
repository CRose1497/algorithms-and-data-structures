import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Dog> dogQueue = new LinkedList<>();
    private Queue<Cat> catQueue = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogQueue.offer((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.offer((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty()) {
            return dequeueCat();
        } else if (catQueue.isEmpty()) {
            return dequeueDog();
        }

        Dog dog = dogQueue.peek();
        Cat cat = catQueue.peek();

        return dog.isOlderThan(cat) ? dequeueDog() : dequeueCat();
    }

    public Dog dequeueDog() {
        return dogQueue.poll();
    }

    public Cat dequeueCat() {
        return catQueue.poll();
    }
}
