package Class_12_8ConditionStatments;

public class Browser_Task {

	public static void main(String[] args) {
		/*
		 * Write a program that lets user select the browser of their choice using Switch statement
If user selects Chrome -> show “Chrome is the most popular browser”
If user selects Firefox -> show “Firefox is the second most popular browser”
If user selects Edge -> show “Mostly used by Federal employees”
Else “use safari browser”
		 */
    String browser = "Chrome";
    
		switch (browser){
		case "Chrome":
			System.out.println("Chrome is the most popular browser");
			break;
		case "Firefox":
			System.out.println("Firefox is the second most popular browser");
		    break;
		case "Edge":
			System.out.println("Most used by Fedral employees ");
			break;
		case "Safari":
			System.out.println("Appl's favorites");
			break;
			default:
				System.out.println("Invalid Browser");
				break;
		
		
    
    }
	}

}
