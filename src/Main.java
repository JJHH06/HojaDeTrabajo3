import java.util.Scanner;

/**
 * @author josej
 *
 */
public class Main{

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	/**	Thread.sleep(1000);
		double inicio = System.currentTimeMillis();
		**/
		
		
		
		Scanner teclado = new Scanner(System.in);  // Create a Scanner object
	    

	    String input;
	    boolean opcion = true;
	    String listado = "";
		
		 Ordenador sorter = new Ordenador();
		 int[] arreglo = sorter.listadoDesordenado(100);
		 ModificadorTexto modificator = new ModificadorTexto();
		 modificator.escribirTexto(arreglo);
		 
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
				 modificator.escribirTexto(sorter.mergeSort(ModificadorTexto.lectorDeTexto()));
					listado = "";
				}
			
			 
			 if(input.equals("2")) {
				 System.out.println("ingrese la cantidad de numeros a generar");
				 input = teclado.nextLine();
				 modificator.escribirTexto(sorter.listadoDesordenado(Integer.parseInt(input)));
				 for (int i : ModificadorTexto.lectorDeTexto()) {
						listado += i +",";
						
					}
				 modificator.escribirTexto(sorter.listadoDesordenado(Integer.parseInt(input)));
				 
					System.out.println(listado);
					listado = "";
				
					
				}
			 else if(input.equals("3")) {
				   
				 modificator.escribirTexto(sorter.selectionSort(ModificadorTexto.lectorDeTexto()));
					for (int i : ModificadorTexto.lectorDeTexto()) {
						listado += i +",";
						
					}
					
					System.out.println(listado);
					
					listado = "";
				}
			 else if(input.equals("4")) {
				 modificator.escribirTexto(sorter.mergeSort(ModificadorTexto.lectorDeTexto()));
					for (int i : ModificadorTexto.lectorDeTexto()) {
						listado += i +",";
						
					}
					System.out.println(listado);
					
					listado = "";
				}
			 else  if(input.equals("5")) {
				 modificator.escribirTexto(sorter.quickSort(ModificadorTexto.lectorDeTexto()));
					for (int i : ModificadorTexto.lectorDeTexto()) {
						listado += i +",";
						
					}
					System.out.println(listado);
					
					listado = "";
				}
			 else if(input.equals("6")) {
				 modificator.escribirTexto(sorter.radixSort(ModificadorTexto.lectorDeTexto()));
					for (int i : ModificadorTexto.lectorDeTexto()) {
						listado += i +",";
						
					}
					System.out.println(listado);
					
					listado = "";
				}
			 
			 else if(input.equals("7")) {
				 modificator.escribirTexto(sorter.heapSort(ModificadorTexto.lectorDeTexto()));
					for (int i : ModificadorTexto.lectorDeTexto()) {
						listado += i +",";
						
					}
					System.out.println(listado);
					
					listado = "";
				}
			 
			 else if(input.equals("salir")) {
			opcion = !opcion;
		}
		
		 }
		 
		 
		 //CODIGO UTILIZADO PARA TIEMPO*PALABRAS
		 /**
		  input = teclado.nextLine();
		  arreglo = sorter.listadoDesordenado(Integer.parseInt(input));
		  
		  
		  */
		 
		 
	
	}




	

}
