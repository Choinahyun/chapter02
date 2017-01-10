package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song();
		
		song.setAlbum("real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은 날");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
		
		Song song2 = new Song ("첫눈처럼 너에게 가겠다", "에일리", null, null, 2017, 0);
		song2.show();
		
		Song song3 = new Song("Beautiful", "크러쉬");
		song3.show();
		
		Song song4 = new Song ("소원", "어반자카파");
		song4.show();
	
	}

}
