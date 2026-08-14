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

public class Result_getStatus_4770643564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008;

    public Result_getStatus_4770643564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1034 = new Integer(767834723);
        term1008 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1021 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1008, term1008.getClass(), "state", "mvrkADEgpp");
        setField(term1021, term1021.getClass(), "type", "pXOkjyeIRb");
        setField(term1021, term1021.getClass(), "pagesExported", term1034);
        setField(term1021, term1021.getClass(), "exportUrl", "GgZWSjxjyE");
        setField(term1008, term1008.getClass(), "status", term1021);
        setField(term1008, term1008.getClass(), "error", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term1008, args);
    }

};


