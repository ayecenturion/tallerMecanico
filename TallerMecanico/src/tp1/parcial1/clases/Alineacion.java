package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;
	
	private int horas;
	private boolean conBalanceo;
	
	public Alineacion(String descripcion, double porcentajeGanancia,
			 String patente, int horas, boolean conBalanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.setHoras(horas);
		this.setConBalanceo(conBalanceo);
	}

	public int getHoras() {
		return horas;
	}

	private void setHoras(int horas) {
		this.horas = horas;
	}

	public boolean isConBalanceo() {
		return conBalanceo;
	}
	
	private void setConBalanceo(boolean conBalanceo) {
		this.conBalanceo = conBalanceo;
	}



	@Override
	public void detallar() {
		System.out.println("Servicio de alineación.");
		System.out.println("Patente: "+super.getPatente());
		System.out.println("Precio: $ " + super.calcularPrecioVenta());
		
	}

	@Override
	public double calcularCostoHoras() {
		return this.horas * COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		double total = 0;
		
		if(this.conBalanceo == true) {
			total = calcularCostoHoras() + EXTRABALANCEO;
		}else {
			total = calcularCostoHoras();
		}
		return total;
	}
	

}
