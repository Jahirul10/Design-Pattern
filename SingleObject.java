public class SingleObject {

   private static SingleObject instance = new SingleObject();

   private SingleObject(){}

   public static SingleObject getInstance(){
      return instance;
   }

   public void Message(){
      System.out.println("Singleton Pattern");
   }
}