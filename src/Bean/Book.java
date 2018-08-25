package Bean;

public class Book extends MediaItem {
	
	private String author;
	private String owner;	
	public void Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String id, String title, double price, String year,String author) {
		super(id, title, price, year);
		this.author = author;	
	}




	@Override
	public String toString() {
		return "\nBook [author=" + author + ", Id=" + getId() + ", Title=" + getTitle() + ", Price="
				+ getPrice() + ", Year=" + getYear() + "]\n";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void setOwner(String owner, MediaItem m3) {
		if(m3 instanceof Book)
		{
			author = owner;
		}
		
	}

	
	
	
	
}
