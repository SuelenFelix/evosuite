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

public class Book_getBlurb_91517822342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10665;

    public Book_getBlurb_91517822342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10665 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        setField(term10665, term10665.getClass(), "id", null);
        setField(term10665, term10665.getClass(), "title", null);
        setField(term10665, term10665.getClass(), "authors", null);
        setField(term10665, term10665.getClass(), "lang", null);
        setField(term10665, term10665.getClass(), "isbn10", null);
        setField(term10665, term10665.getClass(), "isbn13", null);
        setField(term10665, term10665.getClass(), "genre", null);
        setField(term10665, term10665.getClass(), "yearOfPublication", null);
        setField(term10665, term10665.getClass(), "blurb", null);
        setField(term10665, term10665.getClass(), "publishers", null);
        setField(term10665, term10665.getClass(), "publishingFormat", null);
        setField(term10665, term10665.getClass(), "cover", null);
        setField(term10665, term10665.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlurb", argTypes, term10665, args);
    }

};


