public class MySimpleLinkedList {
	protected Node first;
	protected Node last;
	protected int size = 0;

	public MySimpleLinkedList() {
		first = null;
		last = null;
	}
	
	public void insertAtFirst(int n) {
		Node tmp = new Node(n, null); // Creo el nodo a insertar, le seteo null como next
		if(first == null) {
			tmp.setNext(first);
			first = tmp;
			last = tmp;
			size++;
		}
		else {
			
			tmp.setNext(first);
			first = tmp;
			if(size==1) {
				last = first.getNext();
			}
			size++;
		}

	}

	public void insertAtLast(int n) {
		Node tmp = new Node(n, null); // Creo el nodo a insertar, le seteo null como next
		if (first == null) {
			tmp.setNext(first); //
			first = tmp;
			last = first.getNext();
			size++;
		} else {
			last.setNext(tmp);
			last = tmp;
		}
		size++;
	}



	public Object extractLast() {
		Node tmp = last;
		Node aux = first;
		while (aux.getNext() != null) {
			if (aux.getNext().getNext() == null) {
				last = aux.getNext();
				tmp = last;
				aux.setNext(null);
				
				
			} else {
				aux = aux.getNext();
			}
		}
		size--;
		return tmp;
	}

	public Object extractFirst() {
		Node tmp = first;
		first = first.getNext();
		size--;
		return tmp;
	}
	
	public Node elementAtPos(int pos) {
		Node tmp = first;
		int listPos = 0;
		while ((tmp.getNext() != null) && (pos != listPos)) {
			tmp = tmp.getNext();
			listPos++;
		}
		if (pos == listPos) return tmp;
		else return null;
	}

	public void print(int n) {
		if (first != null) {
			System.out.print("[" + first.getInfo() + "|" + first.getNext().getInfo()+ "]->");
			Node tmp = first;
			
			for (int i = 0; i < n; i++) {
				
				if (tmp.getNext() != null) {
					
					tmp = tmp.getNext();
					if(tmp.getNext() != null) {
						System.out.print("[" + tmp.getInfo() + "|" + tmp.getNext().getInfo() + "]->");
					}
					else {
						System.out.print("[" + tmp.getInfo() + "|null]");
					}
					
				}
				
					
			}			
			System.out.print(" - ");
			System.out.print("first: " + first.getInfo());
			System.out.print(" - last: " + last.getInfo());
			System.out.println("");
		}
		
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;
	}

	public int size() {
		return size;
	}
}