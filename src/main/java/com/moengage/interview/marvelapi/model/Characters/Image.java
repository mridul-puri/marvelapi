package com.moengage.interview.marvelapi.model.Characters;

import java.util.Optional;

public class Image {
	Optional<String> path;
	Optional<String> extension;
	public Optional<String> getPath() {
		return path;
	}
	public void setPath(Optional<String> path) {
		this.path = path;
	}
	public Optional<String> getExtension() {
		return extension;
	}
	public void setExtension(Optional<String> extension) {
		this.extension = extension;
	}
	
}
