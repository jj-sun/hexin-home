package com.myhexin.factory_method;

public class ExportTxtFileOperate extends ExportOperate{

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
