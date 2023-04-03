package dominio;

import java.util.Arrays;

public class EntradaRecital extends Entrada implements ICosto {
	private final double valorEntradaVip = 1500;
	private final double valorEntradaGeneral = 800;
	private char tipo;
	
	private String banda;
	private String bandasSoporte[];
	private String genero;
	
	public EntradaRecital(String banda,String[] bandasSoporte, String genero, Fecha fecha, int duracion, char Tipo) {
		super("Entrada recital para " + banda, fecha, 4);
		this.banda = banda;
		this.tipo = Tipo;
		
		if (validaBandasSoporte(bandasSoporte)) {
			setBandasSoporte(bandasSoporte);
		} else {
			System.out.println("Se excedió el numero de bandas de soporte");
			System.exit(0);
		}
		if (validaGenero(genero)) {
			this.genero = genero;
		} else {
			System.out.println("Género no existente para la entrada de recital");
			System.exit(0);
		}
	}
	
	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getBandasSoporte() {
		String bandas = "";
		for (int i = 0; i < this.bandasSoporte.length ; i++) {
			if (i == 0) {
				bandas = this.bandasSoporte[i];
			}  else {
				bandas += "," + this.bandasSoporte[i];
			}
		}
		return bandas;
	}
	
	public void setBandasSoporte(String[] bandas) {
		this.bandasSoporte = Arrays.copyOf(bandas, bandas.length);
	}
	
	public boolean validaBandasSoporte(String[] bandas) {
		boolean resultado = bandas.length <= 2 ? true : false;
		return resultado;
	}
	
	public boolean validaGenero(String nombreGenero) {
		boolean existe = existeGenero(nombreGenero) != -1 ? true : false;
		return existe;
	}
	
	public int existeGenero(String busqueda) {
		String generos[] = {"Rock","Heavy Metal","Reggaeton","Trap","Latinos","Pop"};

		for (int i = 0; i < generos.length ; i++) {
			if (busqueda.toUpperCase().equals(generos[i].toUpperCase())) {
		      return i;
		    }
		}
		return -1;
	}
	
	public void compraEntradas(double entradasVip, double entradasGeneral) {
		double costoVip = entradasVip * this.valorEntradaVip;
		double costoGeneral = entradasGeneral * this.valorEntradaGeneral;
		
		setCosto(costoVip + costoGeneral);
	}
	
	public String toString() {
		return "banda=" + getBanda() + ", banda/s soporte=" + getBandasSoporte() + ", genero=" + getGenero();
	}
	
	public String getInfoEntrada() {
		return super.toString() + ", " + this.toString();
	}

	@Override
	public double devolverCosto(double dato) {
		if(tipo=='G') { // General
			return valorEntradaGeneral;	
		}
		else { // VIP
			return valorEntradaVip;
		}

	}

}
