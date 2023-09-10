
public class EjecutarFabrica {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaMuebles fabrica;
		fabrica = new FabricaSillas();
		Mueble silla = fabrica.CrearMueble();
		silla.armarMueble();
		fabrica = new FabricaMesas();
		Mueble mesa = fabrica.CrearMueble();
		mesa.armarMueble();
	}


}
