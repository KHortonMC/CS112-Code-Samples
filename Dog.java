public class Dog extends Animal {
    String bark;

    public Dog() {}

    public Dog(String bark, String furColor, double weight, double height) {
        super(furColor, weight, height);
        this.bark = bark;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return "Bark! " + superString;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        } else if (other instanceof Dog otherDog) {
            return bark.equals(otherDog.bark);
        }
        return false;
    }
}
