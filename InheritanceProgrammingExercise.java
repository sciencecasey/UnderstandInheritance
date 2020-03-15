
public class InheritanceProgrammingExercise {
   public static void main(String [] args) {
      EnhancedRectangle rec1 = new EnhancedRectangle();
      EnhancedRectangle rec2 = new EnhancedRectangle();
      rec1.setSides(40,  30);
      rec2.setSides(50, 60);
      
      System.out.println("Length: " +rec1.getLength()+ " width: " 
            +rec1.getWidth()+ " area: "+ rec1.getArea());
      System.out.println("Length: " +rec2.getLength()+ " width: " 
            +rec2.getWidth()+ " area: "+ rec2.getArea());
   }

}
