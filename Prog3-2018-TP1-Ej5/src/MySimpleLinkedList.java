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
		if (first == null) {
			first = tmp;
			last = first;
		} else if (size == 1) {
			tmp.setNext(first);
			last = first.getNext();
			first = tmp;
		} else {
			tmp.setNext(first);
			first = tmp;
		}
		size++;

	}

	public boolean exists(int n) {
		Node tmp = first;

		while ((tmp.getInfo() != last.getInfo()) || (tmp.getInfo() == n)) {
			if (tmp.getInfo() == n) {
				return true;
			}

			if (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}

		}
		return false;

	}

	public void insertAtLast(int n) {
		Node tmp = new Node(n, null); // Creo el nodo a insertar, le seteo null como next

		if (first == null) {
			first = tmp;
			last = first;
			size++;
		} else {
			if (!(this.exists(n))) {
				last.setNext(tmp);
				last = tmp;
				size++;
			}
		}
		
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

	public Node nodeAt(int pos) {
		Node tmp = first;
		int listPos = 0;
		while ((tmp.getNext() != null) && (pos != listPos)) {
			tmp = tmp.getNext();
			listPos++;
		}
		if (pos == listPos)
			return tmp;
		else
			return null;
	}

	public void print(int n) {
		if (first != null) {
			System.out.print("[" + first.getInfo() + "|" + first.getNext().getInfo() + "]->");
			Node tmp = first;

			for (int i = 0; i < n; i++) {

				if (tmp.getNext() != null) {

					tmp = tmp.getNext();
					if (tmp.getNext() != null) {
						System.out.print("[" + tmp.getInfo() + "|" + tmp.getNext().getInfo() + "]->");
						last = tmp.getNext();
					} else {
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

	// Método que resuelve ejercicio 5-a)

	public MySimpleLinkedList simpleCommonElements(MySimpleLinkedList l1, MySimpleLinkedList l2) {
		// Uno en una lista auxiliar 'simpleCommonElements' l1 y l2
		// Le aplico MergeSort
		// Devuelvo la lista auxiliar

		MySimpleLinkedList l3 = new MySimpleLinkedList();
		l3 = l3.mergeLists(l1, l2); // inserta los nodos en común desordenados
		Mergesort.sort(l3); //ordena los nodos de l3

		return l3;
	}

	public MySimpleLinkedList mergeLists(MySimpleLinkedList l1, MySimpleLinkedList l2) {

		//MySimpleLinkedList simpleCommonElements = new MySimpleLinkedList();
		// Agrego l1 a la lista que luego voy a ordenar
		Node tmp1 = l1.getFirst();
		Node tmp2 = l2.getFirst();
		MySimpleLinkedList l3 = new MySimpleLinkedList();
		for (int i = 0; i < l1.getSize(); i++) {

			for (int j = 0; j < l2.getSize(); j++) {
				if (tmp2.getInfo() == tmp1.getInfo()) {
					l3.insertAtLast(tmp2.getInfo());
				}
				if (tmp2.getNext() != null) {
					tmp2 = tmp2.getNext();
				}
			}
			tmp2 = l2.getFirst(); // Vuelvo al principio de la lista
			if (tmp1.getNext() != null) {
				tmp1 = tmp1.getNext();
			}
		}
		return l3;
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