package com.myhexin;

import static org.junit.Assert.assertTrue;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String userSet = "";
        //http://t.10jqka.com.cn/api.php?method=event.getUsersIdList&id=51
        try(InputStream in = new URL("http://t.10jqka.com.cn/api.php?method=event.getUsersIdList&id=51").openStream()) {
            userSet = IOUtils.toString(in);
            if(userSet.contains("\r\n")) {
                userSet = userSet.replace("\r\n",",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.err.println(userSet);
    }
}
