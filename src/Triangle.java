public class Triangle extends Shape {
    public Triangle sideA;
    public Triangle sideB;
    public Triangle sideC;

    public Triangle(Point location, Triangle sideA, Triangle sideB, Triangle sideC) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public Triangle getSideA() {
        return sideA;
    }

    public void setSideA(Triangle sideA) {
        this.sideA = sideA;
    }

    public Triangle getSideB() {
        return sideB;
    }

    public void setSideB(Triangle sideB) {
        this.sideB = sideB;
    }

    public Triangle getSideC() {
        return sideC;
    }

    public void setSideC(Triangle sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area(){
        return (sideA*sideB)/2;
    }

    @Override
    public double perimeter(){
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}

