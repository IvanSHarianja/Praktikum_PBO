import java.util.ArrayList;

/*
	Nama  File	: LamdaList.java
	Pembuat		: Ivan S Harianja
	NIM			: 24060121120007
	Tanggal		: 10 Juni 2023
	Deskripsi	: Implementasi lambda pada List, digunakan sebagai parameter pada method
*/

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}