public class Smartphone extends Devices {
        
    // the Smartphone subclass has
    // next additional fields
    private String cellOperator; //MTS, Kyivstar etc.
	private String typeOfSim; // micro, mini, nano
	private int amountOfSim; // 1x, 2x, 3x...
	private float cameraResolution; //in Mega pixels
	private float cameraFrontalResolution; //in Mega pixels, if no such then null
	
    // the Smartphone subclass has
    // next additional methods
private phone() ; //phone to smb
private acceptCall() ; //accept incoming call
public String setCellOperator(String newCellOperator) {cellOperator = newCellOperator;}   
public int getCellOperator() {return cellOperator;} //
public int getAmountOfSim() {return amountOfSim;} //

}