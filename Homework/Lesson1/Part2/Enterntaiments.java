public class Entertainment { 
	private String type;//Like team sport, individual events, group events 
	private String environment; //Home, stadium, park, cinema
	private int attendees; //How many people
	private int ticketPrice; //Ticket price or bet
	private int bottomAgeLimit; //Any limitations by age (bottom, like 18+)
	private int topAgeLimit; //Any limitations by age (top)
	private boolean equipment; //Ball, cards, bikes, special stuff etc.
	private int dangerLevel; //How dangerous it is. Cards are not so dangerous as bike is
	private String winningTangible; // Some stuff that can got win like trophy, cup etc. 
	private int winningAmount; // Some money
	private int roundsAmount; // Some rounds or turns, tries etc.	

private start() ; //start event 
public setEquipment(String newEquipment){equipment=newEquipment;} //What equipment is required
private getEquipment() {return equipment;} //to know what equipment is
public setBottomAgeLimit(int newBottomAgeLimit){bottomAgeLimit=newBottomAgeLimit;} //Set bottom age
public setTopAgeLimit(int newTopAgeLimit){topAgeLimit=newTopAgeLimit;} //Set top age
private int getDangerLevel() {return dangerLevel;} //to know how dangerous it is
public setAttendees(int newAttendees){attendees=newAttendees;} //Invite attendees
public setEnvironment(String newEnvironment){environment=newEnvironment;} //Where the event takes place
public int setWinningAmount(int newWinningAmount){winningAmount=newWinningAmount;} //Set winning amount 
private getWinningAmount() {return winningAmount;} //To know what winning amount we have

}