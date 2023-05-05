/** 
*	File : Sewa.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi main Sewa
*/

package com.oracle.training;

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}
