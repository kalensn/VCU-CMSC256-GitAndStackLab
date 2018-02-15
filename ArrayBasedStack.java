import java.util.Arrays;
public class ArrayBasedStack<T> implements StackInterface<T>{

   final int INITIAL_CAPACITY;
   int topOfStack;
   boolean initialized=false;
   
   public ArrayBasedStack(int userCapacity){
   
     if(userCapacity<1){
      throw new IllegalArgumentException("Capacity should be greater than 0");
     }
     topOfStack= -1;
     int INITIAL_CAPACITY = userCapacity;
     T[] data= (T[]) new Object [INITIAL_CAPACITY];
     
   }
   
   public ArrayBasedStack(){
      
    int INITIAL_CAPACITY=5;
    T[] data= (T[]) new Object [INITIAL_CAPACITY];
      
   }
   
   private T[] doubleArraySize(T[] data1){
      T[] copy= Arrays.copyOf(data1,(data1.length*2));
      return copy;
   }
   
   private void push(T[] data1,T element){
      if(data1.length==INITIAL_CAPACITY){
         T[] copy= Arrays.copyOf(data1,(data1.length+1));
      }
   
      
   }
}