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

public class Author_removeBook_148470811217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18751;

    public Author_removeBook_148470811217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18751 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18751, term18751.getClass(), "id", null);
        setField(term18751, term18751.getClass(), "fullName", null);
        setField(term18751, term18751.getClass(), "books", null);
        setField(term18751, term18751.getClass(), "about", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeBook", argTypes, term18751, args);
    }

};


