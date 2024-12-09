import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

    p1.x = 0;
    p1.y = 1;

    p2.x = 1;
    p2.y = 0;

    Dog d = new Dog();
    d.breed = "Corgi";
    d.size = 5.0;
    d.colorOfFur = "Blue";
  }
}
