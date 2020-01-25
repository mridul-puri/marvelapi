package com.moengage.interview.marvelapi.model.Events;

import java.util.Optional;

public class StorySummary {
	Optional<String> resourceURI;
	Optional<String> name;
	Optional<String> type;
	public Optional<String> getResourceURI() {
		return resourceURI;
	}
	public void setResourceURI(Optional<String> resourceURI) {
		this.resourceURI = resourceURI;
	}
	public Optional<String> getName() {
		return name;
	}
	public void setName(Optional<String> name) {
		this.name = name;
	}
	public Optional<String> getType() {
		return type;
	}
	public void setType(Optional<String> type) {
		this.type = type;
	}
}
