package com.moengage.interview.marvelapi.model.Events;

import java.util.ArrayList;
import java.util.Optional;

public class CreatorList {
	Optional<Integer> available;
	Optional<Integer> returned;
	Optional<String> collectionURI;
	Optional<ArrayList<CreatorSummary>> items;
	public Optional<Integer> getAvailable() {
		return available;
	}
	public void setAvailable(Optional<Integer> available) {
		this.available = available;
	}
	public Optional<Integer> getReturned() {
		return returned;
	}
	public void setReturned(Optional<Integer> returned) {
		this.returned = returned;
	}
	public Optional<String> getCollectionURI() {
		return collectionURI;
	}
	public void setCollectionURI(Optional<String> collectionURI) {
		this.collectionURI = collectionURI;
	}
	public Optional<ArrayList<CreatorSummary>> getItems() {
		return items;
	}
	public void setItems(Optional<ArrayList<CreatorSummary>> items) {
		this.items = items;
	}
	
}
