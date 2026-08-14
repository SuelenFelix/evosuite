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

public class Book_getIsbn10_33645706540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32598;

    public Book_getIsbn10_33645706540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32598 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term32598, term32598.getClass(), "id", null);
        setField(term32598, term32598.getClass(), "title", null);
        setField(term32598, term32598.getClass(), "isbn13", null);
        setField(term32598, term32598.getClass(), "isbn10", null);
        setField(term32598, term32598.getClass(), "genre", null);
        setField(term32598, term32598.getClass(), "yearOfPublication", null);
        setField(term32598, term32598.getClass(), "blurb", null);
        setField(term32598, term32598.getClass(), "authors", null);
        setField(term32598, term32598.getClass(), "publishers", null);
        setField(term32598, term32598.getClass(), "lang", null);
        setField(term32598, term32598.getClass(), "publishingFormat", null);
        setField(term32598, term32598.getClass(), "cover", null);
        setField(term32598, term32598.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsbn10", argTypes, term32598, args);
    }

};


