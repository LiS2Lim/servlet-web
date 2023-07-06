package models;

import java.io.Serializable;

public class Bean implements Serializable {
	private String content;
	public String getContent() { return this.content; }
	public void setContent(String content) { this.content = content; }
}
