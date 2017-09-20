package com.imag.ecom.api;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.imag.ecom.categorie.Categorie;
import com.imag.ecom.categorie.CategoryType;
import com.imag.ecom.categorie.Repository;
import com.imag.ecom.produit.boisson.Boisson;
import com.imag.ecom.produit.dessert.Dessert;
import com.imag.ecom.produit.pizza.Pizza;

@Path("/dataservice")
@RequestScoped
public class DataService {

	@Inject
	private Repository categoryRp;
	@Inject
	private com.imag.ecom.produit.pizza.Repository pizzaRp;
	@Inject
	private com.imag.ecom.produit.boisson.Repository boissonRp;
	@Inject
	private com.imag.ecom.produit.dessert.Repository dessertRp;

	@GET
	@Path("/initialize")
	public String initialize() {
		// **************************
		// Création de categories***
		// **************************
		Categorie c1 = new Categorie("Base Tomate", CategoryType.PIZZA);
		Categorie c2 = new Categorie("Base creme", CategoryType.PIZZA);
		// *******************************************************************
		Categorie c3 = new Categorie("Sans Alcool", CategoryType.BOISSON);
		Categorie c4 = new Categorie("Alcoolisee", CategoryType.BOISSON);
		Categorie c5 = new Categorie("Eau", CategoryType.BOISSON);
		// ******************************************************************
		Categorie c6 = new Categorie("Desserts a partager", CategoryType.DESSERT);
		Categorie c7 = new Categorie("Desserts individuls", CategoryType.DESSERT);
		categoryRp.add(c1);
		categoryRp.add(c2);
		categoryRp.add(c3);
		categoryRp.add(c4);
		categoryRp.add(c5);
		categoryRp.add(c6);
		categoryRp.add(c7);

		// ***************************
		// Création des Pizzas*********
		// ***************************

		Pizza p11 = new Pizza(c1, "Margherita", "sauce tomate à l'Origan et double mozzarella fraîche.", 5.99,
				"https://cdn-catalog.pizzahut.fr/images/fr/20170803105256092.jpg");
		Pizza p21 = new Pizza(c1, "Merguez", "Sauce tomate à l'Origan, Mozzarella et Merguez.", 6.99,
				"https://cdn-catalog.pizzahut.fr/images/fr/20170803111857372.jpg");
		Pizza p31 = new Pizza(c1, "Jambom-Fromage", "Sauce tomate à l'Origan, Mozzarella et Jambon.", 6.99,
				"https://cdn-catalog.pizzahut.fr/images/fr/20170803102147922.jpg");
		Pizza p41 = new Pizza(c1, "Queen",
				"Sauce tomate à l'Origan, mozzarella fraîche, jambon et double champignons de Paris - Champignons frais.",
				5.99, "https://cdn-catalog.pizzahut.fr/images/fr/20141201165922296.jpg");
		Pizza p12 = new Pizza(c2, "Chèvre Miel", "Crème fraîche légère, mozzarella fraîche, fromage de chèvre et miel.",
				6.99, "https://cdn-catalog.pizzahut.fr/images/fr/20141201164819376.jpg");
		Pizza p22 = new Pizza(c2, "Nordique",
				"Crème fraîche légère, mozzarella fraîche, saumon de Norvège et sauce à l'aneth et au citron.", 5.99,
				"https://cdn-catalog.pizzahut.fr/images/fr/20141201165704138.jpg");
		Pizza p32 = new Pizza(c2, "Campagnarde",
				"Crème fraîche légère, mozzarella fraîche, double lardons, oignons frais et champignons frais.", 5.99,
				"https://cdn-catalog.pizzahut.fr/images/fr/20141201164635317.jpg");
		Pizza p42 = new Pizza(c2, "Raclette",
				"Crème fraiche légère, mozzarella fraîche, pommes de terre, lardons et fromage à raclette.", 5.99,
				"https://cdn-catalog.pizzahut.fr/images/fr/20150206170908765.jpg");
		pizzaRp.add(p11);
		pizzaRp.add(p21);
		pizzaRp.add(p31);
		pizzaRp.add(p41);
		pizzaRp.add(p12);
		pizzaRp.add(p22);
		pizzaRp.add(p32);
		pizzaRp.add(p42);
		// ********************************
		// Création des boissons***********
		// ********************************

		Boisson b13 = new Boisson("Coca Cola", 1.5, "https://cdn-catalog.pizzahut.fr/images/fr/20150223172011404.png",
				c3, 0.33);
		Boisson b23 = new Boisson("Coca Cola Zero", 1.5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20150223173012706.png", c3, 0.33);
		Boisson b33 = new Boisson("Oasis Tropical", 1.5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20150223173855094.png", c3, 0.33);

		Boisson b43 = new Boisson("Coca Cola", 2.5, "https://cdn-catalog.pizzahut.fr/images/fr/20150223172011404.png",
				c3, 1.5);
		Boisson b53 = new Boisson("Coca Cola Zero", 2.5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20150223173012706.png", c3, 1.5);
		Boisson b63 = new Boisson("Oasis Tropical", 2.5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20150223173855094.png", c3, 1.5);

		Boisson b14 = new Boisson("Bière Heineken", 2,
				"https://cdn-catalog.pizzahut.fr/images/fr/20141202145944507.png", c4, 0.33);
		Boisson b24 = new Boisson("Rosé Côtes de Provence AOP Les Bastides de Sainte Marie", 9,
				"https://cdn-catalog.pizzahut.fr/images/fr/20150319110242018.jpg", c4, 0.75);

		Boisson b15 = new Boisson("San Pellegrino", 2,
				"https://cdn-catalog.pizzahut.fr/images/fr/20151124105634150.png", c5, 1);
		Boisson b25 = new Boisson("San Pellegrino", 1,
				"https://cdn-catalog.pizzahut.fr/images/fr/20151124104450950.png", c5, 0.50);

		boissonRp.add(b13);
		boissonRp.add(b23);
		boissonRp.add(b33);
		boissonRp.add(b43);
		boissonRp.add(b53);
		boissonRp.add(b63);
		boissonRp.add(b14);
		boissonRp.add(b24);
		boissonRp.add(b15);
		boissonRp.add(b25);

		// ********************************
		// Création des desserts***********
		// ********************************

		Dessert d16 = new Dessert("Häagen Dazs Salted Caramel", 5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20170502155405035.jpg", c6, "Sucré", 0.5);
		Dessert d26 = new Dessert("Häagen Dazs Vanilla Pecan", 5.5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20160513162251301.jpg", c6, "Sucré", 0.5);

		Dessert d17 = new Dessert("Breadsticks Nutella", 5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20170317151535389.jpg", c7, "Sucré", 6);
		Dessert d27 = new Dessert("4 Mini Beignets au Nutella", 3.5,
				"https://cdn-catalog.pizzahut.fr/images/fr/20161007170256836.jpg", c7, "Sucré", 4);

		dessertRp.add(d16);
		dessertRp.add(d26);
		dessertRp.add(d17);
		dessertRp.add(d27);
		return "Succès";
	}
}