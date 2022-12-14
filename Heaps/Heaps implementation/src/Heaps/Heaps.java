package Heaps;
import java.util.*;

public class Heaps {
	public ArrayList<Integer> heap = new ArrayList<Integer>();
	
	public void Heapify(int i) {
		if(2*i+1 >= heap.size()) return;
		int maxVal = Math.max(heap.get(i), heap.get(2*i+1));
		if(2*i+2 < heap.size()) maxVal = Math.max(maxVal, heap.get(2*i+2));
		if(maxVal == heap.get(i)) return;
		else if (maxVal == heap.get(2*i+1)) {
			Collections.swap(heap, i, 2*i+1);
			Heapify(2*i+1);
		}
		else {
			Collections.swap(heap, i, 2*i+2);
			Heapify(2*i+2);
		}
	}
	
	public void insert(int x) {
		heap.add(x);
		int n = heap.size() - 1;
		while(n>0) {
			int par = (n-1) / 2;
			int mx = Math.max(heap.get(par), heap.get(n));
			if(mx == heap.get(n)) {
				Collections.swap(heap, n, par);
				n = par;
			} else return;
		}
	}
	
	public int peek()
	{
		return isEmpty() ? -1 : heap.get(0);
	}
	
	public boolean isEmpty() {
		return heap.size() == 0;
	}
	
	public int extractMax() {
		if(isEmpty()) return -1;
		int mx = heap.get(0);
		int n = heap.size();
		Collections.swap(heap, 0, n-1);
		heap.remove(n-1);
		Heapify(0);
		return mx;
	}
}
