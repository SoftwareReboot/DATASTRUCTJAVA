public class QueueArray{
   private Object[] items;
   private int count;
   
   public QueueArray(int size){
      items = new Object[size];
      count = 0;
   }
   
   public boolean isEmpty(){
      if(count == 0)
         return true;
      else
         return false;
   }
   
   public boolean isFull(){
      return count == items.length;
   }
   
   public boolean enqueue(Object value){
      if(!isFull()){
         items[count++] = value;
         return true;
      }
         return false;
   }
   
   public boolean dequeue(){
      if(!isEmpty()){
         for(int i=1; i<count; i++){
            items[i-1] = items[i];
         }
         items[count-1] = null;
         count --;
         return true;
      }
         return false;
   }
   
   public Object front(){
      if(!isEmpty()){
         return items[0];
      }
         return false;
   }
   
   public void display(){
      if(!isEmpty()){
         for(int i = 0; i<count; i++){
            System.out.println("[" + items[i] + "]");
         }
            System.out.println();
      }else{
         System.out.println(" Queue is Empty...");
      }
   }
}