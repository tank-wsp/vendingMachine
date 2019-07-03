
public static Slot[][]newSodaArray() {
	Slot[][]slotArray=new Slot[4][20];
	
	for (int i=0; i<slotArray.length; i++;) {
		for(int j=0; j<slotArray[i].length; j++;) {
			slotArray[i][j]=new Slot;
		}
	}
}
	