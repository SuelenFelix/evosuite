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
import java.util.ArrayList;

public class SearchRequestDTO_toString_102272150210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1505;

    public SearchRequestDTO_toString_102272150210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1518 = new ArrayList();
        term1505 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO"));
        setField(term1505, term1505.getClass(), "text", "eqJfYWRaEL");
        setField(term1505, term1505.getClass(), "fields", term1518);
        setIntField(term1505, term1505.getClass(), "limit", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1505, args);
    }

};


