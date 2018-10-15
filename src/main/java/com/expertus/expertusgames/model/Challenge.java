package com.expertus.expertusgames.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Otmane Benameur
 * @desc This model class hold the data for a challenge
 */

@Document(collection="challenges")
public class Challenge {
	/**
	 * Parameters
	 */
	@Id
	private String id;
	private String proposerEmail;
	private String title;
	private String description;
	private String url;
	
	/**
	 * Constructors
	 */
	public Challenge() {
	}
	
	
	public Challenge(String id, String proposerEmail, String title, String description, String url) {
		this.id = id;
		this.proposerEmail = proposerEmail;
		this.title = title;
		this.description = description;
		this.url = url;
	}


	/**
	 * Setters and Getters
	 */
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getProposerEmail() {
		return proposerEmail;
	}
	
	public void setProposerEmail(String proposerEmail) {
		this.proposerEmail = proposerEmail;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}
