/*  
 *  Imixs-Workflow 
 *  
 *  Copyright (C) 2001-2020 Imixs Software Solutions GmbH,  
 *  http://www.imixs.com
 *  
 *  This program is free software; you can redistribute it and/or 
 *  modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation; either version 2 
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You can receive a copy of the GNU General Public
 *  License at http://www.gnu.org/licenses/gpl.html
 *  
 *  Project: 
 *      https://www.imixs.org
 *      https://github.com/imixs/imixs-workflow
 *  
 *  Contributors:  
 *      Imixs Software Solutions GmbH - Project Management
 *      Ralph Soika - Software Developer
 */

package org.imixs.muluk;

import java.nio.file.AccessDeniedException;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * 
 * @author rsoika
 * @version 1.0
 */
@Startup
@Singleton
public class MonitorService {
    public static String SETUP_OK = "OK";
    public static String MODEL_INITIALIZED = "MODEL_INITIALIZED";

    private static Logger logger = Logger.getLogger(MonitorService.class.getName());

    Date started=null;


    /**
     * This method start the system setup during deployment
     * 
     * @throws AccessDeniedException
     */
    @PostConstruct
    public void startup() {

        // created with linux figlet
        logger.info("   ____      _");
        logger.info("  /  _/_ _  (_)_ __ ___   Muluk");
        logger.info(" _/ //  ' \\/ /\\ \\ /(_-<   ");
        logger.info("/___/_/_/_/_//_\\_\\/___/   V0.0.0");
        logger.info("");
        started=new Date(System.currentTimeMillis());
       
    }

	public Date getStarted() {
		return started;
	}

	

}