import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySimpleLinkedList simpleList = new MySimpleLinkedList();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Timer t = new Timer();
		
		System.out.println("Ej 2-1");
		t.start();
		for (int i=0; i<5; i++) {
			simpleList.insertAtFirst(i);
		}
		System.out.println("Insertar al principio de Lista de 5 tarda: " + t.stop());
		t.start();
		for (int i=0; i<10; i++) {
			simpleList.insertAtFirst(i);
		}
		System.out.println("Insertar al principio de Lista de 10 tarda: " + t.stop());
		t.start();
		for (int i=0; i<50; i++) {
			simpleList.insertAtFirst(i);
		}
		System.out.println("Insertar al principio de Lista de 50 tarda: " + t.stop());
		t.start();
		for (int i=0; i<100; i++) {
			simpleList.insertAtFirst(i);
		}
		System.out.println("Insertar al principio de Lista de 100 tarda: " + t.stop());
		t.start();
		for (int i=0; i<500; i++) {
			simpleList.insertAtFirst(i);
		}
		System.out.println("Insertar al principio de Lista de 500 tarda: " + t.stop());
		
		
		t.start();
		for (int i=0; i<5; i++) {
			arr.add(0,i);
		}
		System.out.println("Insertar al principio de Array de 5 tarda: " + t.stop());
		
		t.start();
		for (int i=0; i<10; i++) {
			arr.add(0,i);
		}
		System.out.println("Insertar al principio de Array de 10 tarda: " + t.stop());
		
		t.start();
		for (int i=0; i<50; i++) {
			arr.add(0,i);
		}
		System.out.println("Insertar al principio de Array de 50 tarda: " + t.stop());
		
		t.start();
		for (int i=0; i<100; i++) {
			arr.add(0,i);
		}
		System.out.println("Insertar al principio de Array de 100 tarda: " + t.stop());
		
		t.start();
		for (int i=0; i<500; i++) {
			arr.add(0,i);
		}
		System.out.println("Insertar al principio de Array de 500 tarda: " + t.stop());
		
		System.out.println("");
		
		
		System.out.println("Ej 2-2");
		System.out.println("");
		MySimpleLinkedList simpleList2 = new MySimpleLinkedList();
		for (int i=0; i<500; i++) {
			simpleList2.insertAtFirst(i);
		}
		
		t.start();
		System.out.print("Lista: ");
		simpleList2.print(4);
		System.out.println("En la pos 4 se encuentra: " + simpleList2.elementAtPos(4).getInfo() + " y tarda " +t.stop());
		

		for (int i=0; i<500; i++) {
			arr2.add(0,i);
		}
		System.out.print("Arreglo: ");
		
		for (int i=0; i<10; i++) {
			System.out.print(arr2.get(i) + " ");
		}
		t.start();
		System.out.println("");
		System.out.println("En la pos 4 se encuentra: " + arr2.get(4) + " y tarda " +t.stop());
		

		System.out.println("Ej 2-3");
		System.out.println("");
		
		t.start();
		System.out.println("La lista tiene " + simpleList2.getSize() + " elementos y tarda " + t.stop() + " en responder");
		t.start();
		System.out.println("El arreglo tiene " + arr2.size() + " elementos y tarda " + t.stop() + " en responder");
	}

}
