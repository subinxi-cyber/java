public class RectArea
{
    double length,breadth;
    void getdata(double l,double b)
    {
        length=l;
        breadth=b;

    }
    double calArea()
    {
        return length*breadth;
    }
        public static void main(String args[])
        {
            RectArea r= new RectArea();
            r.getdata(12.48,13);
            System.out.println("area of the rectangle="+r.calArea());
            
        }
    }