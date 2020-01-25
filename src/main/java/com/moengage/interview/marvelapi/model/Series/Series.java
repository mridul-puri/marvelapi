package com.moengage.interview.marvelapi.model.Series;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Series {
	Optional<Integer> id;
	Optional<String> title;
	Optional<String> description;
	Optional<String> resourceURI;
	Optional<ArrayList<Url>> urls;
	Optional<Integer> startYear;
	Optional<Integer> endYear;
	Optional<String> rating;
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	Optional<Date> modified;
	Optional<Image> thumbnail;
	Optional<ComicList> comics;
	Optional<StoryList> stories;
	Optional<EventList> events;
	Optional<CharacterList> characters;
	Optional<CreatorList> creators;
	Optional<SeriesSummary> next;
	Optional<SeriesSummary> previous;
	public Optional<Integer> getId() {
		return id;
	}
	public void setId(Optional<Integer> id) {
		this.id = id;
	}
	public Optional<String> getTitle() {
		return title;
	}
	public void setTitle(Optional<String> title) {
		this.title = title;
	}
	public Optional<String> getDescription() {
		return description;
	}
	public void setDescription(Optional<String> description) {
		this.description = description;
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
	public Optional<Integer> getStartYear() {
		return startYear;
	}
	public void setStartYear(Optional<Integer> startYear) {
		this.startYear = startYear;
	}
	public Optional<Integer> getEndYear() {
		return endYear;
	}
	public void setEndYear(Optional<Integer> endYear) {
		this.endYear = endYear;
	}
	public Optional<String> getRating() {
		return rating;
	}
	public void setRating(Optional<String> rating) {
		this.rating = rating;
	}
	public Optional<Date> getModified() {
		return modified;
	}
	public void setModified(Optional<Date> modified) {
		this.modified = modified;
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
	public Optional<CharacterList> getCharacters() {
		return characters;
	}
	public void setCharacters(Optional<CharacterList> characters) {
		this.characters = characters;
	}
	public Optional<CreatorList> getCreators() {
		return creators;
	}
	public void setCreators(Optional<CreatorList> creators) {
		this.creators = creators;
	}
	public Optional<SeriesSummary> getNext() {
		return next;
	}
	public void setNext(Optional<SeriesSummary> next) {
		this.next = next;
	}
	public Optional<SeriesSummary> getPrevious() {
		return previous;
	}
	public void setPrevious(Optional<SeriesSummary> previous) {
		this.previous = previous;
	}

}
