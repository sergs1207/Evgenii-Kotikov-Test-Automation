public class Tablet extends Devices {
        
    // the Tablet subclass has
    // next additional fields
    public boolean isPhoneOption; //Is additional phone module installed
	public boolean isStylus; //Is stylus available
	public int minScreenResolution; //To decide whether it is Tablet
	private float cameraResolution; //in Mega pixels
	private float cameraFrontalResolution; //in Mega pixels, if no such then null
	

    // the Tablet subclass has
    // next additional methods
public boolean setIsPhoneOption(boolean newIsPhoneOption) {isPhoneOption = newIsPhoneOption;} 
public float setMinScreenResolution(float newMinScreenResolution) {minScreenResolution = newMinScreenResolution;}	

}