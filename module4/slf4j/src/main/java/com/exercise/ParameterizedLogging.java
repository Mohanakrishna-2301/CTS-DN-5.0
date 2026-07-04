package com.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging 
{
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) 
    {
        String name = "Alan";
        int age = 30;

        logger.info("User Name : {}", name);
        logger.info("Age : {}", age);
        logger.info("User {} is {} years old.", name, age);
    }
}