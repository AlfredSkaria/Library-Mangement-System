package Bean;

public class Audio extends MediaItem {
	private String artist;
	private String owner;	

	public Audio(String id, String title, double price, String year,String artist) {
		super(id, title, price, year);
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "\nAudio [artist=" + artist + ", Id=" + getId() + ", Title=" + getTitle() + ", Price="
				+ getPrice() + ", Year=" + getYear() + "]\n";
	}

	
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void setOwner(String owner, MediaItem m3) {
		if(m3 instanceof Audio)
		{
			artist = owner;
		}
		
	}
	
	
}
