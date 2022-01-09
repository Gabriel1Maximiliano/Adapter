package ar.com.learsoft.missile;

public class Misiles2 {

private double peso;
private double destino;
private double volumen;

	public double getPeso() {
	return peso;
}


public void setPeso(double peso) {
	this.peso = peso;
}


public double getDestino() {
	return destino;
}


public void setDestino(double destino) {
	this.destino = destino;
}


public double getVolumen() {
	return volumen;
}


public void setVolumen(double volumen) {
	this.volumen = volumen;
}


	public double Destiny(double millas ,double yardas ) {
     double resultadoMillas = millas*(1.6/1760);
     double resultadoYardas = yardas*1.6;
     System.out.print("KM: ");	
		return destino = (resultadoMillas+resultadoYardas);
		
	}

	
	public double Weight(double pounds, double ounces) {
		double resultadoOunces = ounces*(1/16);
		double previoRes = resultadoOunces + pounds;
		System.out.print("KG: ");
		return peso =(previoRes*0.5);
		
	}


	public double Volume(double gallons , double quart , double pint) {
		
		double resultado  = (gallons*4)+(quart)+(pint*0.5);
		System.out.print("LT: ");
		return volumen = resultado;
		
	}

}
