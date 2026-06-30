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

public class Book_setTitle_127952643720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433;

    public Book_setTitle_127952643720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1433 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        setField(term1433, term1433.getClass(), "id", null);
        setField(term1433, term1433.getClass(), "title", null);
        setField(term1433, term1433.getClass(), "isbn", null);
        setIntField(term1433, term1433.getClass(), "pageCount", 0);
        setField(term1433, term1433.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term1433, args);
    }

};


