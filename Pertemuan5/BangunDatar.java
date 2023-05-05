/** 
*	File : BangunDatar.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi abstrak dari bangun datar
*/

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    protected void setLuas(double Luas){
        this.luas = Luas;
    }

    public double getLuas() {
        return luas;
    }
}