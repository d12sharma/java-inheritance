class Animal {
    private String name;
    private int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void makeSound(){
        System.out.println("Animal makes A Sound");
    }

}
class Cat extends  Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");

    }
}
class Bird extends  Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");

    }
}
class Dog extends  Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark");

    }
}





public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog1 = new Dog("rusty",3);
        dog1.makeSound();
        Animal dog2 = new Dog("browno",3);
        dog2.makeSound();
        Animal bird1 = new Bird("bird",2);
        bird1.makeSound();

    }
}
