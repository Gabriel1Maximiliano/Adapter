
package ar.com.learsoft.launcher;

import ar.com.learsoft.missile.Missile;
import ar.com.learsoft.missile.MissileAdapter;

public class MissileLauncher {
	public static void main(String[] args) {
		Missile missile = new Missile();
		missile.setKilograms(150);
		missile.setLiters(20);
		missile.setKilometers(1200);
		launch(missile);
		MissileAdapter misiles2= new MissileAdapter();
        misiles2.LocationDestiny(1, 2);
        misiles2.PAckageVolume(12, 3, 5);
        misiles2.PackageWeight(23, 54);
     launch(misiles2);
      
	}

	private static void launch(Missile missile) {
		System.out.println("KG: " + missile.getKilograms());
		System.out.println("KM: " + missile.getKilometers());
		System.out.println("LT: " + missile.getLiters());
	}
	private static void launch(MissileAdapter missiles2) {
		System.out.println("KG: " + missiles2.getDestino());
		System.out.println("KM: " + missiles2.getPeso());
		System.out.println("LT: " + missiles2.getVolumen());
	}
}
