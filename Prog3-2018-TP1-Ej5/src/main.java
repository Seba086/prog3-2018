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
		MySimpleLinkedList l4 = new MySimpleLinkedList();
		MySimpleLinkedList listaResultante1 = new MySimpleLinkedList();
		MySimpleLinkedList listaResultante2 = new MySimpleLinkedList();
		int listaDesordenada1[] =  {23,8,17,5,8,44,7};
		int listaDesordenada2[] = {23,5,7,3,15,33,8,44,17};
		int listaOrdenada1[] = {1,3,5,7,9,11,13};
		int listaOrdenada2[] = {7,9,11,13,15,17};
		
		for (int i=0; i<listaDesordenada1.length; i++) {
			l1.insertAtLast(listaDesordenada1[i]);
		}
		for (int i=0; i<listaDesordenada2.length; i++) {
			l2.insertAtLast(listaDesordenada2[i]);
		}
		for (int i=0; i<listaOrdenada1.length; i++) {
			l3.insertAtLast(listaOrdenada1[i]);
		}
		for (int i=0; i<listaOrdenada2.length; i++) {
			l4.insertAtLast(listaOrdenada2[i]);
		}			
		listaResultante1 = listaResultante1.simpleCommonElements(l1, l2);
		listaResultante2 = listaResultante2.simpleCommonElements(l3, l4);
		
		System.out.println("Tamaño de la Lista resultante1: " + listaResultante1.getSize());
		Node tmp = listaResultante1.getFirst();
		for (int i=0; i<listaResultante1.getSize(); i++) {
			System.out.print(tmp.getInfo() + " > ");
			if(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			else {
				System.out.println(" null ");
			}
			
		}
		System.out.println("Tamaño de la Lista resultante2: " + listaResultante2.getSize());
		Node tmp2 = listaResultante2.getFirst();
		for (int i=0; i<listaResultante2.getSize(); i++) {
			System.out.print(tmp2.getInfo() + " > ");
			if(tmp2.getNext() != null) {
				tmp2 = tmp2.getNext();
			}
			else {
				System.out.println(" null ");
			}
			
		}
	}

}
