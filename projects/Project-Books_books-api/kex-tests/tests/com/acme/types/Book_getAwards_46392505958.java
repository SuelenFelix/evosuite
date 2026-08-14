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

public class Book_getAwards_46392505958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32616;

    public Book_getAwards_46392505958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32616 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term32616, term32616.getClass(), "id", null);
        setField(term32616, term32616.getClass(), "title", null);
        setField(term32616, term32616.getClass(), "isbn13", null);
        setField(term32616, term32616.getClass(), "isbn10", null);
        setField(term32616, term32616.getClass(), "genre", null);
        setField(term32616, term32616.getClass(), "yearOfPublication", null);
        setField(term32616, term32616.getClass(), "blurb", null);
        setField(term32616, term32616.getClass(), "authors", null);
        setField(term32616, term32616.getClass(), "publishers", null);
        setField(term32616, term32616.getClass(), "lang", null);
        setField(term32616, term32616.getClass(), "publishingFormat", null);
        setField(term32616, term32616.getClass(), "cover", null);
        setField(term32616, term32616.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwards", argTypes, term32616, args);
    }

};


