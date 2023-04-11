package Class_01_01_23_Inheritance;

public class Song  {

	/* Access modifier is a keyword, it controls what other entities inside our program 
	 * can access. 
	 * 1. private: accessible only with in the class. 
	  2. default: accessible  with in the same package 
	  3. protected: accessible  in the same package; 
	  accessible in all packages w/ "extend" E.g. other package extend package1{
	  4. public: accessible  in all packages*/
	
	private static int songsCount = 0;
	

    private String title;
    private String artist;
    private int length;
    
	public Song(String artist, String title, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
		songsCount++;
		System.out.println("Song count: " + songsCount);
		
	}
	
	
	public void  setTitle(String title) {
		this.title = title;
		
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
		
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setLength(int length) {
		this.length = length;
		
	}
	
	public int getLength() {
		return this.length;
	}
}
