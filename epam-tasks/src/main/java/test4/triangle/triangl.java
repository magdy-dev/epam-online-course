package test4.triangle;

public class triangl {
    private  double area ;
    private  double base;
    private  double height;


    public  double getTriangle(double area,double base,double height){
        return area=5.0*base*height;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
