

@SuppressWarnings("javadoc")
public class AddressExample {
   String street;
   String city;
   String stateCode;
   String postalCode;

   //Constructors
   //with params
   AddressExample(String newStreet, String newCity){
      this.street = newStreet;
      this.city = newCity;
   }
   //default
   AddressExample(){
      this.street = "<unknown>";
      this.city = "<unknown>";
   }
   
   //Overrides toString
   public String toString() {
      return this.street + ";" + this.city + ";" + this.stateCode + ";" + this.postalCode;
   }
   
   //Getters and Setters
   /**
   * @return the street
   */
   public String getStreet() {
      return this.street;
   }
   /**
   * @param street the street to set
   */
   public void setStreet(String street) {
      this.street = street;
   }
   /**
   * @return the city
   */
   public String getCity() {
      return this.city;
   }
   /**
   * @param city the city to set
   */
   public void setCity(String city) {
      this.city = city;
   }
   /**
   * @return the stateCode
   */
   public String getStateCode() {
      return this.stateCode;
   }
   /**
   * @param stateCode the stateCode to set
   */
   public void setStateCode(String stateCode) {
      this.stateCode = stateCode;
   }
   /**
   * @return the postalCode
   */
   public String getPostalCode() {
      return this.postalCode;
   }
   /**
   * @param postalCode the postalCode to set
   */
   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

}
