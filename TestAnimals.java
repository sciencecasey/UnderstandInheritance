
/**
 * This method makes an Object array of a parent class referencing 2 child types
 * then loops through the array and downcasts to use the methods of the 
 * child types
 * @author CaseyJayne
 *
 */
public class TestAnimals {
   //Array of parent type automatically casts the reference for Children
   public Animal [] testAnimal = {new Cat(), new Dog()};

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      TestAnimals testArray = new TestAnimals();
      
      //loop through not-iterable array (not primitive type)
      for (int i=0; i<2; i++) {
         //check if class name matches
         if (testArray.testAnimal[i].getClass().getName()=="Dog") {
            //if so, downcast the item
            //((Dog)testArray.testAnimal[i]).bark();
            //FOR ILLUSTRATION: method undefined for parent type Animal
            //testArray.testAnimal[i].bark();//CAN"T DO THIS!
         }
         else {
            ((Cat)testArray.testAnimal[i]).meow();
         }
         /* Another If Else option
          * 
          * if (testArray.testAnimal[i] instanceof Dog)
          * tests whether it can be changed to an instanceof before casting.  
          * This won't work for siblings only direct lines!
          */
      }
   }

}
