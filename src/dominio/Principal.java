package dominio;

public class Principal extends Fecha {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(01, 03, 2021);
		
		String[] bandas = {"pescado rabioso", "banda 2"};
		EntradaRecital entradaRecital = new EntradaRecital("pearl jam", bandas, "rock", fecha, 1, 'G');
		entradaRecital.compraEntradas(2, 3);
		System.out.println(entradaRecital.getInfoEntrada());
		
		EntradaInfantil entradaInfantil = new EntradaInfantil("Xuxa", fecha, 2, 8, true);
		System.out.println(entradaInfantil.toString());
	}


}
