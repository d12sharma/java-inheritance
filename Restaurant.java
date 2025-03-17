// Superclass: Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is preparing " + specialty + " dishes.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables.");
    }
}

// Testing the classes
public class Restaurant {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 101, "Italian");
        Worker waiter = new Waiter("John", 102, 5);

        Worker[] workers = {chef, waiter};
        for (Worker worker : workers) {
            worker.performDuties();
        }
    }
}
