package com.myhexin;

import com.myhexin.content.Color;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        for(Color color : Color.values()) {
            System.out.println(color.getDescription());
        }

        Color r = Color.BLACK;
        switch(r) {
            case RED:
                break;
            case BLACK:
                break;
        }
    }
}
