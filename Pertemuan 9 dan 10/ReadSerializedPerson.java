import java.io.*;

/*
	Nama  File	: ReadSerializedPerson.java
	Pembuat		: Ivan S Harianja
	NIM			: 24060121120007
	Tanggal		: 10 Juni 2023
	Deskripsi	: Program untuk membaca Serialized objek Person
*/


public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serial person name = "+person.getName());
        }
        catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}