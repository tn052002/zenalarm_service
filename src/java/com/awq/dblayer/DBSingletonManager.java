/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.dblayer;

/**
 *
 * @author BDII1094
 */
public class DBSingletonManager {

    private DBSingletonManager() {
    }

    public static DBSingletonManager getInstance() {
        return DBSingletonManagerHolder.INSTANCE;
    }

    private static class DBSingletonManagerHolder {
        private static final DBSingletonManager INSTANCE = new DBSingletonManager();
    }



 }
