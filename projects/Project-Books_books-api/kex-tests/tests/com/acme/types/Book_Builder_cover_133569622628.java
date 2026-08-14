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

public class Book_Builder_cover_133569622628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50424;

    public Book_Builder_cover_133569622628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50424 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        setField(term50424, term50424.getClass(), "id", null);
        setField(term50424, term50424.getClass(), "title", null);
        setField(term50424, term50424.getClass(), "isbn13", null);
        setField(term50424, term50424.getClass(), "isbn10", null);
        setField(term50424, term50424.getClass(), "genre", null);
        setField(term50424, term50424.getClass(), "yearOfPublication", null);
        setField(term50424, term50424.getClass(), "blurb", null);
        setField(term50424, term50424.getClass(), "authors", null);
        setField(term50424, term50424.getClass(), "publishers", null);
        setField(term50424, term50424.getClass(), "lang", null);
        setField(term50424, term50424.getClass(), "publishingFormat", null);
        setField(term50424, term50424.getClass(), "cover", null);
        setField(term50424, term50424.getClass(), "awards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.Cover");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "cover", argTypes, term50424, args);
    }

};


