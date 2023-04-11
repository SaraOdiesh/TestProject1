package Class_01_01_23_Inheritance;

public class Demo {

	public static void main(String[] args) {
		Song holiday= new Song("Holiday", "Green Day", 200);
		Song americanIdiot = new Song ("Holiday", "Green Day", 168);
		
		
		System.out.println("Holiday name: " + holiday.getArtist());
		System.out.println("Title: " + holiday.getTitle());

	}

}
