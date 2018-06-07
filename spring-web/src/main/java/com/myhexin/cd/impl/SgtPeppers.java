package com.myhexin.cd.impl;

import com.myhexin.cd.CompactDisc;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "test title";


    private String tist = "good";

    @Override
    public void play() {
        System.out.println("playing" + title + "by" + tist);
    }
}
