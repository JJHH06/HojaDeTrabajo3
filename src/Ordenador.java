import java.util.Random;
/**
 * @author josej
 *
 */
public class Ordenador {
	
	/**
	 * 
	 * @param generados
	 * @return lista al azar
	 */
	public int[] listadoDesordenado(int generados) {
		Random rand = new Random();
		int[] numeros = new int[generados];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(3000); 
		}
		return numeros;
	}
	
	/**
	 * 
	 * @param listadoDesordenado
	 * @return sort selection
	 */
	public int[] selectionSort(int[] listadoDesordenado) {
		int[] listadoOrdenamiento = listadoDesordenado;
		SelectionSort.sort(listadoOrdenamiento);
		return listadoOrdenamiento;
	}
	/**
	 * 
	 * @param listadoDesordenado
	 * @return merge sort
	 */
	public int[] mergeSort(int[] listadoDesordenado) {
		int[] listadoOrdenamiento = listadoDesordenado;
		MergeSort.sort(listadoOrdenamiento,0,listadoOrdenamiento.length-1);
		return listadoOrdenamiento;
	}
	
	/**
	 * 
	 * @param listadoDesordenado
	 * @return quick sort
	 */
	public int[] quickSort(int[] listadoDesordenado) {
		int[] listadoOrdenamiento = listadoDesordenado;
		QuickSort.sort(listadoOrdenamiento,0,listadoOrdenamiento.length-1);
		return listadoOrdenamiento;
	}
	
	/**
	 * 
	 * @param listadoDesordenado
	 * @return radix sort
	 */
	public int[] radixSort(int[] listadoDesordenado) {
		int[] listadoOrdenamiento = listadoDesordenado;
		Radix.radixsort(listadoOrdenamiento,listadoOrdenamiento.length);
		return listadoOrdenamiento;
	}
	

	/**
	 * 
	 * @param listadoDesordenado
	 * @return heap sort
	 */
	public int[] heapSort(int[] listadoDesordenado) {
		int[] listadoOrdenamiento = listadoDesordenado;
		HeapSort.sort(listadoOrdenamiento);
		return listadoOrdenamiento;
	}
}
