package com.pizza.menus;

import java.util.List;
import java.util.Scanner;

import com.pizza.bean.Pizza;
import com.pizza.dao.PizzaDAOImp;

public class PizzaDetails {
	static Scanner sc = new Scanner(System.in);
	static PizzaDAOImp pizzaDAO = new PizzaDAOImp();
	
	public static void chiefMainMenu() {
		System.out.println("---------------------------------------");
		System.out.println("|          Chief Main Menu            |");
		System.out.println("---------------------------------------");
		System.out.println("|          1. Add Pizza Details       |");
		System.out.println("|          2. View Pizza Details      |");
		System.out.println("|          3. View all pizza options  |");
		System.out.println("|          4. Update Pizza Details    |");
		System.out.println("|          5. Delete Pizza Details    |");
		System.out.println("|          6. Back                    |");
		System.out.println("---------------------------------------");
		System.out.println(" Enter your choice: ");
		switch(sc.nextInt()) {
		case 1: pizzaDAO.addPizza();
		        chiefMainMenu();
		        break;
		case 2: System.out.println("Enter Pizza ID: ");
		        Pizza pizza = pizzaDAO.viewPizzaType(sc.nextInt());
		        System.out.println("PID" + "\t" + " PNAME" + "\t" + "PSIZE" + "\t" + "PPRICE");
		        System.out.println("--------------------------------------------------------");
		        System.out.println(pizza);
		        chiefMainMenu();
		        break;
		case 3: List<Pizza> pizzaStock = pizzaDAO.viewAllPizza();
		        System.out.println("PID" + "\t" + " PNAME" + "\t" + "PSIZE" + "\t" + "PPRICE");
                System.out.println("--------------------------------------------------------");
                for(Pizza p3: pizzaStock) {
                	System.out.println(p3);
                }
                chiefMainMenu();
                break;
		case 4: System.out.println("Enter which Pizza details you have to update");
		        pizzaDAO.updatePizzaDetails(sc.nextInt());
		        chiefMainMenu();
                break;
		case 5: System.out.println("Enter which Pizza type you want to delete");
		        pizzaDAO.deletePizza(sc.nextInt());
		        chiefMainMenu();
                break;
		case 6: pizzaDAO.back();
		        break;
		default: System.out.println("Please select your choice between 1 to 6 only ");
		}
	}
	
	public static void customerMainMenu() {
		System.out.println("---------------------------------------");
		System.out.println("|          Customer Main Menu         |");
		System.out.println("---------------------------------------");
		System.out.println("|          1. View Pizza Details      |");
		System.out.println("|          2. View all pizza options  |");
		System.out.println("|          3. Check-Out               |");
		System.out.println("|          4. Back                    |");
		System.out.println("---------------------------------------");
		System.out.println(" Enter your choice: ");
		switch(sc.nextInt()) {
		case 1: System.out.println("Enter Pizza ID: ");
		        Pizza pizza = pizzaDAO.viewPizzaType(sc.nextInt());
		        System.out.println("PID" + "\t" + " PNAME" + "\t" + "PSIZE" + "\t" + "PPRICE");
		        System.out.println("--------------------------------------------------------");
		        System.out.println(pizza);
		        customerMainMenu();
		        break;
		case 2: List<Pizza> pizzaStock = pizzaDAO.viewAllPizza();
		        System.out.println("PID" + "\t" + " PNAME" + "\t" + "PSIZE" + "\t" + "PPRICE");
                System.out.println("--------------------------------------------------------");
                for(Pizza p3: pizzaStock) {
                	System.out.println(p3);
                }
                customerMainMenu();
                break;
		case 3: pizzaDAO.checkOut();
		        customerMainMenu();
                break;
		case 4: pizzaDAO.back();
		        break;
		default: System.out.println("Please select your choice between 1 to 4 only ");
		}
	}
		
	

}
