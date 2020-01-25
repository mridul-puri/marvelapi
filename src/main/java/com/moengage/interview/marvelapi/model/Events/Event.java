package com.moengage.interview.marvelapi.model.Events;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	Optional<Integer> id;
	Optional<String> title;
	Optional<String> description;
	Optional<String> resourceURI;
	Optional<ArrayList<Url>> urls;
	Optional<Date> modified;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	Optional<Date> start;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	Optional<Date> end;
	Optional<Image> thumbnail;
	Optional<ComicList> comics;
	Optional<StoryList> stories;
	Optional<SeriesList> series;
	Optional<CharacterList> characters;
	Optional<CreatorList> creators;
	Optional<EventSummary> next;
	Optional<EventSummary> previous;
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
	public Optional<Date> getModified() {
		return modified;
	}
	public void setModified(Optional<Date> modified) {
		this.modified = modified;
	}
	public Optional<Date> getStart() {
		return start;
	}
	public void setStart(Optional<Date> start) {
		this.start = start;
	}
	public Optional<Date> getEnd() {
		return end;
	}
	public void setEnd(Optional<Date> end) {
		this.end = end;
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
	public Optional<SeriesList> getSeries() {
		return series;
	}
	public void setSeries(Optional<SeriesList> series) {
		this.series = series;
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
	public Optional<EventSummary> getNext() {
		return next;
	}
	public void setNext(Optional<EventSummary> next) {
		this.next = next;
	}
	public Optional<EventSummary> getPrevious() {
		return previous;
	}
	public void setPrevious(Optional<EventSummary> previous) {
		this.previous = previous;
	}
	
}
