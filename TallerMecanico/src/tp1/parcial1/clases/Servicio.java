package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {
	
	
	private String descripcion;
    private double porcentajeGanancia;
    private String patente;

	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
		this.setDescripcion(descripcion);
		this.setPorcentajeGanancia(porcentajeGanancia);
		this.setPatente(patente);
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	private void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public String getPatente() {
		return patente;
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}



	public abstract double calcularPrecioCosto();
	
	public double calcularPrecioVenta() {
		double costo = this.calcularPrecioCosto();
		return costo+(this.porcentajeGanancia*costo/100);
	}
	

	

	
}
