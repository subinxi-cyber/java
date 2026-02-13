public class SquareArea
{
    double side;
    void getinput(double a)
    {
        side=a;
    }
    double calArea()
    {
        return side*side;
    }
    public static void main(String args[])
    {
        SquareArea sq= new SquareArea();
        sq.getinput(5);
        System.out.println("Square area="+sq.calArea());
    }
}