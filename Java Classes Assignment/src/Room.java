//Q6
public class Room {

	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	void setData(int rno, String rt, float area, boolean ac) {
	roomNo = rno;
	roomType = rt;
	roomArea = area;
	acMachine = ac;
	}
	void displayData() {
	System.out.println("The room number is " + roomNo);
	System.out.println("The room Type is " + roomType);
	System.out.println("The room area is " + roomArea);
	String s = (acMachine) ? "yes" : "no";
	System.out.println("The Ac Machine needed " + s);
	}
	
	public static void main(String[] args) {
		Room room1 = new Room();
		room1.setData(101, "Deluxe", 240, true);
		room1.displayData();

	}

}
