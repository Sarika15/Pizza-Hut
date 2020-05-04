package com.pizza.dao;

import java.util.List;

import com.pizza.bean.Pizza;


public interface PizzaDAO {
	public void addPizza();
	public Pizza viewPizzaType(int pid);
	public List<Pizza> viewAllPizza();
	public void updatePizzaDetails(int pid);
	public void deletePizza(int pid);
	public void checkOut();
	public void back();

}
