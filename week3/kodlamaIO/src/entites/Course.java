package entites;

public class Course {
    private int id;
    private String cName;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Course(int id, String cName, double price) {
        this.id = id;
        this.cName = cName;
        this.price = price;
    }
}
