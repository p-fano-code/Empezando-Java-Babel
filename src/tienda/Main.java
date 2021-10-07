package tienda;

import java.io.Console;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlacaBase placa1 = new PlacaBase();
		placa1.setMarca("Gigabyte");
		placa1.setModelo("Super 500");
		placa1.setPrecio(100);
		
		Periferico pantalla = new Periferico();
		pantalla.setMarca("Philips");
		pantalla.setNombre("Ultra HQ");
		pantalla.setPrecio(100);
		ArrayList<Periferico> listaPerifericos = new ArrayList<Periferico>();
		listaPerifericos.add(pantalla);
		
		Ram ram1 = new Ram();
		ram1.setGeneracion("Generacion1");
		ram1.setHz(2.5);
		ram1.setPrecio(100);
		ArrayList<Ram> listaRams = new ArrayList<Ram>();
		listaRams.add(ram1);
		
		TarjetaGrafica especifica = new TarjetaGrafica();
		especifica.setMarca("Nvidia");
		especifica.setModelo("Gtx 1080");
		especifica.setPrecio(100);		
		Ram vRam = new Ram();
		vRam.setGeneracion("GeneracionX");
		vRam.setHz(1.2);
		vRam.setPrecio(100);
		especifica.setRam(vRam);
		listaRams.add(vRam);
		ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList<TarjetaGrafica>();
		listaTarjetas.add(especifica);
		
		
		Procesador procesador = new Procesador();
		procesador.setHz(4.2);
		procesador.setMarca("Intel");
		procesador.setPrecio(100);
		TarjetaGrafica integrada = new TarjetaGrafica();
		integrada.setMarca("Intel");
		integrada.setModelo("Graphics z100");
		integrada.setPrecio(100);			
		procesador.setTarjetaIntegrada(integrada);
		listaTarjetas.add(integrada);
		
		Ordenador pcmaster = new Ordenador();
		pcmaster.setMarca("Toshiba");
		pcmaster.setPrecio(100);
		pcmaster.setProcesador(procesador);
		pcmaster.setPlacaBase(placa1);
		pcmaster.setListaPerifericos(listaPerifericos);
		pcmaster.setListaRam(listaRams);
		pcmaster.setListaTarjetasGraficas(listaTarjetas);
		
		System.out.println(pcmaster.toString()); 
		System.out.println("Total componentes: "+pcmaster.calcularPrecioComponentes(pcmaster)+" €");
		
		
		
		
	}

}
