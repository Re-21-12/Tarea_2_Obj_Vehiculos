/**
 * 
 */
package tarea_2;

/**
 * 
 */
import java.util.*;

public class Clase_Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion = "";
		Double distancia = 0.0;
		int cantidad_Carros = 0;
		int cantidad_Vueltas = 0;
		int tiempo = 0;
		int[] arreglo_Carros = {};
		int total_vueltas = 0;
		double vueltas_promedio = 0.0;
		Pista pista = new Pista();
		Vueltas vueltas = new Vueltas();
		Carros carros = new Carros();
		while (!opcion.equalsIgnoreCase("5")) {
			System.out.println(
					"Ingrese una opcion: \n 1. Ingresar una distancia \n 2.Ingresar una cantidad de carros \n 3.Ingresar la cantidad de vueltas \n 4. Ingrese los tiempos para las vueltas \n 5. Salir");
			opcion = entrada.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado ingresar una distancia para la pista");

				distancia = entrada.nextDouble();
				pista.setDistancia(distancia);
				System.out.println("La distancia es: " + pista.getDistancia());
				entrada.nextLine();
				break;
			case "2":
				System.out.println("Ha seleccionado ingresar una cantidad de carros");

				cantidad_Carros = entrada.nextInt();
				carros.setCantidad_carros(cantidad_Carros);
				arreglo_Carros = carros.carros_en_pista(cantidad_Carros);
				System.out.println("La cantidad de carros ha ingresar es: " + carros.getCantidad_carros());
				entrada.nextLine();
				break;

			case "3":
				System.out.println("Ha seleccionado ingresar una cantidad de vueltas");
				cantidad_Vueltas = entrada.nextInt();

				vueltas.setCantidad_vueltas(cantidad_Vueltas);
				System.out.println("La cantidad de vueltas es " + vueltas.getCantidad_vueltas());
				entrada.nextLine();
				break;
			case "4":
				System.out.println("Ha seleccionado ingresar los tiempos para cada vuelta");

				for (int carro = 0; carro < cantidad_Carros; carro++) {
					System.out.println("Ingrese el tiempo para el carro " + (carro + 1) + ":");
					for (int vuelta = 0; vuelta < cantidad_Vueltas; vuelta++) {
						System.out.println("Ingrese el tiempo para la vuelta " + (vuelta + 1) + ":");

						tiempo = entrada.nextInt();
						vueltas.setTiempo_vuelta(tiempo);
						arreglo_Carros[carro] = vueltas.getTiempo_vuelta();

					}
				}
				for (int vuelta_tiempo = 0; vuelta_tiempo < arreglo_Carros.length; vuelta_tiempo++) {
					total_vueltas += arreglo_Carros[vuelta_tiempo];
					vueltas_promedio = total_vueltas / arreglo_Carros.length;
					carros.setVelocidad_promedio(vueltas_promedio);
				}
				System.out.println("Las vueltas promedio son: " + carros.getVelocidad_promedio());
				entrada.nextLine();
				break;
			case "5":
				System.out.println("Que tenga un lindo dia");

				break;
			default:
				System.out.println("Ingrese una opcion correcta");
			}
			
		}
		entrada.close();
	}

}
