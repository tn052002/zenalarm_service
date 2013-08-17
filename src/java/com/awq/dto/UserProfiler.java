package com.awq.dto;

import com.awq.interfaces.UserProfilerHandler;
import com.awq.test.Constants;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.Query;
import org.hibernate.Session;

@Entity
@Table(name="awq_user_profile")
@NamedNativeQuery(name="userProfile.byName" , query="select * from awq_user_profile where userid = ?", resultClass=UserProfiler.class)


public class UserProfiler implements UserProfilerHandler, Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String userid;
	
	private String country;
	
	private String category;
	
	private String imei_no;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date activation_date;

    public UserProfiler() {
    }

    public UserProfiler(String category, String userid) {
        this.userid = userid;
        this.category = category;
        this.activation_date= new Date();
        this.imei_no = Constants.cns_default_x;
        this.country = Constants.cns_default_x;
    }

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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
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
	 * @return the imei_no
	 */
	public String getImei_no() {
		return imei_no;
	}

	/**
	 * @param imei_no the imei_no to set
	 */
	public void setImei_no(String imei_no) {
		this.imei_no = imei_no;
	}

	/**
	 * @return the activation_date
	 */
	public Date getActivation_date() {
		return activation_date;
	}

	/**
	 * @param activation_date the activation_date to set
	 */
	public void setActivation_date(Date activation_date) {
		this.activation_date = activation_date;
	}

    public int setUserProfile(Session session, UserProfiler userprofile) {
        session.saveOrUpdate(this);
        return 1;
    }

    public int checkUserProfile(Session session, String userid, String category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UserProfiler getUserProfile(Session session, String userid, String category) {
        Query query = session.getNamedQuery("userProfile.byName");
                query.setString(0, "8860057744");

                List<UserProfiler> profile = (List<UserProfiler>)query.list();


                for (UserProfiler userProfiler1 : profile) {
                    System.out.println(userProfiler1.getUserid() + "\t" + userProfiler1.getCategory());
                }
                if(profile.size()>0)
                    return profile.get(0);
                else
                    return null;

    }
	
	
	
	

}
