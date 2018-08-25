package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Bean.Audio;
import Bean.Book;
import Bean.MediaItem;
import service.BookManiaLibrary;
import service.Library;


public class Client {
	
	private static String id;
	private static double price;
	private static String year;
	private static String title;
	private static int unique = 1;
	private static String artist;
	private static String author;
	

	public static void main(String[] args) {
		int ch,choice;
		boolean flag = false;
		Scanner sc  = new Scanner(System.in);
		Book b1 = new Book(null, null, 499.0, null, null);
		Audio a1 = new Audio(null, null, 999.0, null, null);
		BookManiaLibrary bm1 = new BookManiaLibrary(b1, a1);
		do{
			System.out.println("Menu\n1.Insert Details\n2.Search item by id\n3.Update item\n4.Display Items\n5.Delete Item\n6.Exit\nEnter your choice");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:	
					flag = false;
					id = "#"+(unique++);
					System.out.println("id: "+id);
							System.out.println("Book/Audio: (1/0)??");
							choice = sc.nextInt();
							System.out.println("Enter the title");	
							title = sc.next();
							System.out.println("Enter the price");
							price = sc.nextDouble();
							System.out.println("Enter the year");
							year = sc.next();
							
								if(choice==1)
								{
									System.out.println("Enter the name of author");
									author = sc.next();
									MediaItem m1 = new Book(id,title,price,year,author);
									bm1.addItem(m1);
								}
								else
								{
									System.out.println("Enter the name of artist");
									artist = sc.next();
									MediaItem m1 = new Audio(id,title,price,year,artist);
									bm1.addItem(m1);
								}
					break;
				case 2:
					System.out.println("Enter the item id to search for?");
					id = sc.next();
					MediaItem m2 = bm1.searchItemById(id);
					if(m2!=null)
					{
						System.out.println("Item Found !!!\n"+m2);
					}
					else
					{
						System.out.println("Item not found !!");
					}
					break;
				case 3:
					System.out.println("Enter the ID to be updated");
					id = sc.next();
					MediaItem m3 = bm1.searchItemById(id);
					if(m3!=null)
					{
						//System.out.println("Item Found !!!\n"+m2);
						bm1.updateItem(m3,id);
					}
					else
					{
						System.out.println("Item not found !!");
					}
					break;
				case 4:
					System.out.println(bm1.getItems());
					break;
				case 5:
					System.out.println("Enter the item id to be deleted?");
					id = sc.next();
					bm1.deleteItem(id);
					break;
				case 6:
					break;
				default:
					System.out.println("Invalid choice!!!");
					
			}
		}while(ch<6);
	}




}
