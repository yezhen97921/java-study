package com.study.logging.log4j;

// commonsLogging ===> javac -cp .:commons-logging-1.3.4.jar Demo01.java
// src ===> java -cp .:com/study/logging/commonsLogging/commons-logging-1.3.4.jar com.study.logging.commonsLogging.Demo01

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class  Demo01 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(com.study.logging.log4j.Demo01.class);
        log.info("start...");
        log.warn("end.");
    }
}


