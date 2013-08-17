package com.awq.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="aqw_event_logger")
public class EventLogger implements Serializable {


	@Id
	private String request_id;

	private int userid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date request_tstamp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date response_tstamp;
	private int quoteId;
	private int processing_ttl;





	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return the request_tstamp
	 */
	public Date getRequest_tstamp() {
		return request_tstamp;
	}
	/**
	 * @param request_tstamp the request_tstamp to set
	 */
	public void setRequest_tstamp(Date request_tstamp) {
		this.request_tstamp = request_tstamp;
	}
	/**
	 * @return the response_tstamp
	 */
	public Date getResponse_tstamp() {
		return response_tstamp;
	}
	/**
	 * @param response_tstamp the response_tstamp to set
	 */
	public void setResponse_tstamp(Date response_tstamp) {
		this.response_tstamp = response_tstamp;
	}
	/**
	 * @return the quoteId
	 */
	public int getQuoteId() {
		return quoteId;
	}
	/**
	 * @param quoteId the quoteId to set
	 */
	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}
	/**
	 * @return the processing_ttl
	 */
	public int getProcessing_ttl() {
		return processing_ttl;
	}
	/**
	 * @param processing_ttl the processing_ttl to set
	 */
	public void setProcessing_ttl(int processing_ttl) {
		this.processing_ttl = processing_ttl;
	}
	/**
	 * @return the request_id
	 */
	public String getRequest_id() {
		return request_id;
	}
	/**
	 * @param request_id the request_id to set
	 */
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}




}
