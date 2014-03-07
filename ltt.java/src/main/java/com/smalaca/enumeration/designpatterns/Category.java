package com.smalaca.enumeration.designpatterns;

import com.smalaca.enumeration.HasDescription;

public enum Category implements HasDescription {

	CREATIONAL("Deals with object creation mechanisms, trying to create objects in a manner suitable to the situation."),
	STRUCTURAL("Eases the design by identifying a simple way to realize relationships between entities."),
	BEHAVIORAL("Identifies common communication patterns between objects and realize these patterns.");
	
	private final String description;

	private Category(final String description) {
		this.description = description;
	}

	public String describe() {
		return description;
	}

	public String getExample() {
		
		String example = "";
		
		switch(this) 
		{
			case CREATIONAL:
				example = "Builder";
				break;
		
			case STRUCTURAL:
				example = "Adapter";
				break;
		
			case BEHAVIORAL:
				example = "Strategy";
				break;		
		}
		
		return example;
	}
}
