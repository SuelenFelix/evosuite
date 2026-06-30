package com.example.DemoGraphQL.model;

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
import static com.example.DemoGraphQL.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Book_setPageCount_111930354424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1441;
     Object term1443;

    public Book_setPageCount_111930354424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1441 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        setField(term1441, term1441.getClass(), "id", null);
        setField(term1441, term1441.getClass(), "title", null);
        setField(term1441, term1441.getClass(), "isbn", null);
        setIntField(term1441, term1441.getClass(), "pageCount", 0);
        setField(term1441, term1441.getClass(), "author", null);
        term1443 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1443;
        callMethod(klass, "setPageCount", argTypes, term1441, args);
    }

};


