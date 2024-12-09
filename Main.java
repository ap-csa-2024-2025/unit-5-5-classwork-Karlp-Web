import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
//Point2D example
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

  //No longer allowed when in private
    p1.x = 0;
    p1.y = 1;

    p2.x = 1;
    p2.y = 0;
  //is able to use the function
    p1.setX(5);
    p2.setX(10);

//Dog example
    Dog d = new Dog();
    d.breed = "Corgi";
    d.size = 5.0;
    d.colorOfFur = "Blue";

//  Example
  }
}
