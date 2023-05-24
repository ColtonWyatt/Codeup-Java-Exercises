package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square( int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("this is the area of a square");
        return (4 * side);
    }

    @Override
    public int getArea() {
        System.out.println("this is the perimeter of a square");
        return (side * side);
    }

}



