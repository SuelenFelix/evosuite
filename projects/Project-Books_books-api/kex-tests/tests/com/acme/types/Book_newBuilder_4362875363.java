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

public class Book_newBuilder_4362875363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32621;

    public Book_newBuilder_4362875363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32621 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term32621, term32621.getClass(), "id", null);
        setField(term32621, term32621.getClass(), "title", null);
        setField(term32621, term32621.getClass(), "isbn13", null);
        setField(term32621, term32621.getClass(), "isbn10", null);
        setField(term32621, term32621.getClass(), "genre", null);
        setField(term32621, term32621.getClass(), "yearOfPublication", null);
        setField(term32621, term32621.getClass(), "blurb", null);
        setField(term32621, term32621.getClass(), "authors", null);
        setField(term32621, term32621.getClass(), "publishers", null);
        setField(term32621, term32621.getClass(), "lang", null);
        setField(term32621, term32621.getClass(), "publishingFormat", null);
        setField(term32621, term32621.getClass(), "cover", null);
        setField(term32621, term32621.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newBuilder", argTypes, term32621, args);
    }

};


