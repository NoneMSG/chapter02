package chapter_02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		
		song.setArtist("IU");
		song.setalbum("Real");
		song.setTitle("좋은날");
		song.setComposer("이민수");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
	}

}
