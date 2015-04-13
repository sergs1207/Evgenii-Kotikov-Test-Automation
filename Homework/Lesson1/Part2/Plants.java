public class Plants { 
	private String trunkColor;//
	private String fertilizer; //What does plant 'eat'
	private int height;
	private int width;
	private int trunkThickness; //Thickness of the trunk
	private int branches; //branches amount
	private String leavesType; //
	private string leavesColor;	//
	private int rootType; //
	private boolean isFruit;//
	/*private string fruitLocation;
	private int fruitAmount;*/

//<!--start constructor-->	
public Plant (int startHeight, int startWidth, int startTrunkThickness){
	height=startHeight;
	width=startWidth;
	trunkThickness=startTrunkThickness;
}
public void setHeight(int newValue){height=newValue}
public void setWidth(int newValue){width=newValue}
public void setTrunkThickness (int newValue){trunkThickness=newValue}
//<!--end constructor-->

//below 
public rootType() ; //put smth on it
private leavesType() ; //put smth into it
public setFertilezer (String newFertilizer) {fertilizer=newFertilizer} // Like 'food' for a plant
public harvest();
public getHight() {return hight;} //
public getWidth() {return width;} //
public getTrunkThickness() {return trunkThickness;} //
/*public boolean getIsFruit //???????How to do it right way?