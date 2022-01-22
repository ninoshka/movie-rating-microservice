package com.ninoshka.moviecatalogservice.model;

public class CatalogItem {
	
	String name;
	String desc;
	float rating;
	
	public CatalogItem(String name, String desc, float rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	

}
