package class_02_02_23_Polymorphism;

public class PersonDemo {

	public static void main(String[] args) {
		Person person1 = new English();
		Person person2 = new Germen();
		Person person3 = new French();
        person1.greet();
        person2.greet();
        person3.greet();
	}

}

