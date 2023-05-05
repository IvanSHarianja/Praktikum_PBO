/** 
*	File : Asersi1.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi menampilkan asersi
*/

public class Asersi1 {
    public static void main(String[] args){
        int x = 0; //inisialisai nilai x
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x < 0) : "ada kesalahan kode"; //mengeluarkan output jika tidak memenuhi if
            System.out.println("x bilangan negatif");
        }
    }
}