package service;

import java.util.ArrayList;

import Bean.MediaItem;
import exceptions.ItemException;

public interface Library {
	public void addItem(MediaItem item);
	public MediaItem searchItemById(String id) throws ItemException;
	public ArrayList<MediaItem> getItems();
	public MediaItem updateItem(MediaItem m3,String id) throws ItemException;
	public boolean deleteItem(String id) throws ItemException;
	

}
