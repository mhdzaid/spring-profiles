package com.profile.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveProfile {

    @Value("${application.current-profile}")
    private String profile;

    @EventListener(ContextRefreshedEvent.class)
    public void onStartUp() {
        System.out.println("The current profile is : " +  profile);
    }
}
