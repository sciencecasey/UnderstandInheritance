
public class BaseConstructing {
   public class Base {
      private int data;
      public int getData() {
         return this.data;
      }
      Base(int n){
         this.data = n;
      }
   }
   
   public class Derived extends Base{
      private int subData;
      public int getSubData() {
         return this.subData;
      }
      Derived(int b, int d){
         super(b);
         this.subData= d;
      }
   }
   
   public static void main (String[] args) {
      BaseConstructing init = new BaseConstructing();
      Derived testd = init.new Derived(10, 20);
      System.out.println("Base is " + testd.getData()+ " Derived is " + 
            testd.getSubData());
      
   }

}
