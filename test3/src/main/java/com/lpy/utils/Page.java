package com.lpy.utils;



import java.util.List;

public class Page<T> {

	private int total; // 总条数
	private int page;  // 当前页
	private int size;  // 每页展示的条数
	private List<T> rows;// 结果集

	private int totalPage;

	public int getTotalPage() {
		return total%size == 0 ? (total / size) : (total / size+1);
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}
