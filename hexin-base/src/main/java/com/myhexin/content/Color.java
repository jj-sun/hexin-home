package com.myhexin.content;

public enum Color {
    RED("红色"),
    BLACK("黑色"),
    WHITE("白色"),
    GREEN("绿色");
    private String description;


    private Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
