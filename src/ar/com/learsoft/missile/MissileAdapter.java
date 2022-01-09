package ar.com.learsoft.missile;

public class MissileAdapter extends Misiles2 implements Metodos {
	
	
	
	public MissileAdapter() {
		
		
		 System.out.println("ejecutando conversion");
		 
	}

	@Override
	public void LocationDestiny(double millas ,double yardas) {
	
		this.Destiny(millas,yardas);
		
		
	}

	@Override
	public void PackageWeight(double pounds, double ounces) {
		this.Weight(pounds, ounces);
		
	}

	@Override
	public void PAckageVolume(double gallons , double quart , double pint) {
	 this.Volume(gallons, quart, pint);
		
	}

	
	
	

}
