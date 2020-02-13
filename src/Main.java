import java.util.Scanner;

/**
 * @author josej
 *
 */
public class Main{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/**	Thread.sleep(1000);
		double inicio = System.currentTimeMillis();
		**/
		
		
		
		Scanner teclado = new Scanner(System.in);  // Create a Scanner object
	    

	    String input;
	    boolean opcion = true;
	    String listado = "";
		//1
		 double startTime;
		
		 double estimatedTime;
		 Ordenador sorter = new Ordenador();
		 int[] arreglo = sorter.listadoDesordenado(100);
		 
		 while(opcion){
			 System.out.println("Que deseas hacer");
			 System.out.println("1. ordenar arreglo");
			 System.out.println("2. desordenar arreglo");
			 System.out.println("3. selection sort");
			 System.out.println("4. merge sort");
			 System.out.println("5. quick sort");
			 System.out.println("6. radix sort");
			 System.out.println("7. heap sort");
			 System.out.println("o 'salir' para salir");
			 
			 
			 input = teclado.nextLine();
			 if(input.equals("1")) {
					sorter.mergeSort(arreglo);
				}
			
			 
			 if(input.equals("2")) {
				 System.out.println("ingrese la cantidad de numeros a generar");
				 input = teclado.nextLine();
				 arreglo = sorter.listadoDesordenado(Integer.parseInt(input));
				 for (int i : arreglo) {
						listado += i +",";
						
					}
				 
					System.out.println(listado);
					listado = "";
				
					
				}
			 else if(input.equals("3")) {
					sorter.selectionSort(arreglo);
					for (int i : arreglo) {
						listado += i +",";
						
					}
					System.out.println(listado);
					listado = "";
				}
			 else if(input.equals("4")) {
					sorter.mergeSort(arreglo);
					for (int i : arreglo) {
						listado += i +",";
					}
					System.out.println(listado);
					listado = "";
				}
			 else  if(input.equals("5")) {
					sorter.quickSort(arreglo);
					for (int i : arreglo) {
						listado += i +",";
					}
					System.out.println(listado);
					listado = "";
				}
			 else if(input.equals("6")) {
					sorter.radixSort(arreglo);
					for (int i : arreglo) {
						listado += i +",";
					}
					System.out.println(listado);
					listado = "";
				}
			 
			 else if(input.equals("7")) {
					sorter.heapSort(arreglo);
					for (int i : arreglo) {
						listado += i +",";
					}
					System.out.println(listado);
					listado = "";
				}
			 
			 else if(input.equals("salir")) {
			opcion = !opcion;
		}
		
		 }
		 
		 
	
	}




	

}
