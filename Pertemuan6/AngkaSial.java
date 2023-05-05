/** 
*	File : AngkaSial.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
*/

 public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }else{
            System.out.println(angka+" bukan angka sial"); //jika eksepsi terjadi line kode ini tidak di eksekusi
        }
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(17);
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
    }catch (AngkaSialException ase){ //jika eksekusi terjadi line kode ini dieksekusi
        //method getMessage() telah ada pada kelas "Exception"
        System.out.println(ase.getMessage());
        System.out.println("hati-hati dengan memasukkan angka ");
    }
}
}


/*  
1.  Pertanyaan : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    Jawab :
*	Ketika sebuah eksepsi terjadi pada program dan dilemparkan, maka program akan berhenti dan eksepsi tersebut akan ditangkap 
*	oleh blok catch dengan mengeluarkan pesan sesuai dengan yang telah didefinisikan pada program. Pada program yang diberikan, 
*	setelah eksepsi AngkaSialException ditangkap oleh blok catch, program akan melaksanakan method .getMessage() untuk mengambil 
*	pesan yang telah didefinisikan pada eksepsi tersebut. Kemudian, program akan mengeluarkan pesan output "hati-hati memasukkan angka!!!" 
*	sesuai dengan yang telah didefinisikan pada blok catch tersebut. Dalam kondisi ini, baris ke-12 dari program tidak akan dieksekusi 
*	karena program telah berhenti saat eksepsi terjadi dan program hanya akan melaksanakan baris kode yang ada pada blok catch tersebut.
	
2.  Pertanyaan :
    Apakah baris 21 pada angkaSial.java di atas dieksekusi?
    Jawab :
*	Pada program yang diberikan, baris ke-21 akan dieksekusi apabila eksepsi terjadi. Hal ini dikarenakan saat metode cobaAngka(13) 
*	melempar eksepsi AngkaSialException, maka program akan mengalihkan eksekusi ke blok catch yang menangani eksepsi tersebut. 
*	Sisa pernyataan dalam blok try setelah pernyataan yang melempar eksepsi tidak akan dieksekusi karena program akan langsung beralih ke blok catch.

*	Namun, perintah as.cobaAngka(12) tidak akan dieksekusi karena jika eksepsi terjadi, program akan langsung diterminasi.
*/