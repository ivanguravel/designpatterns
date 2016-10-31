package com.lectures.dp.command;

/**
 * @author Ivan_Zhuravel
 */
public interface Operation {

    void commit();

    void rollback();
}
