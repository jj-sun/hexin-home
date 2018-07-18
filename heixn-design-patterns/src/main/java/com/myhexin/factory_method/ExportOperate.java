package com.myhexin.factory_method;

/**
 * creater 创建器
 */
public abstract class ExportOperate {

    protected abstract ExportFileApi factoryMethod();

    public boolean export(String data) {
        ExportFileApi exportFileApi = factoryMethod();
        return exportFileApi.export(data);
    }
}
