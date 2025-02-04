
public class DemoClass {
    private int value;
    private String name;

    public DemoClass() {
        this.value = 0;
        this.name = "None";
    }

    public DemoClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public DemoClass(DemoClass other) {
        this(other.value, other.name);
        //this.value = other.value;
        //this.name = new String(other.name);
    }

    public String valueToString() {
        String returnValue = "None";
        switch (this.value) {
            case 0: returnValue = "Zero"; break;
            case 1: returnValue = "One"; break;
            case 2: returnValue = "Two"; break;
            default: returnValue = Integer.toString(this.value); break;
        }

        return returnValue;
    }

    public boolean equals(DemoClass other) {
        boolean returnValue = true;

        if (this.value != other.value) {
            returnValue = false;
        }

        if (!this.name.equals(other.name)) {
            returnValue = false;
        }

        return returnValue;
    }
}