package com.cg.freelanceapp.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RecruiterDTO_setUserName_4124398769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17210;

    public RecruiterDTO_setUserName_4124398769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17210 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterDTO"));
        setField(term17210, term17210.getClass(), "userName", "asMqnMNrZp");
        setField(term17210, term17210.getClass(), "firstName", "pqFUMTCKJd");
        setField(term17210, term17210.getClass(), "lastName", "PTEndmPMzk");
        setField(term17210, term17210.getClass(), "password", "aJQuCOCvZs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHYNCJRiOv";
        callMethod(klass, "setUserName", argTypes, term17210, args);
    }

};


