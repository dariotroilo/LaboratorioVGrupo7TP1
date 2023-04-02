package dominio;


public class EntradaInfantil extends Entrada {
    
	private boolean contieneSouvenir;
	
	// constructor sin par�metros
	public EntradaInfantil () {
		super();
		this.contieneSouvenir = false;
	}
	
	// constructor con par�metros
	public EntradaInfantil (String nombre, Fecha fecha, int duracion, int edad, boolean contieneSouvenir) {
		super(nombre, fecha, duracion,devolverCosto(edad));
		this.contieneSouvenir = contieneSouvenir;
	}
	
	
	//metodo que devuelve el costo de la entrada seg�n la edad
   private static double devolverCosto(int edad) {
	   if(edad<=8) {
		   return 250;
	   }
	   else {
		   return 500;
	   }
   }
	
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
	
}
