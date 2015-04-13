public class Furniture { 
	private String type;//Like exterior or interior
	private String fabric; //An origin material the furniture is made of
	private String manufacturer; //Manufacturer who made this furniture
	private int weight; 
	private int height;
	private int depth;
	private int price;
	private int movability; // Like 1 for unmovable, 2 for things that can get moved easily
	private String purpose; //Bedroom, kitchen etc.
	private String color; //
	private int legs;
	private int cells;
	private boolean isBroken;
	public boolean isManual;

public putOn() ; //put smth on it
private putInside() ; //put smth into it
public clean() ; //to clean
public getType() {return type;} //to know what furniture is for
public getFabric() {return fabric;} //to know origin material
public getManufacturer() {return manufacturer;} //to know manufacturer
public lift() ; //Lift by some value
public fix() ; //Fix if broken
public openCell(); //open a cell
public construct();//Put all the details together
