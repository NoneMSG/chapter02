package chapter_02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song("IU","GoodDay","Real","LMS",3,2010);
		
//		song.setArtist("IU");
//		song.setalbum("Real");
//		song.setTitle("좋은날");
//		song.setComposer("이민수");
//		song.setTrack(3);
//		song.setYear(2010);
		
		song.show();
		
		Song song2 = new Song("She's Baby", "지코"); 
		song2.show();
		Song song3 = new Song("얼굴찌푸리지말아요", "하이라이트");
		song3.show();
	}

}
