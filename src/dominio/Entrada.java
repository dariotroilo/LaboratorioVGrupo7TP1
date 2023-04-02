package dominio;

public abstract class Entrada {

	// atributos
	private int id;
	private static int cont = 0;
	private String nombre;
	private Fecha fecha;
	private int duracion;
	private double costo;

	// constructor
	public Entrada() {
		// autogenerar id
		cont++;
		// Ver fecha
		setFecha(null);
		id = cont;
		nombre = "Sin nombre";
		duracion = 0;
		costo = 0;
	}
	
   //constructor con parámetros
	public Entrada(String nombre, Fecha fecha, int duracion, double d ) {
		cont++;
		id = cont;
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracion = duracion;
		this.costo = d;
	}

	// getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Entrada id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion + ", costo="+ costo;
	}

}
