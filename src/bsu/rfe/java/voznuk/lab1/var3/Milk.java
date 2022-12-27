package bsu.rfe.java.voznuk.lab1.var3;

public class Milk extends Food {
    private String fat;

    public Milk(String fat) {
        super("Milk");
        this.fat = fat;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Milk)) return false; // Шаг 2
            return fat.equals(((Apple) arg0).getSize()); // Шаг 3
        } else
            return false;
    }

    public String getSize() {
        return fat;
    }

    public void setSize(String size) {
        this.fat = size;
    }

    public void consume() {
        System.out.println(this + " выпито");
    }


    public String toString() {
        return fat.toUpperCase() + " " + super.toString();
    }
}
