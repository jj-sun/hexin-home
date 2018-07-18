package com.myhexin.factory_method;

public class ExportDB implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("export " + data);
        return true;
    }
}
