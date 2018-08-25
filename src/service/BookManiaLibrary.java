package service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import Bean.Audio;
import Bean.Book;
import Bean.MediaItem;

public class BookManiaLibrary implements Library{
	Scanner sc  = new Scanner(System.in);
	private static String id;
	private double price;
	private String year;
	private String title;
	private int unique = 1;
	private Book b1;
	private String author,artist;
	private static ArrayList<MediaItem> myList = new ArrayList<MediaItem>();
	
	public BookManiaLibrary(Book b1,Audio a1) {
		
	}

	@Override
	public void addItem(MediaItem item) {
		myList.add(item);	
	}

	@Override
	public MediaItem searchItemById(String id) {
		
	    for(MediaItem m : myList){
	        if(m.getId() != null && m.getId().equals(id))
	        {
	        	return m;
	        } 
	           
	    }
		return null;
	}

	@Override
	public ArrayList<MediaItem> getItems() {
		return myList;
	}

	@Override
	public boolean deleteItem(String id) {
	    for(MediaItem m : myList){
	        if(m.getId() != null && m.getId().contains(id))
	        {
	        	myList.remove(m);
	        }
	           
	    }
		return false;
	}

	@Override
	public MediaItem updateItem(MediaItem m3,String id) {
		int choice;
		this.id = id;
		System.out.println("Book/Audio: (1/0)??");
		choice = sc.nextInt();
		System.out.println("Enter the title");	
		title = sc.next();
		System.out.println("Enter the price");
		price = sc.nextDouble();
		System.out.println("Enter the year");
		year = sc.next();
		m3.setId(id);
		m3.setPrice(price);
		m3.setTitle(title);
		m3.setYear(year);
		
			if(choice==1)
			{
				System.out.println("Enter the name of author");
				author = sc.next();
				m3.setOwner(author, m3);
			}
			else
			{
				System.out.println("Enter the name of artist");
				artist = sc.next();
				m3.setOwner(artist, m3);
			}
		return null;
	}



}
