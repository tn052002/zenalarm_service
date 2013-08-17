/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.interfaces;

import com.awq.dto.UserProfiler;
import org.hibernate.Session;

/**
 *
 * @author BDII1094
 */
public interface UserProfilerHandler {

    public int setUserProfile(Session session, UserProfiler userprofile);

    public int checkUserProfile(Session session, String userid, String category);

    public UserProfiler getUserProfile(Session session,String userid, String category);

}
