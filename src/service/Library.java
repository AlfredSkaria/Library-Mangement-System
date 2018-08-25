package service;

import java.util.ArrayList;

import Bean.MediaItem;

public interface Library {
	public void addItem(MediaItem item);
	public MediaItem searchItemById(String id);
	public ArrayList<MediaItem> getItems();
	public MediaItem updateItem(MediaItem m3,String id);
	public boolean deleteItem(String id);
	

}
