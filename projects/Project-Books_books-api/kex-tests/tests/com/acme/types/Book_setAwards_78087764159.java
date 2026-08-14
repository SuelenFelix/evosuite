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

public class Book_setAwards_78087764159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32617;

    public Book_setAwards_78087764159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32617 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term32617, term32617.getClass(), "id", null);
        setField(term32617, term32617.getClass(), "title", null);
        setField(term32617, term32617.getClass(), "isbn13", null);
        setField(term32617, term32617.getClass(), "isbn10", null);
        setField(term32617, term32617.getClass(), "genre", null);
        setField(term32617, term32617.getClass(), "yearOfPublication", null);
        setField(term32617, term32617.getClass(), "blurb", null);
        setField(term32617, term32617.getClass(), "authors", null);
        setField(term32617, term32617.getClass(), "publishers", null);
        setField(term32617, term32617.getClass(), "lang", null);
        setField(term32617, term32617.getClass(), "publishingFormat", null);
        setField(term32617, term32617.getClass(), "cover", null);
        setField(term32617, term32617.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAwards", argTypes, term32617, args);
    }

};


