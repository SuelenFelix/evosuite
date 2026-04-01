package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerService_insertCulture_21098521001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1288;
     Object term1289;

    public ManagerService_insertCulture_21098521001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1288 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1288, term1288.getClass(), "md", null);
        setField(term1288, term1288.getClass(), "logger", null);
        term1289 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term1289, term1289.getClass(), "keyNum", -117576464);
        setField(term1289, term1289.getClass(), "keyHash", "gGSMzuGICf");
        setField(term1289, term1289.getClass(), "name", "hxCBltsObl");
        setIntField(term1289, term1289.getClass(), "likeCount", -1007160944);
        setIntField(term1289, term1289.getClass(), "status", 1135664017);
        setField(term1289, term1289.getClass(), "explain", "BndsHwAFMv");
        setField(term1289, term1289.getClass(), "fileUrl", "GzFkzHGYFt");
        setIntField(term1289, term1289.getClass(), "spot", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Culture");
        Object[] args = new Object[1];
        args[0] = term1289;
        callMethod(klass, "insertCulture", argTypes, term1288, args);
    }

};


