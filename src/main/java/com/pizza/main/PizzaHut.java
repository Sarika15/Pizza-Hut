package com.pizza.main;

import java.util.Scanner;

import com.pizza.menus.PizzaDetails;

public class PizzaHut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("---------------------------------------");
		System.out.println("|          Pizza Hut Main Menu        |");
		System.out.println("---------------------------------------");
		System.out.println("|          1. Chief                   |");
		System.out.println("|          2. Customer                |");
		System.out.println("|          3. Exit                    |");
		System.out.println("---------------------------------------");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: PizzaDetails.chiefMainMenu();
		        break;
		case 2: PizzaDetails.customerMainMenu();
		        break;
		case 3: System.exit(0);
		}

	}
	}
		

}
