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

    p1.setY(10);
    p2.setY(5);

//Dog example
    Dog d = new Dog();
    d.breed = "Corgi";
    d.size = 5.0;
    d.colorOfFur = "Blue";

//  Example
    Scanner sc = new Scanner(System.in);
    Point2D = new Point2D();

    System.out.println("Give me two numbers");
    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

    p1.setX(in_x);
    p1.setY(in_y):

    System.out.println("You made a point at ("+ p1.x +", "+ p2.y +")" );
  }
}
