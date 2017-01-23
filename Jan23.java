import java.awt.Rectangle; // MUST HAVE if you use rectangle otherwise ERROR compiling.
import java.awt.Point;
public class Jan23 {
    public static void main(String[] argc) {
        
        int x = 10, y = 20, width = 60, height = 100; // this point is the upper left corner of the rectangle
        int dx = 5, dy = 0;
        
        Rectangle door = new Rectangle(x, y, width, height); // use new followed by constructers name
        
        door.translate(dx,dy);
        System.out.println("x is expected: 15, actual: " + door.getX()); // door is name of the rectangle and getX gets the X coord.
        
        Point nail = new Point(20, 35); // nail is the name of a point on the plane at (x,y)
        System.out.println("Door contains nail (expected: true) actual: " + door.contains(nail));
    
    }
}

/* Notes:

 Types | Operations:
    primitive | arithmetic
    
 Creating an object - use constructors:
    rectangle - class
        java.awt.Rectangle - package name
    string - class
        java.lang - package name
 
    point - class
        import java.awt.Point - imports the Point class
    
    import java.awt == improts all of the java.awt classes. This is ok but sometimes specifying helps future readers know where it is importing from
 

*/
