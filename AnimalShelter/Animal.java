public abstract class Animal {
    private String name;
    private int order; 

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int ord) {
        this.order = ord;
    }

    public int getOrder() {
        return this.order;
    }

    public boolean isOlderThan(Animal other) {
        return this.order < other.getOrder();
    }

    public String getName() {
        return name;
    }
}
