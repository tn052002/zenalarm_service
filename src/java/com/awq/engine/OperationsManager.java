/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.engine;

import com.awq.dto.CategoryMaster;
import com.awq.dto.EventLogger;
import com.awq.dto.UserProfiler;
import com.awq.interfaces.OperationsHandler;
import com.awq.interfaces.UserProfilerHandler;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author BDII1094
 */
public class OperationsManager implements OperationsHandler {

    

    private boolean registerRequest(Session session,String msisdn, int categoryID) {
        EventLogger evelogger = new EventLogger();
        //session.get

        return false;
    }


    private int getCategoryID(Session session, String category) {
        CategoryMaster categoryMaster = new CategoryMaster();
        return categoryMaster.getCategoryID(session, category);
    }

    public List<String> getAllCategories(Session session) {
        Query query = session.createQuery("select category from awq_category_master");
        query.
    }

    public int profileUser(Session session, String msisdn, String category) {

        UserProfiler userProfiler = new UserProfiler(category,msisdn);
        return userProfiler.setUserProfile(session, userProfiler);
    }

    public String fetchQuote(Session session) {
        throw new UnsupportedOperationException("Not supported yet.");
    }





}
