public class Devices { 
	private int weight; 
	private int height;
	private int depth;
	private int width;	
	private String color; 
	private String system; //Andriod, iOS
	private String systemVersion;
	private String displayType; //like Retina etc.
	private int batteryCapacity; //
	private float screenResolution ;
	private int angleViewing; //degrees
	private float int amountOfCores; //
	private String defaultMode; //landscape, portrait
	private int chargeLevel;
	private String state; // turned off, locked/unlocked
	/*private boolean isLocked;
	private boolean isTurnedOff;*/
	private boolean isOperability; //does it work at all, not broken
	private date(???) purchaseDate; //Date, what data type should we use for it
	private String chargeInterface; //What charge should we use, like mini-USB or iPhone ones
	private int warranty; //Month of warranty
	private int freeSpace; //Free space on device		
	private boolean isMediaAvailable; //Is there any media file there
	private int soundLevel;	//Sound level on the device right now
	public String location; //Where device is located right now
	private String mediaFile; //Media file name

private touch();
private swipe();
private tap();
private charge() ; //to charge
private int getCharge() {return change;} //to know charge level
public getManufacturer() {return manufacturer;}  //to know manufacturer
private getSystemVersion(){return systemVersion;} //to know system version
public float getScreenResolution() {return screenResolution;} //screen resolution
private setState(String newState) {state=newState}; //set new state (turned off, locked/unlocked)
public int getSoundLevel() {return soundLevel;} //sound Level
private setSoundLevel(String newSoundLevel) {soundLevel=newSoundLevel}; //set Sound Level
public setLocation(String newLocation){location=newLocation;} //where is a device now
public setSystemVersion(String newSystemVersion){systemVersion=newSystemVersion;} //upgrade system version
public setMediaFile (int newMediaFile) {mediaFile= newMediaFile;} //download new file
}
