/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.quickstarts.fuse.sap;

import org.apache.camel.spring.Main;

/**
 * Runs example sap camel route. 
 * 
 * @author William Collins <punkhornsw@gmail.com>
 *
 */
public class RunRoute {

    /**
     * Run example sap camel route
     * 
     * @param args - none
     */
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("classpath:META-INF/spring/camel-context.xml");
        main.enableHangupSupport();
        main.start();
    }

}
