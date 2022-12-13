import java.util.ArrayList;

class HeapsUse {
    public static void main(String args[]){  
      ArrayList<Integer> pq = new ArrayList<>();
      Heaps obj = new Heaps();
      obj.insert(pq, 2);
      obj.insert(pq, 4);
      obj.insert(pq, 5);
      obj.insert(pq, -2);
      obj.insert(pq, 0);
      obj.insert(pq, 90);
      System.out.println(obj.extractMax(pq));
      System.out.println(obj.extractMax(pq));
      System.out.println(obj.extractMax(pq));
      System.out.println(obj.extractMax(pq));
      System.out.println(obj.extractMax(pq));
    } 
}
