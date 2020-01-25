package com.moengage.interview.marvelapi.model.Series;

import java.util.Optional;

public class SeriesSummary {
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
