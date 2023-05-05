/** 
*	File : Vehicle.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi menghitung calRent dari Vehicle
*/

package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
