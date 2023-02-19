package com.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

public class TestCreateTable {

    @Test
    public void testCreateTable(){

        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();


        System.out.println(processEngine);
    }
}
