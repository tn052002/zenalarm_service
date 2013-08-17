package com.awq.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class QuotesMaster {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int quote_id;
	private int category_id;
	
	private String quote;
	
	@Temporal(TemporalType.DATE)
	private Date trigger_date;

	/**
	 * @return the quote_id
	 */
	public int getQuote_id() {
		return quote_id;
	}

	/**
	 * @param quote_id the quote_id to set
	 */
	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	/**
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	}

	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	/**
	 * @return the quote
	 */
	public String getQuote() {
		return quote;
	}

	/**
	 * @param quote the quote to set
	 */
	public void setQuote(String quote) {
		this.quote = quote;
	}

	/**
	 * @return the trigger_date
	 */
	public Date getTrigger_date() {
		return trigger_date;
	}

	/**
	 * @param trigger_date the trigger_date to set
	 */
	public void setTrigger_date(Date trigger_date) {
		this.trigger_date = trigger_date;
	}
	
	
	

}
