package com.karankumar.booksapi.datafetchers;

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
import static com.karankumar.booksapi.datafetchers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BookDataFetcher_findBookByIsbn13_205572809510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346;

    public BookDataFetcher_findBookByIsbn13_205572809510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1346 = newInstance(Class.forName("com.karankumar.booksapi.datafetchers.BookDataFetcher"));
        setField(term1346, term1346.getClass(), "bookService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.datafetchers.BookDataFetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "findBookByIsbn13", argTypes, term1346, args);
    }

};


