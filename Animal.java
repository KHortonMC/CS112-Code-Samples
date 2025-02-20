public class Animal {
    protected String furColor;
    private double height;
    private double internalWeight;

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public Animal() {
        this.furColor = null;
        this.internalWeight = 0.0;
        this.height = 0.0;
    }

    public Animal(String furColor, double weight, double height) {
        this.furColor = furColor;
        this.height = height;
        this.internalWeight = weight;
    }

    public String vocalize() {
        return "*indeterminate*";
    }

    public String toString() {
        return "Fur Color: " + furColor + " weight: " + internalWeight + " height: " + height;
    }

    public boolean equals(Object other) {
        if (other instanceof Animal animal) {
            return this.furColor.equals(animal.furColor)
                && this.internalWeight == animal.internalWeight
                && this.height == animal.height;
        }
        // if (this.getClass() == other.getClass()) {
        //     Animal animal = (Animal)other;
        //     return this.furColor.equals(animal.furColor)
        //         && this.internalWeight == animal.internalWeight
        //         && this.height == animal.height;            
        // }
        return false;
    }
}
