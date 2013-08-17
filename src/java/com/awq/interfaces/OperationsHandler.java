/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.interfaces;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author BDII1094
 */
public interface OperationsHandler {

    public List<String> getAllCategories(Session session);

    public int profileUser(Session session,String msisdn, String category);

    public String fetchQuote(Session session);

}
