import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	void testSelection() {
		Ordenador sr = new Ordenador();
		sr.selectionSort(sr.listadoDesordenado(100));
	}
	void testMerge() {
		Ordenador sr0 = new Ordenador();
		sr.mergeSort(sr.listadoDesordenado(100));
	}
	
	void quickSelection() {
		Ordenador sr1 = new Ordenador();
		sr.quickSort(sr.listadoDesordenado(100));
	}

}
