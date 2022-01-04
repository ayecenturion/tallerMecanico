package tp1.parcial1.clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	
	private int horas;
	
	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas) {
		super(descripcion, porcentajeGanancia, patente);
		this.setHoras(horas);
	}
	
	public int getHoras() {
		return horas;
	}

	private void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public void detallar() {
		System.out.println("Servicio de cambio de aceite.");
		System.out.println("Patente: "+super.getPatente());
		System.out.println("Precio: $ " + super.calcularPrecioVenta());
		
	}

	@Override
	public double calcularCostoMateriales() {
		return COSTOMATERIAL1 + COSTOMATERIAL2;
	}

	@Override
	public double calcularCostoHoras() {
		return this.horas * COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		return calcularCostoMateriales() + calcularCostoHoras();
	}

	

}
