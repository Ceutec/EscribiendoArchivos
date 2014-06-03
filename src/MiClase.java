import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class MiClase
{
	
	static void escribirArchivo(File mi_archivo, String texto)
	{
		try
		{
			FileWriter mi_writer = new FileWriter(mi_archivo);
			mi_writer.write(texto);
			mi_writer.flush();
			mi_writer.close();
		}catch(Exception e)
		{
			
		}
	}
	
	static String leerArchivo(File mi_archivo)
	{
		try
		{
			Scanner mi_scanner = new Scanner(mi_archivo);
			String str = mi_scanner.next();
			return str;
		}catch(Exception e)
		{
			
		}
		return "error";
	}
	
	static void leerNumeros(File mi_archivo)
	{
		try
		{
			Scanner s = new Scanner(mi_archivo);
			
			while(s.hasNext())
			{
				int num=s.nextInt();
				System.out.println(num);
			}
		}catch(Exception e)
		{
			
		}
	}

	public static void main(String[] args)
	{
		try
		{
			File mi_archivo = new File("prueba");
			mi_archivo.createNewFile();
			
			//leerNumeros(mi_archivo);
			
			Scanner s = new Scanner(System.in);
			while(true)
			{
				System.out.print("Ingrese 1 para escribir 2 para leer 3 para salir: ");
				int opcion = s.nextInt();
				
				switch(opcion)
				{
					case 1:
						System.out.print("Ingrese el texto: ");
						String texto = s.next();
						escribirArchivo(mi_archivo, texto);
						break;
					case 2:
						String lectura = leerArchivo(mi_archivo);
						System.out.println("Texto en el archivo: "+lectura);
						break;
					case 3:
						System.exit(0);
						break;
					default:
						System.out.print("Opcion invalida.");
						break;
				}
			}
		}catch(Exception e)
		{
			
		}
	}
}
