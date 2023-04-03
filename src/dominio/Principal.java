package dominio;

public class Principal extends Fecha {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(01, 03, 2021);
		
		String[] bandas = {"Pescado Rabioso", "banda 2"};
		EntradaRecital entradaRecital = new EntradaRecital("Pearl Jam", bandas, "Rock", fecha, 1, 'G');
		
		System.out.println(entradaRecital.toString());
		
		String[] bandas2 = {"Cuarteto de Nos", "banda 3"};
		EntradaRecital entradaRecital2 = new EntradaRecital("Las Pastillas del Abuelo", bandas2, "Rock", fecha, 1, 'V');
		
		System.out.println(entradaRecital2.toString());

		
		
		String[] artistas = {"Darin", "Francella"};
		EntradaTeatro entradaTeatro = new EntradaTeatro("El secreto de sus ojos", "Drama", artistas, fecha, 2, 'G');
		System.out.println(entradaTeatro.toString());

		String[] artistas2 = {"Pampita", "Rojas"};
		EntradaTeatro entradaTeatro2 = new EntradaTeatro("Teatro de Revistas", "Teatro", artistas2, fecha, 2, 'G');
		System.out.println(entradaTeatro2.toString());

		String[] artistas3 = {"Gonzalez", "Ramirez"};
		EntradaTeatro entradaTeatro3 = new EntradaTeatro("Somos comunes", "Comedia", artistas3, fecha, 2, 'G');
		System.out.println(entradaTeatro3.toString());
		
		
		
		EntradaInfantil entradaInfantil = new EntradaInfantil("Xuxa", fecha, 2, 6, true);
		System.out.println(entradaInfantil.toString());
		
		EntradaInfantil entradaInfantil2 = new EntradaInfantil("Pi�on Fijo", fecha, 2, 12, false);
		System.out.println(entradaInfantil2.toString());
		
		
		
		EntradaDeporte entradaDeporte = new EntradaDeporte("Futbol clase F", fecha, 2, "Futbol", true, 'F');
		System.out.println(entradaDeporte.toString());

		EntradaDeporte entradaDeporte2 = new EntradaDeporte("Rugby clase B", fecha, 2, "Rugby", false, 'R');
		System.out.println(entradaDeporte2.toString());

		EntradaDeporte entradaDeporte3 = new EntradaDeporte("Hockey clase C", fecha, 2, "Hockey", false, 'H');
		System.out.println(entradaDeporte3.toString());
	}


}
