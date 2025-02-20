public class Dog extends Animal {
    String bark;

    public Dog() {
        super("White", 50.0, 30.0);
        this.bark = "Woof";
    }

    public Dog(String bark, String furColor, double weight, double height) {
        super(furColor, weight, height);
        this.bark = bark;
        super.furColor = furColor;
        this.setHeight(height);
    }

    @Override
    public String vocalize() {
        return this.bark;
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
