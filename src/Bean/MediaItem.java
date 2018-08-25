package Bean;

public abstract class MediaItem {
	private String id;
	private String title;
	private double price;
	private String year;
	
	
	public MediaItem(String id, String title, double price, String year) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return "MediaItem [id=" + id + ", title=" + title + ", price=" + price + ", year=" + year + "]";
	}
	
	public abstract void setOwner(String owner, MediaItem m);



	public MediaItem(Book b1,Audio a1) {
		
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}



	
	
	
	
	

}
