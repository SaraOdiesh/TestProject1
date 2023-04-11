package Class_12_8ConditionStatments;

public class Switch_CharDataType {

	public static void main(String[] args) {
		
    char letter= 'k';
    switch (letter) {
    case 'A', 'B' ,'C', 'D', 'E':
    System.out.println("Found");
    break;
    default:
    	System.out.println("Not Found");
    	break;
    }
    
	}

}
