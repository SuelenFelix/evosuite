package com.karankumar.booksapi.model;

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
import static com.karankumar.booksapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Book_setId_15574968647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10670;

    public Book_setId_15574968647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10670 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        setField(term10670, term10670.getClass(), "id", null);
        setField(term10670, term10670.getClass(), "title", null);
        setField(term10670, term10670.getClass(), "authors", null);
        setField(term10670, term10670.getClass(), "lang", null);
        setField(term10670, term10670.getClass(), "isbn10", null);
        setField(term10670, term10670.getClass(), "isbn13", null);
        setField(term10670, term10670.getClass(), "genre", null);
        setField(term10670, term10670.getClass(), "yearOfPublication", null);
        setField(term10670, term10670.getClass(), "blurb", null);
        setField(term10670, term10670.getClass(), "publishers", null);
        setField(term10670, term10670.getClass(), "publishingFormat", null);
        setField(term10670, term10670.getClass(), "cover", null);
        setField(term10670, term10670.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term10670, args);
    }

};


