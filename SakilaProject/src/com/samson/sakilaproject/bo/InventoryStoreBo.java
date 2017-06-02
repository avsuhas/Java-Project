package com.samson.sakilaproject.bo;

public class InventoryStoreBo {
	
	int inventory_id;
	int film_id;
	int store_id;
	String filmTitle;
	String description;
	String address;
	public int getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getFilmTitle() {
		return filmTitle;
	}
	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "InventoryStoreBo [inventory_id=" + inventory_id + ", film_id=" + film_id + ", store_id=" + store_id
				+ ", filmTitle=" + filmTitle + ", description=" + description + ", address=" + address + "]";
	}
	
	

}
