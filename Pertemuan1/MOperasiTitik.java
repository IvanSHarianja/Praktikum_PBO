
public class MOperasiTitik{
	public static void main (String[] args){
	Titik t = new Titik(4,4) ;
	OperasiTitik op = new OperasiTitik() ;
	System.out.println("Titik : ("+t.getAbsis() + "," + t.getOrdinat()+")") ;
	System.out.println("Titik : ("+t.getAbsis() + "," + op.RefleksiX(t)+")") ;
	System.out.println("Titik : ("+op.RefleksiY(t) + "," + t.getOrdinat()+")") ;
	System.out.println("Titik : ("+t.getOrdinat() + "," + t.getAbsis()+")") ;
	}
}