package entites;

public class Category {
    private  int id;

    public Category(int id, String cName) {
        this.id = id;
        this.cName = cName;
    }

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

    private String cName;
}
