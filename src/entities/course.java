package entities;

public class course {
    int id;
    String coursename;
    double price;

    public course(int id, String coursename, double price) {
        this.id = id;
        this.coursename = coursename;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
