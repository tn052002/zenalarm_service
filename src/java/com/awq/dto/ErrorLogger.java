package com.awq.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="awq_error_log")
public class ErrorLogger {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Lob
	private String userid;
	
	private String category;
	
	private int quoteID;
	
	private String ErrorMessage;
	
	private Date request_date;

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the quoteID
	 */
	public int getQuoteID() {
		return quoteID;
	}

	/**
	 * @param quoteID the quoteID to set
	 */
	public void setQuoteID(int quoteID) {
		this.quoteID = quoteID;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return ErrorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

	/**
	 * @return the request_date
	 */
	public Date getRequest_date() {
		return request_date;
	}

	/**
	 * @param request_date the request_date to set
	 */
	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}
	
	
	
	
	

}
