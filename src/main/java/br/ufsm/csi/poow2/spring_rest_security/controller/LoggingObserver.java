package br.ufsm.csi.poow2.spring_rest_security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingObserver implements LogObserver{
    private static final Logger logger = LoggerFactory.getLogger(LoggingObserver.class);

    @Override
    public void updateLog(String logMessage) {
        logger.info(logMessage);
    }
}
