 public class Rectangle
 {
   private double length;
   private double width;
   
   public Rectangle()
   {
     this.length = 0;
     this.width = 0;
   }
   
   public Rectangle( int l, int w )
   {
     this.length = l;
     this.width = w;
   }
   
   public void setLength( double l )
   {
     this.length = l;
   }
   
   public void setWidth( double w )
   {
     this.width = w;
   }
   
   public void setSides( double l, double w )
   {
     this.length = l;
     this.width = w;
   }
   
   public double getLength()
   {
     return this.length;
   }
   
   @SuppressWarnings("javadoc")
   public double getWidth()
   {
     return this.width;
   }
 }