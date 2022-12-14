package Heaps;

public class HeapsUse {
	public static void main(String[] args) {
		Heaps h = new Heaps();
		h.insert(3);
		h.insert(5);
		h.insert(6);
		h.insert(90);
		
		h.insert(4);
		h.insert(89);
		h.insert(30);
		h.insert(23);
		
		System.out.println(h.peek());
		System.out.println(h.peek());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.extractMax());
		System.out.println(h.peek());
	}
}
