package com.Master.dto;

public class Search {
	private String keyword;
	private String filter;
	private int page;
	private int size;

	// Constructors
	public Search() {
	}

	public Search(String keyword, String filter, int page, int size) {
		this.keyword = keyword;
		this.filter = filter;
		this.page = page;
		this.size = size;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Search [keyword=" + keyword + ", filter=" + filter + ", page=" + page + ", size=" + size + "]";
	}
	
	
}
