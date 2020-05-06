package com.pizza.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pizza.bean.Pizza;
import com.pizza.main.PizzaHut;

public class PizzaDAOImp implements PizzaDAO {
	
	static List<Pizza> pizzaStock = new ArrayList<Pizza>();
	static List<Pizza> tempList = new ArrayList<Pizza>();
	Pizza pizza = null;
	Scanner sc = new Scanner(System.in);

	public void addPizza() {
		int i =1;
		while(i == 1) {
			pizza = new Pizza();
			System.out.println("Enter Pizza id");
			pizza.setPid(sc.nextInt());
			System.out.println("Enter Pizza Name");
			pizza.setPname(sc.next());
			System.out.println("Enter Pizza Size");
			pizza.setSize(sc.next());
			System.out.println("Enter Pizza Price");
			pizza.setPrice(sc.nextDouble());
			pizzaStock.add(pizza);
			System.out.println("Do you want to add more pizza types then press 1 else any number");
			i = sc.nextInt();
		}
		System.out.println("Successfully Pizza Details Added!");
	}

	public Pizza viewPizzaType(int pid) {
		pizza = new Pizza();
		for(Pizza p : pizzaStock) {
			if(p.getPid()==pid) {
				pizza = p;
				break;
			}
		}
		return pizza;
	}

	public List<Pizza> viewAllPizza() {
		
		return pizzaStock;
	}

	public void updatePizzaDetails(int pid) {
	   tempList = new ArrayList<Pizza>();
	   for(Pizza p1 : pizzaStock) {
		   if(p1.getPid()==pid) {
			   System.out.println("Select your choice to update the list: 1.Name  2. Size  3. Price");
			   int choice = sc.nextInt();
			   switch(choice) {
			   case 1: System.out.println("Enter Updated Pizza Name:");
			           p1.setPname(sc.next());
			           break;
			   case 2: System.out.println("Enter Updated Pizza Size:");
			           p1.setSize(sc.next());
			           break;
			   case 3: System.out.println("Enter Updated Pizza Price:");
			           p1.setPrice(sc.nextDouble());
			           break;
			   default: System.out.println("Please select any option between 1-3");
			   }
			   tempList.add(p1);
		   }else {
			   tempList.add(p1);
		   }
	   }
		pizzaStock = new ArrayList<Pizza>();
		for(Pizza p2 : tempList) {
			pizzaStock.add(p2);
		}
		System.out.println("Pizza details are updated succesfully");
	}

	public void deletePizza(int pid) {
		tempList = new ArrayList<Pizza>();
		   for(Pizza p1 : pizzaStock) {
			   if(p1.getPid()==pid) {
				   
			   }else {
				   tempList.add(p1);
			   }
		   }
			pizzaStock = new ArrayList<Pizza>();
			for(Pizza p2 : tempList) {
				pizzaStock.add(p2);
			}
			System.out.println("Pizza details are deleted succesfully");
		
	}

	public void checkOut() {
		tempList = new ArrayList<Pizza>();
		Pizza pizza = new Pizza();
		for(Pizza p4 : pizzaStock) {
			System.out.println(p4);
			}
		System.out.println("Enter Pizza ID of Pizza which you want:");
		pizza.setPid(sc.nextInt());
		System.out.println("Enter Quantity: ");
		pizza.setQant(sc.nextInt());
		for(Pizza p4 : pizzaStock) {
			if (p4.getPid()== pizza.getPid()) {
				System.out.println("------------------------------------------");
				System.out.println("|               Bill                     |");
				System.out.println("------------------------------------------");
				System.out.println("| Pizza ID       : " + p4.getPid());
				System.out.println("| Pizza Name     : " + p4.getPname());
				System.out.println("| Pizza Size     : " + p4.getSize());
				System.out.println("| Pizza Price    : " + p4.getPrice());
				System.out.println("| Pizza Qty      : " + pizza.getQant());
				System.out.println("------------------------------------------");
				System.out.println("| Total Amount   : "+ (pizza.getQant()*p4.getPrice()));
				System.out.println("------------------------------------------");
				tempList.add(p4);
				break;
			}else {
				tempList.add(p4);
			}
		}
		pizzaStock = new ArrayList<Pizza>();
		for(Pizza p4 : tempList) {
			pizzaStock.add(p4);
		}
		System.out.println("Thank you and visit once again!");
		
	}

	public void back() {
		PizzaHut.main(null);
		
	}

}
