package com.moengage.interview.marvelapi.model.Characters;

import java.util.Optional;

public class EventSummary {
	Optional<String> resourceURI;
	Optional<String> name;
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
	
}
