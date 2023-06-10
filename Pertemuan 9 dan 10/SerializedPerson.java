import java.io.*;

/*
	Nama  File	: SerializedPerson.java
	Pembuat		: Ivan S Harianja
	NIM			: 24060121120007
	Tanggal		: 10 Juni 2023
	Deskripsi	: Program untuk serialisasi objek Person
*/

class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}