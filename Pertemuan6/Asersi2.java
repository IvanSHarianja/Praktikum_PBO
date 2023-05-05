/** 
*	File : Asersi2.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi mendemokan asersi yang input jari-jari tertolak
*/

 //class Lingkaran
 class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 4; //inisialisasi nilai jari-jari 
        assert (jariJari > 0):"jari-jari tidak boleh nol!!!"; //jika = 0 maka asersi akan dijalankan
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

/* PERTANYAAN : 
 * secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
 * 
 * JAWABAN: 
 * program Asersi2 di atas tidak ada yang kurang tepat. Program tersebut menggunakan asersi untuk memastikan bahwa 
 * nilai jari-jari tidak boleh nol atau negatif sebelum dilakukan perhitungan keliling lingkaran. 
 * Jika nilai jari-jari sama dengan nol atau negatif, maka asersi akan dijalankan dan program akan berhenti dengan pesan kesalahan yang sesuai.
 * 
 * Pesan kesalahan yang lebih spesifik akan membantu pengguna program memahami dengan jelas apa yang salah dengan input yang diberikan. 
 * Sebagai contoh, pesan kesalahan yang lebih spesifik dapat berupa "Nilai jari-jari tidak boleh nol atau negatif" atau "Jari-jari harus 
 * lebih besar dari nol"
*/



