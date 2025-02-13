public class Main {
    public static void main(String[] args) {
        Animal redAnimal = new Animal("Red", 30, 30);
        Animal blueFur = new Animal("Blue", 14, 12);
        Dog pinkDog = new Dog("Yip", "Red", 30, 30);

        if (pinkDog.equals(redAnimal)) {
            System.out.println("They are the same");
        }
        else {
            System.out.println("They are different");
        }

        // Chihuahua dog = new Chihuahua();
        // System.out.println(dog);
    }
}