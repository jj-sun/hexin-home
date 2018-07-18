package com.myhexin.factory_method;

public class FactoryMethodMain {

    public static void main(String[] args) {
        ExportOperate exportOperate = new ExportTxtFileOperate();
        exportOperate.export("txt");
        exportOperate = new ExportDBOperate();
        exportOperate.export("db");
    }

}
