import java.util.Random;

/**
 * 
 */

/**
 * @author josej
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int[] numeros = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100); 
		}
		
		for (int i : numeros) {
			System.out.println(i);
		}
		
	}

}
