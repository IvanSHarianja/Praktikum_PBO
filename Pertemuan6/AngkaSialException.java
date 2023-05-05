/** 
*	File : AngkaSialException.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi eksepsi terbuat sendiri yang menolak masukan angka 13
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
