package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Book_equals_78899159161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32619;

    public Book_equals_78899159161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32619 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term32619, term32619.getClass(), "id", null);
        setField(term32619, term32619.getClass(), "title", null);
        setField(term32619, term32619.getClass(), "isbn13", null);
        setField(term32619, term32619.getClass(), "isbn10", null);
        setField(term32619, term32619.getClass(), "genre", null);
        setField(term32619, term32619.getClass(), "yearOfPublication", null);
        setField(term32619, term32619.getClass(), "blurb", null);
        setField(term32619, term32619.getClass(), "authors", null);
        setField(term32619, term32619.getClass(), "publishers", null);
        setField(term32619, term32619.getClass(), "lang", null);
        setField(term32619, term32619.getClass(), "publishingFormat", null);
        setField(term32619, term32619.getClass(), "cover", null);
        setField(term32619, term32619.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term32619, args);
    }

};


