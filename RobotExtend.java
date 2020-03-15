

@SuppressWarnings("javadoc")
public class RobotExtend extends Robot{
   String modelNumber;
   RobotExtend(String name, String model){
      super(name);
      this.modelNumber = model;
   }
   
   
   public void display() {
      //System.out.println(" " +this.modelNumber);
   }
   
   public static void main(String [] args) {
      Robot superRob = new Robot("BuhWhy?");
      RobotExtend newGuy = new RobotExtend("Mike", "D456h");
      
      superRob.display();
      newGuy.display();
   }
}

