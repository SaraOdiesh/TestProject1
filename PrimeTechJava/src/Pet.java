
public class Pet {

	
	    private String name;
	    private String color;

	    public Pet(String name, String color) {
	        this.name = name;
	        this.color = color;
	    }

	    public void play() {
	        System.out.println(name + " is playing!");
	    }

	    public void speak() {
	        System.out.println(name + " is making noise!");
	    }

	    public String getName() {
	        return name;
	    }

	    public String getColor() {
	        return color;
	    }
	}

