public class Node {
	private int info;
	private Node next;

	public Node(int n) {
		info = n;
		next = null;
	}

	public Node(int num, Node n) {
		setInfo(num);
		setNext(n);
	}

	public void setInfo(int n) {
		info = n;
	}

	public void setNext(Node n) {
		next = n;
	}

	public Object getInfo() {
		return info;
	}

	public Node getNext() {
		return next;
	}
}
