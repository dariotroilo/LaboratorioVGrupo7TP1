package dominio;

public class EntradaDeporte extends Entrada{
	
	private String deporte;
	private final static double ValorFutbol = 300;
	private final static double ValorRugby = 450;
	private final static double ValorHockey = 380;
	private boolean IsNacional ;
	private double valor = 0; 
	private static double RecargoInt = 1.3;
	
	
	//Constructors
	public EntradaDeporte () {
		super();
		this.IsNacional = false;
		this.deporte = null;;
	}
	
	public EntradaDeporte(String nombre, Fecha fecha, int duracion, String deporte, boolean nacional) {
		
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
		return "EntradaDeporte [deporte=" + deporte + ", IsNacional=" + IsNacional + ", valor=" + valor + "]";
	}
	
	
	
	//Getters and Setters
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static double getValorfutbol() {
		return ValorFutbol;
	}

	public static double getValorrugby() {
		return ValorRugby;
	}

	public static double getValorhockey() {
		return ValorHockey;
	}

	public boolean isIsNacional() {
		return IsNacional;
	}

	public static void setRecargoInt(double recargoInt) {
		RecargoInt = recargoInt;
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
	
	
}