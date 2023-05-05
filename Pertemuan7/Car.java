/** 
*	File : Car.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi mencari calRent pada Car
*/

package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

