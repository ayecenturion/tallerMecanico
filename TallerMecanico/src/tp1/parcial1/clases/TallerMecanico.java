package tp1.parcial1.clases;
import java.util.ArrayList;

public class TallerMecanico {
	
	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	private ArrayList<Integer> cantServicios;
	private static int CANT_SVCOS = 3;
	
	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	
	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<>();
		this.cantServicios = new ArrayList<>();
		inicializarCantSvcos();

	}
	
	private void inicializarCantSvcos() {
		for(int i = 0; i<CANT_SVCOS; i++) {
			this.cantServicios.add(0);
		}
	}
	
	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		
		
		if(nuevoServicio != null) {
			this.serviciosEfectuados.add(nuevoServicio);
			sumarCantServicios(nuevoServicio);
			pudo = true;
		}

		return pudo;
	}
	
	
	
	public void listarServicios() {
		System.out.println("------------------Taller Ort Boxes--------------------");
		System.out.printf(FORMATO_CANTIDADES, this.cantServicios.get(0), this.cantServicios.get(1), this.cantServicios.get(2));
		
		double precioTotal = 0;
		
		for(Servicio s : this.serviciosEfectuados) {
			precioTotal+=s.calcularPrecioVenta();
		}
		
		System.out.println("El importe total de ventas es de $ " + precioTotal);
		
	}
	
	private void sumarCantServicios(Servicio s) {
		
		int suma = 0;
	
		if(s instanceof CambioAceite) {
			suma = this.cantServicios.get(0);
			suma ++;
			this.cantServicios.set(0, suma);
		}else if(s instanceof Alineacion) {
			suma = this.cantServicios.get(1);
			suma ++;
			this.cantServicios.set(1, suma);
		}else {
			suma = this.cantServicios.get(2);
			suma ++;
			this.cantServicios.set(2, suma);
		}
	}
}
