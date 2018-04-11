import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		// Ejercicio 5
		/*Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
		suponiendo que: a) las listas están desordenadas y la lista resultante debe quedar
		ordenada. b) las listas están ordenadas y la lista resultante debe mantenerse ordenada.*/

		MySimpleLinkedList simpleList1 = new MySimpleLinkedList();
		MySimpleLinkedList simpleList2 = new MySimpleLinkedList();
		MySimpleLinkedList simpleCommonElements = new MySimpleLinkedList();
		
		Timer t = new Timer();

		for (int i=0; i<5; i++) {
			simpleList1.insertAtFirst(i);
		}
	}

}
