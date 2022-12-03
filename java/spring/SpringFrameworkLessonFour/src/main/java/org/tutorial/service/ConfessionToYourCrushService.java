package org.tutorial.service;

import org.springframework.stereotype.Service;

@Service
public class ConfessionToYourCrushService {
    public void confession(Boolean isNervous) {
        if (isNervous) {
            System.out.println("I wanted to say that... I... L... Lo... Love you...");
        } else {
            System.out.println("I wanted to say that I love you... Will you be my Girlfriend?");
        }
    }
}
