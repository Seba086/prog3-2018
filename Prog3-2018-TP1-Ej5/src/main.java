import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		// Ejercicio 5
		/*Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
		suponiendo que: a) las listas están desordenadas y la lista resultante debe quedar
		ordenada. b) las listas están ordenadas y la lista resultante debe mantenerse ordenada.*/

		MySimpleLinkedList l1 = new MySimpleLinkedList();
		MySimpleLinkedList l2 = new MySimpleLinkedList();
		MySimpleLinkedList l3 = new MySimpleLinkedList();
		int infoNumbers1[] = {5,7,3,15,33};
		int infoNumbers2[] = {23,1,17,9,44};
		
		Timer t = new Timer();
		int rnd;

		for (int i=0; i<5; i++) {
			l1.insertAtLast(infoNumbers1[i]);
			l2.insertAtLast(infoNumbers2[i]);
		}
		l1.print(5);
		System.out.println("l1: " + l1.getSize());
		l2.print(5);
		System.out.println("l2 size: " + l2.getSize());
		
		l3 = l3.simpleCommonElements(l1, l2);
		l3.print(l1.getSize() + l2.getSize());
		System.out.println("simpleCommonElements size: " + l3.getSize());
	}

}
