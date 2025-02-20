public class Chihuahua extends Dog {
    public Chihuahua() {
        super("Bark", "Brown", 5.0, 10.0);
    }

    @Override
    public String vocalize() {
        return super.vocalize() + " Yip!";
    }
    
    @Override
    public String toString() {
        return "Yip!" + super.toString();
    }
}
