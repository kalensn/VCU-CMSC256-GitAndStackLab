public class ArrayBasedStack<T> implements StackInterface<T>{

   final int INITIAL_CAPACITY=5;
   T[] data= (T[]) new Object [INITIAL_CAPACITY];
   int topOfStack;
   boolean initialized=false;
   
   public ArrayBasedStack(int userCapacity){
   
     if(userCapacity<1)
      throw new IllegalArgumentException("Capacity should be greater than 0");
         
   }
   
}