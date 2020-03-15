
@SuppressWarnings("javadoc")
public class Contacts {
   //private AddressExample address;
   
   public static void main(String[] args) {
      @SuppressWarnings("unused")
      AddressExample address;
      if ((args[0]==null) || (args[1]==null)) {
         address = new AddressExample();
      }
      else {
         address = new AddressExample(args[0], args[1]);
      }
   }
   
   static void printAddr(String street, String city, String state, 
         String zip) { 
      System.out.println(street);
      System.out.println(city + ", " + state + " " + zip);
      
   }
}
