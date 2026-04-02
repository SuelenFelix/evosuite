package com.greydev.notionbackup.model;

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
import static com.greydev.notionbackup.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Result_setState_19664961076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;

    public Result_setState_19664961076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1218 = new Integer(-157887805);
        term1192 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1205 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1192, term1192.getClass(), "state", "jwsfVjMoJT");
        setField(term1205, term1205.getClass(), "type", "ZfdXfCCFDf");
        setField(term1205, term1205.getClass(), "pagesExported", term1218);
        setField(term1205, term1205.getClass(), "exportUrl", "MwwjNtdOFT");
        setField(term1192, term1192.getClass(), "status", term1205);
        setField(term1192, term1192.getClass(), "error", "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        callMethod(klass, "setState", argTypes, term1192, args);
    }

};


