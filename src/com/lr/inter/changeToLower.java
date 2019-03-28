package com.lr.inter;

public class changeToLower implements changeLetterCase {
	
	private String str;
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String change() {
		// TODO Auto-generated method stub
		return this.str.toLowerCase();
	}

}
