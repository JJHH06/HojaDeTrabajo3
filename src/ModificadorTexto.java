import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class ModificadorTexto {
	
	public void escribirTexto(int[] arr) {
		File archivo = new File("datos.txt");
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo);
			String texto = Arrays.toString(arr);
			for(int i=0; i<texto.length();i++){
			escribir.write(texto.charAt(i));
			}
			//escribir.flush();
			escribir.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static int[] lectorDeTexto() throws Exception{
		String barra = File.separator;
		String dir = System.getProperty("user.dir");
		//AQUI SE LEE EL ARCHIVO TXT
		//si no corre se debe de reemplazar en el parentesis (dir + barra +"NOMBRE DEL FOLDER EN DONDE ESTA EL PROYECTO"+barra+ "datos.txt")
		//El error del archivo de texto puede pasar si se corre el programa en eclipse y no en consola
		//o tambien sucede al trabajar con paquetes
		File archivo = new File (dir + barra + "datos.txt");
		FileReader fr;
		String linea = "";
		fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String[] listaLinea = null;
		String colector = "";
		
		while((linea = br.readLine()) != null){
			colector = linea;
			
		}
		String pattern = "\\[";
		String pattern1 = "\\]";
		colector = colector.replaceAll(pattern, "");
		colector = colector.replaceAll(pattern1, "");
		listaLinea = colector.split(", ");
		int[] listaInt = new int[listaLinea.length];
		
		for (int i = 0; i < listaLinea.length; i++) {
			listaInt[i] = Integer.parseInt(listaLinea[i]);
		}
		return listaInt;
			
	}

}
