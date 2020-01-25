package com.moengage.interview.marvelapi.model.Characters;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Character {
	Optional<Integer> id;
	Optional<String> name;
	Optional<String> description;
	Optional<Date> modified;
	Optional<String> resourceURI;
	Optional<ArrayList<Url>> urls;
	Optional<Image> thumbnail;
	Optional<ComicList> comics;
	Optional<StoryList> stories;
	Optional<EventList> events;
	Optional<SeriesList> series;
	public Optional<Integer> getId() {
		return id;
	}
	public void setId(Optional<Integer> id) {
		this.id = id;
	}
	public Optional<String> getName() {
		return name;
	}
	public void setName(Optional<String> name) {
		this.name = name;
	}
	public Optional<String> getDescription() {
		return description;
	}
	public void setDescription(Optional<String> description) {
		this.description = description;
	}
	public Optional<Date> getModified() {
		return modified;
	}
	public void setModified(Optional<Date> modified) {
		this.modified = modified;
	}
	public Optional<String> getResourceURI() {
		return resourceURI;
	}
	public void setResourceURI(Optional<String> resourceURI) {
		this.resourceURI = resourceURI;
	}
	public Optional<ArrayList<Url>> getUrls() {
		return urls;
	}
	public void setUrls(Optional<ArrayList<Url>> urls) {
		this.urls = urls;
	}
	public Optional<Image> getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(Optional<Image> thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Optional<ComicList> getComics() {
		return comics;
	}
	public void setComics(Optional<ComicList> comics) {
		this.comics = comics;
	}
	public Optional<StoryList> getStories() {
		return stories;
	}
	public void setStories(Optional<StoryList> stories) {
		this.stories = stories;
	}
	public Optional<EventList> getEvents() {
		return events;
	}
	public void setEvents(Optional<EventList> events) {
		this.events = events;
	}
	public Optional<SeriesList> getSeries() {
		return series;
	}
	public void setSeries(Optional<SeriesList> series) {
		this.series = series;
	}
}