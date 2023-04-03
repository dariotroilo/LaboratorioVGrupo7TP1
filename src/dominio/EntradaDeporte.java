package dominio;

public class EntradaDeporte extends Entrada implements ICosto{
	
	private String deporte;
	private final static double ValorFutbol = 300;
	private final static double ValorRugby = 450;
	private final static double ValorHockey = 380;
	private char tipo;
	private boolean IsNacional ;
	private double valor = 0; 
	private static double RecargoInt = 1.3;
	
	
	public EntradaDeporte () {
		super();
		this.IsNacional = false;
		this.deporte = null;
	}
	
	public EntradaDeporte(String nombre, Fecha fecha, int duracion, String deporte, boolean nacional, char Tipo) {
		this.tipo = Tipo;
		if (existeDeporte(deporte)) {
			this.deporte = deporte.toUpperCase();
		} 
		else 
		{
			System.out.println("No existe el deporte indicado");
			System.exit(0);
		}

		if (nacional) {
			RecargoInt = 1;
		}
		
		switch(deporte) {
		 case "FUTBOL": valor=ValorFutbol * RecargoInt;
		 break;
		 case "RUGBY": valor=ValorRugby * RecargoInt;
		 break;
		 case "HOCKEY": valor=ValorRugby * RecargoInt;
		 break;
		}
		
	}
	
	@Override
	public String toString() {
		if (deporte != null) {
			return "EntradaDeporte [deporte=" + deporte + ", IsNacional=" + IsNacional + ", valor=" + valor + "]";
		}
		else
		{
			return "EntradaDeporte: El deporte indicado no existe";
		}
	}
	
	public boolean Isnacional() {
		return IsNacional;
	}

	public void setIsNacional(boolean nacional) {
		this.IsNacional = nacional;
	}  
	
	public static double getValorFutbol() {
		return ValorFutbol;
	}
	
	public static double getValorRugby() {
		return ValorRugby;
	}
	
	public static double getValorHockey() {
		return ValorHockey;
	}
	
	public static double getRecargoInt() {
		return RecargoInt;
	}
	
	public void setvalor(double valor) {
		this.valor = valor;
	}
	
	public boolean existeDeporte(String deporte) {
		String deportes[] = {"Futbol","Hockey","Rugby"};

		for (int i = 0; i < deportes.length ; i++) {
			if (deporte.toUpperCase().equals(deportes[i].toUpperCase())) {
		      return true;
		    }
		}
		return false;
	}

	@Override
	public double devolverCosto(double dato) {
		if (tipo == 'F') {
			return ValorFutbol;
		}
		else if(tipo == 'R'){
			return ValorRugby;
		}
		else {
			return ValorHockey;
		}
	}
	
	
}