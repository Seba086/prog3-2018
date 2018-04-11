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
		MySimpleLinkedList simpleCommonElements = new MySimpleLinkedList();
		
		Timer t = new Timer();
		int rnd;

		for (int i=0; i<5; i++) {
			rnd = (int) ((Math.random()*10)+1);
			l1.insertAtLast(rnd);
			rnd = (int) ((Math.random()*10)+1);
			l2.insertAtLast(rnd);
		}
		l1.print(5);
		System.out.println("l1: " + l1.getSize());
		l2.print(5);
		System.out.println("l2 size: " + l2.getSize());
		
		simpleCommonElements = simpleCommonElements.mergeLists(l1, l2);
		simpleCommonElements.print(50);
		System.out.println("simpleCommonElements size: " + simpleCommonElements.getSize());
	}

}
