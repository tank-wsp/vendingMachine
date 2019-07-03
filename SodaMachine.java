
public class SodaMachine {
private String brand;
private int money;
private String message;
private Slot[][]sodaArray;

/** Constructs the SodaMachine object*/
SodaMachine(){
	
}

/**Constructs the SodaMachine object*/
SodaMachine(String newBrand, int newMoney, String newMessage,Slot newSodaArray){
	brand= newBrand;
	money=newMoney;
	message=newMessage;
	sodaArray=newSodaArray;
	

}
/**Returns the brand name of the soda*/
public String getBrand() {
	return brand;
}

/**Returns the amount of money put in the machine*/
public int getMoney() {
	return money;
}

/**Returns the message appropriate to the users slection*/
public String getMessage() {
	retrun message;
}

/**Returns the sodayArray to store the sodas*/
public Slot getsodaArray() {
	return sodaArray;
}


}



	


