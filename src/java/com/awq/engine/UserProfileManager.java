/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.engine;

import com.awq.dto.UserProfiler;
import com.awq.interfaces.UserProfilerHandler;
import org.hibernate.Session;

/**
 *
 * @author BDII1094
 */
public class UserProfileManager implements UserProfilerHandler {

    public int setUserProfile(Session session, UserProfiler userprofile) {
        try {
        session.saveOrUpdate(userprofile);
        return 1;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    }

    public int checkUserProfile(Session session, String userid, String category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UserProfiler getUserProfile(Session session, String userid, String category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    


}
