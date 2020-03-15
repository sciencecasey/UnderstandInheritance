
public class MyClassOver extends MyClass{
   MyClassOver(int v, int y){
      super(v, y);
   }
   
   public String toString() {
      String result;
      result = getClass().getName() + " x = " + getX() +" y = " + getY();
      return result;
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      MyClassOver obj1 = new MyClassOver(1, 2);
      System.out.println("" + obj1.toString());
      MyClassOver obj2 = new MyClassOver(3, 4);
      System.out.println("" + obj2.toString());

   }

}
