package com.moengage.interview.marvelapi.model.Characters;

import java.util.Optional;

public class CharacterDataWrapper {
	Optional<Integer> code;
	Optional<String> status;
	Optional<String> copyright;
	Optional<String> attributionText; 
	Optional<String> attributionHTML; 
	Optional<CharacterDataContainer> data;
	Optional<String> etag;
	
	public Optional<Integer> getCode() {
		return code;
	}
	public void setCode(Optional<Integer> code) {
		this.code = code;
	}
	public Optional<String> getStatus() {
		return status;
	}
	public void setStatus(Optional<String> status) {
		this.status = status;
	}
	public Optional<String> getCopyright() {
		return copyright;
	}
	public void setCopyright(Optional<String> copyright) {
		this.copyright = copyright;
	}
	public Optional<String> getAttributionText() {
		return attributionText;
	}
	public void setAttributionText(Optional<String> attributionText) {
		this.attributionText = attributionText;
	}
	public Optional<String> getAttributionHTML() {
		return attributionHTML;
	}
	public void setAttributionHTML(Optional<String> attributionHTML) {
		this.attributionHTML = attributionHTML;
	}
	public Optional<CharacterDataContainer> getData() {
		return data;
	}
	public void setData(Optional<CharacterDataContainer> data) {
		this.data = data;
	}
	public Optional<String> getEtag() {
		return etag;
	}
	public void setEtag(Optional<String> etag) {
		this.etag = etag;
	}
}
