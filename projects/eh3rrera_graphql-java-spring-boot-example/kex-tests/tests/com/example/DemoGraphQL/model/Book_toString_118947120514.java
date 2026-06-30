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
import java.lang.Long;
import java.lang.Object;

public class Book_toString_118947120514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330;

    public Book_toString_118947120514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1331 = new Long(-4502405999831680926L);
        Long term1359 = new Long(1967728129628047933L);
        term1330 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term1358 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term1330, term1330.getClass(), "id", term1331);
        setField(term1330, term1330.getClass(), "title", "ffYhPOzlUs");
        setField(term1330, term1330.getClass(), "isbn", "MLqYREekMl");
        setIntField(term1330, term1330.getClass(), "pageCount", 1585847225);
        setField(term1358, term1358.getClass(), "id", term1359);
        setField(term1358, term1358.getClass(), "firstName", "ytSBIKXogI");
        setField(term1358, term1358.getClass(), "lastName", "nHXjMycHlU");
        setField(term1330, term1330.getClass(), "author", term1358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1330, args);
    }

};


