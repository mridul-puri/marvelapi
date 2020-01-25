package com.moengage.interview.marvelapi.model.Series;

import java.util.ArrayList;
import java.util.Optional;

public class ComicList {
	Optional<Integer> available;
	Optional<Integer> returned;
	Optional<String> collectionURI;
	Optional<ArrayList<ComicSummary>> items;
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
	public Optional<ArrayList<ComicSummary>> getItems() {
		return items;
	}
	public void setItems(Optional<ArrayList<ComicSummary>> items) {
		this.items = items;
	}
	
}
