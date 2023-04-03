package dominio;

public class EntradaDeporte extends Entrada implements ICosto{
	
	private final static double ValorFutbol = 300;
	private final static double ValorRugby = 450;
	private final static double ValorHockey = 380;
	private char tipo;
	private boolean IsNacional ;
	private double costo; 
	private static double RecargoInt = 1.3;
	
	
	public EntradaDeporte () {
		super();
		this.IsNacional = false;
		this.tipo = '\0';
	}
	
	public EntradaDeporte(String nombre, Fecha fecha, int duracion, boolean nacional, char Tipo) {
		this.tipo = Tipo;
		if (existeDeporte(Tipo) != '\0') {
			this.tipo = Tipo;
		} 
		else 
		{
			System.out.println("No existe el deporte indicado");
		}

		if (nacional) { RecargoInt = 1;	}
		this.costo=devolverCosto(Tipo);
	}
	
	@Override
	public String toString() {
		if (tipo != '\0' || costo==0 ) {
			return "EntradaDeporte [IsNacional=" + IsNacional + ", Costo=" + costo + "]";
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
	
	
	public char existeDeporte(char tipo) {
		char deportes[] = {'F','H','R'};

		for (int i = 0; i < deportes.length ; i++) {
			if (tipo==(deportes[i])) {
		      return tipo;
		    }
		}
		return '0';
	}

	@Override
	public double devolverCosto(double dato) {
		if (tipo == 'F') {
			return ValorFutbol * RecargoInt;
		}
		else if(tipo == 'R'){
			return ValorRugby * RecargoInt;
		}
		else if(tipo == 'H'){
			return ValorHockey * RecargoInt;
		}
		else {
			return 0;
		}
	}
	
	
}