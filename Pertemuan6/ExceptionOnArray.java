/** 
*	File : ExceptionOnArray.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi penggunaan eksepsi menggunakan class library Java
*/



 import java.io.IOException;

 public class ExceptionOnArray {
     public static void main(String[] args){
        //instanisiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            //arrayInteger[4] = 10;
            throw new IOException();
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }catch(IOException exception){
            System.out.println("IOException caught");
        }finally{
            System.out.println("clean up code...");
        }
     }
 }


//modul ver.

/* 
 public class ExceptionOnArray{
    public static void main(String[] args){
        //intanisasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{ //blok try yang digunakan untuk menangkap kesalahan
            //statement yg memungkinkan terjadinya kesalahan
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        //fungsi catch untuk menangkap kesalahan ArrayIndexOutOfBoundsException
        //dan apa yang harus dilakukan saat terjadi kesalahan
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        //finally untuk mengeksekusi kode yang selalu dijalankan
        finally{
            System.out.println("clean up code...");
        }
    }
}

*/