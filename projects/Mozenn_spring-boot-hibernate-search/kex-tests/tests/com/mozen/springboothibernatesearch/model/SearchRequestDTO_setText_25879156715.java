package com.mozen.springboothibernatesearch.model;

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
import static com.mozen.springboothibernatesearch.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SearchRequestDTO_setText_25879156715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;

    public SearchRequestDTO_setText_25879156715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1539 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO"));
        setField(term1539, term1539.getClass(), "text", null);
        setField(term1539, term1539.getClass(), "fields", null);
        setIntField(term1539, term1539.getClass(), "limit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term1539, args);
    }

};


