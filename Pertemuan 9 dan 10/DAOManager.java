/*
	Nama  File	: DAOManager.java
	Pembuat		: Ivan S Harianja
	NIM			: 24060121120007
	Tanggal		: 10 Juni 2023
	Deskripsi	: Pengelolaan DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}