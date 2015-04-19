public class MonitorPc extends Device {
        
    // the MonitorPc subclass has
    // next additional fields
    public int anlgleGround; //angle respectively to the ground
	public int amountOfUsb; //
	public boolean isMonoBlock; //To know how it is designed, as mono block or not
		

    // the MonitorPc subclass has
    // next additional methods
public boolean setIsMonoBlock(boolean newIsMonoBlock) {isMonoBlock = newIsMonoBlock;} 
public int setAnlgleGround(int newAnlgleGround) {anlgleGround = newAnlgleGround;}	

}