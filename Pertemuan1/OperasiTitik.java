

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		// titik.ordinat = titik.ordinat * -1 ;
		double x ;
		x = titik.getOrdinat() ;
		x *= -1 ;
		titik.setOrdinat(x) ;
	}
	
	private void refleksiSumbuY(Titik titik){
		// titik.absis = titik.absis * -1 ;
		double y ;
		y = titik.getAbsis() ;
		y *= -1 ;
		titik.setAbsis(y) ;
	}
	
	public double RefleksiX(Titik titik){
		double a ;
		refleksiSumbuX(titik) ;
		a = titik.getOrdinat() ;
		return a ;
	}
	
	public double RefleksiY(Titik titik){
		double b ;
		refleksiSumbuY(titik) ;
		b = titik.getAbsis() ;
		return b ;
	}
}