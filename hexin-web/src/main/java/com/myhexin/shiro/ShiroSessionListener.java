package com.myhexin.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ShiroSessionListener extends SessionListenerAdapter {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void onStart(Session session) {
        logger.info("",session.getId());
    }

    @Override
    public void onStop(Session session) {
        logger.info("",session.getId());
    }

    @Override
    public void onExpiration(Session session) {
        logger.info("",session.getId());
    }
}
