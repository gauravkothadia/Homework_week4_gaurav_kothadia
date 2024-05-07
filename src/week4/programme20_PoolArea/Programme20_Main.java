package week4.programme20_PoolArea;

/**
 * 
 */
public class Programme20_Main {

    public static void main(String[] args) {
        Programme20_Rectangle rectangle = new Programme20_Rectangle(5, 10);
        System.out.println("rectangle.width= "+rectangle.getWidth());
        System.out.println("rectangle.length= "+rectangle.getLength());
        System.out.println("rectangle.area= "+rectangle.getArea());
        Programme20_Cuboid cuboid = new Programme20_Cuboid(5, 10, 5);
        System.out.println("cuboid.width= "+cuboid.getWidth());
        System.out.println("cuboid.length= "+cuboid.getLength());
        System.out.println("cuboid.area= "+cuboid.getArea());
        System.out.println("cuboid.height= "+cuboid.getHeight());
        System.out.println("cuboid.volume= "+cuboid.getVolume());
    }
}