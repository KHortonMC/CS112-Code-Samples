public class Cat extends Animal {
    String meow = null;

    public Cat() {
        super("Orange", 4.0, 12.0);
        this.meow = "Meow";
    }

    public Cat(String meow, String furColor, double weight, double height) {
        super(furColor, weight, height);
        this.meow = meow;
        super.furColor = furColor;
        this.setHeight(height);
    }

    @Override
    public String vocalize() {
        return this.meow;
    }
    
}
