/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.interfaces;

import org.hibernate.Session;

/**
 *
 * @author BDII1094
 */
public interface CategoryHandler {

    public boolean checkIfCategoryExists(Session session, String category);

    public int getCategoryID(Session session, String category);

    public boolean setCategoryID(Session session,String category);

}
