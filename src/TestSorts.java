import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestSorts {

	@Test
	void testSelection() {
		Ordenador order = new Ordenador();
		int[] arr = new int[3];
		arr[2] = 12;
		arr[1] = 98;
		arr[0] = 100;
		arr = order.selectionSort(arr);
		assertEquals(arr[0], 12);
	}
	@Test
	void testMerge() {
		Ordenador order = new Ordenador();
		int[] arr = new int[3];
		arr[2] = 12;
		arr[1] = 98;
		arr[0] = 100;
		arr = order.mergeSort(arr);
		assertEquals(arr[1], 98);
	}
	@Test
	void testQuick() {
		Ordenador order = new Ordenador();
		int[] arr = new int[3];
		arr[2] = 12;
		arr[1] = 98;
		arr[0] = 100;
		arr = order.quickSort(arr);
		assertEquals(arr[2], 100);
	}

}
