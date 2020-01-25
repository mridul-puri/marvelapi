package com.moengage.interview.marvelapi.model.Characters;

import java.util.ArrayList;
import java.util.Optional;

public class CharacterDataContainer {
	Optional<Integer> offset;
	Optional<Integer> limit;
	Optional<Integer> total;
	Optional<Integer> count;
	Optional<ArrayList<Character>> results;
	
	public Optional<Integer> getOffset() {
		return offset;
	}
	public void setOffset(Optional<Integer> offset) {
		this.offset = offset;
	}
	public Optional<Integer> getLimit() {
		return limit;
	}
	public void setLimit(Optional<Integer> limit) {
		this.limit = limit;
	}
	public Optional<Integer> getTotal() {
		return total;
	}
	public void setTotal(Optional<Integer> total) {
		this.total = total;
	}
	public Optional<Integer> getCount() {
		return count;
	}
	public void setCount(Optional<Integer> count) {
		this.count = count;
	}
	public Optional<ArrayList<Character>> getResults() {
		return results;
	}
	public void setResults(Optional<ArrayList<Character>> results) {
		this.results = results;
	}

}
