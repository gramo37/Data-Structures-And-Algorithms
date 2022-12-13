import java.util.*;

public class Heaps{  
    public void heapify(ArrayList<Integer> heap, int i) {
        int n = heap.size();
        while(2*i+1 < n) {
            int mx = Math.max(heap.get(i), heap.get(2*i+1));
            if(2*i+2 < n) mx = Math.max(mx, heap.get(2*i+2));
            if(mx == heap.get(i)) return;
            else if(mx == heap.get(2*i+1)) {
                Collections.swap(heap, i, 2*i+1);
                i = 2*i+1;
            } else {
                if(2*i+2 >= n) return;
                Collections.swap(heap, i, 2*i+2);
                i = 2*i+2;
            }
        }
    }

    public int extractMax(ArrayList<Integer> heap) {
        int mx = heap.get(0);
        int n = heap.size();
        Collections.swap(heap, 0, n-1);
        heap.remove(n-1);
        heapify(heap, 0);
        return mx;
    }

    public void insert(ArrayList<Integer> heap, int x) {
        heap.add(x);
        int n = heap.size()-1;
        while(n!=0) {
            int par = (n-1)/2;
            if(heap.get(par) > heap.get(n)) return;
            else {
                Collections.swap(heap, par, n);
                n = par;
            }
        }
    }

    public int poll(ArrayList<Integer> heap) {
        return isEmpty(heap) ? heap.get(0) : -1; 
    }

    public boolean isEmpty(ArrayList<Integer> heap) {
        return heap.size() > 0;
    } 
}  