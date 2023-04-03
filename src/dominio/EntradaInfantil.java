package dominio;


public class EntradaInfantil extends Entrada implements ICosto {
	private final double mayores = 500;
	private final double menores = 250;

	
	private boolean contieneSouvenir;
	
	// constructor sin parámetros
	public EntradaInfantil () {
		super();
		this.contieneSouvenir = false;
	}
	
	// constructor con parámetros
	public EntradaInfantil (String nombre, Fecha fecha, int duracion, int edad, boolean contieneSouvenir) {
		super(nombre, fecha, duracion);
		this.contieneSouvenir = contieneSouvenir;
	}
	
	
	// metodo que devuelve el costo de la entrada según la edad
 
	
	// getters y setters
	public boolean isContieneSouvenir() {
		return contieneSouvenir;
	}
	public void setContieneSouvenir(boolean contieneSouvenir) {
		this.contieneSouvenir = contieneSouvenir;
	}

	@Override
	public String toString() {
		return "contieneSouvenir=" + (contieneSouvenir ? "Si, " : "No, ") + super.toString() + "";
	}

	@Override
	public double devolverCosto(double edad) {
		if(edad<=8)
			return menores;
		else
			return mayores;

	}
	
}
