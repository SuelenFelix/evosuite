package com.pfa.app.service.impl;

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
import static com.pfa.app.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ProjectServiceImpl_save_8626343004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;

    public ProjectServiceImpl_save_8626343004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term381 = new ArrayList();
        ((ArrayList) term381).add("ZKMLioamsY");
        ((ArrayList) term381).add("WVbxuoDBcn");
        ((ArrayList) term381).add("pvDEABOxLt");
        ((ArrayList) term381).add("beAMpkroCQ");
        ((ArrayList) term381).add("uSUvKAyuvd");
        ((ArrayList) term381).add("onQLVONGuf");
        ((ArrayList) term381).add("SOrEHbcbmn");
        ((ArrayList) term381).add("bnsyeQXFdu");
        ((ArrayList) term381).add("BwtdjiefJn");
        term332 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term332, term332.getClass(), "title", "lCyLIcSuom");
        setField(term332, term332.getClass(), "startDate", "CGOpQSZZwI");
        setField(term332, term332.getClass(), "endDate", "ypEdrstygY");
        setField(term332, term332.getClass(), "status", "sNQFlATEeQ");
        setField(term332, term332.getClass(), "assignedEmployees", term381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.ProjectServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Object[] args = new Object[1];
        args[0] = term332;
        callMethod(klass, "save", argTypes, null, args);
    }

};


