package com.moengage.interview.marvelapi.model.Stories;

import java.util.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Story {
	Optional<Integer> id;
	Optional<String> title;
	Optional<String> description;
	Optional<String> resourceURI;
	Optional<String> type;
	Optional<Date> modified;
	Optional<Image> thumbnail;
	Optional<ComicList> comics;
	Optional<SeriesList> series;
	Optional<EventList> events;
	Optional<CharacterList> characters;
	Optional<CreatorList> creators;
	Optional<ComicSummary> originalissue;
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
	public Optional<String> getType() {
		return type;
	}
	public void setType(Optional<String> type) {
		this.type = type;
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
	public Optional<SeriesList> getSeries() {
		return series;
	}
	public void setSeries(Optional<SeriesList> series) {
		this.series = series;
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
	public Optional<ComicSummary> getOriginalissue() {
		return originalissue;
	}
	public void setOriginalissue(Optional<ComicSummary> originalissue) {
		this.originalissue = originalissue;
	}
	
}
