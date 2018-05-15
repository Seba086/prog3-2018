public class Mergesort {
	private static MySimpleLinkedList numbers;
	private static int[] helper;
	private static int number;

	public static void sort(MySimpleLinkedList values) {
		numbers = values;
		number = values.getSize();
		helper = new int[number];
		mergesort(0, number - 1);
	}

	private static void merge(int low, int middle, int high) {
		// copier ambas partes al array helper
		for (int i = low; i <= high; i++) {
			helper[i] = numbers.nodeAt(i).getInfo();
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		// copiar de manera ordenada al array original los valores de la
		// mitad izquierda o de la derecho
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers.nodeAt(k).setInfo(helper[i]);
				i++;
			} else {
				numbers.nodeAt(k).setInfo(helper[j]);
				j++;
			}
			k++;
		}
		// si quedaron elementos copiarlos al array original
		while (i <= middle) {
			numbers.nodeAt(k).setInfo(helper[i]);
			k++;
			i++;
		}
		while (j <= high) {
			numbers.nodeAt(k).setInfo(helper[j]);
			k++;
			j++;
		}
	}

	private static void mergesort(int low, int high) {
		// si low es menor que high continua el ordenamiento
		// si low no es menor que high entonces el array está ordenado
		if (low < high) {
			// obtener el indice del elemento que se encuentra en la mitad
			// al ser int redondea el resultado al entero menor
			int middle = (low + high) / 2;
			// ordenar la mitad izquierda del array
			mergesort(low, middle);
			// ordenar la mitad derecha del array
			mergesort(middle + 1, high);
			// combiner ambas mitades ordenadas
			merge(low, middle, high);
		}

	}

}
