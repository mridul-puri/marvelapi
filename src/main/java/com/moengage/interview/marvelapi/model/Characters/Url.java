package com.moengage.interview.marvelapi.model.Characters;

import java.util.Optional;

public class Url {
	Optional<String> type;
	Optional<String> url;
	public Optional<String> getType() {
		return type;
	}
	public void setType(Optional<String> type) {
		this.type = type;
	}
	public Optional<String> getUrl() {
		return url;
	}
	public void setUrl(Optional<String> url) {
		this.url = url;
	}
	
	
	
}
