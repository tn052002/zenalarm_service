/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awq.interfaces;

import com.awq.dto.ErrorLogger;
import com.awq.dto.EventLogger;

/**
 *
 * @author BDII1094
 */
public interface LoggingHandler {

    public boolean setErrorLog(ErrorLogger el);

    public boolean setEventLog(EventLogger el);

    public int logRequestInitiation(EventLogger el);

}
