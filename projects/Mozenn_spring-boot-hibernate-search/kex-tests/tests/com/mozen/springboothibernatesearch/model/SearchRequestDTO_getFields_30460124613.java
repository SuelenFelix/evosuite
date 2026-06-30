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

public class SearchRequestDTO_getFields_30460124613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535;

    public SearchRequestDTO_getFields_30460124613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1535 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO"));
        setField(term1535, term1535.getClass(), "text", null);
        setField(term1535, term1535.getClass(), "fields", null);
        setIntField(term1535, term1535.getClass(), "limit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFields", argTypes, term1535, args);
    }

};


