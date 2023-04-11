package Class_01_16_23ClassAndObject;

public class DemoPhone {

	public static void main(String[] args) {
		
	Phone phone1 = new Phone();
	phone1.brand = "iPhone";
	phone1.model = "14";
	phone1.color = "Black";
	System.out.println("Phone 1 - brand: " + phone1.brand + ", model: " +
			phone1.model + "color: " + phone1.color);
			

	Phone phone2 = new Phone();
	phone2.brand = "Samsung";
	phone2.model = "S22";
	phone2.color = "White";
	
	System.out.println("Phone 2 - brand: " + phone2.brand + ", model: " +
			phone2.model + "color: " + phone2.color);
	Phone phone3 = new Phone();
	phone3.brand = "Nokia";
	phone3.model = "G400";
	phone3.color = "Silver";
	System.out.println("Phone 3 - brand: " + phone3.brand + ", model: " +
			phone3.model + "color: " + phone3.color);
	
	
	
	}

}
