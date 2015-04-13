public class Goods { 
	private String countryOrigin;
	private int weight; 
	private int quantity;
	private String color; 
	private String shape; //
	private int expirationDate;
	private int purchaseDate; //
	/*
	private boolean isEdibility; //Can we eat that or need to wait
	private boolean isNonFood; //Can we eat that at all
	private boolean isToxic; //Is it toxic
	*/
	private int price; //Price per item
	private int storageTemperature; // Required storage temperature
	/*
	private String taste; // 
	*/
	private look; //Is it looks good to buy it
	private int quantity; //How many items remain OR
	/*
	private boolean isAvailable; //Is it available in the market right now
	*/

public putBasket ();
public moveTrash ();
private int getWeight() {return Weight;} // 
private int getExpirationDate() {return expirationDate;} // 
private int getStorageTemperature() {return storageTemperature;} // 
private int getCountryOrigin() {return countryOrigin;} // 
public setQuantity(String newQuantity) {quantity=newQuantity}; //set new quantity
public getQuantity() {return quantity}; //Get quantity
public getPrice() {return price}; //Get price
public setPrice(String newPrice) {price=newPrice}; //Set price

}