package monday;


public class DoingMagic {

	public static void main(String[] args) {
		//System.out.println(Songs.helloSong.length());
		//System.out.println(longestSong(Songs.burningDownTheHouseSong, Songs.helloSong, Songs.burningDownTheHouseSong));
		System.out.println(countWords(Songs.helloSong, "hello"));
		System.out.println(countWords(Songs.burningDownTheHouseSong, "house"));
		System.out.println(numberOfWords(Songs.westEndGirlsSong));
	}
	
	
	public static int numberOfWords(String song) {
		song.replaceAll("\n", " ");
		song.replaceAll("  ", " ");
		
		return countWords(song, " ") + 1;
	}
	
	
	
	public static int countWords(String song, String word) {
		song = song.toLowerCase();
		word = word.toLowerCase();
		
		int count = 0;
		int startingPoint = 0;
		while ( song.indexOf(word, startingPoint) > -1) {
			count++;
			startingPoint = word.length() + song.indexOf(word, startingPoint);
		}
		return count;
	}
	
	
	
	
	public static String longestSong(String a, String b, String c) {
		if( a.length() > b.length() ) {
			if (a.length() > c.length() ) {
				return a;
			} else {
				return c;
			}
		} else { // b is longer than a...
			if ( b.length() > c.length()) {
				return b;
			} else {
				return c;
			}
		}

	}
	
	

}
