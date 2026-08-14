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

public class Author_setBooks_181626235923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35467;

    public Author_setBooks_181626235923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35467 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term35467, term35467.getClass(), "id", null);
        setField(term35467, term35467.getClass(), "fullName", null);
        setField(term35467, term35467.getClass(), "about", null);
        setField(term35467, term35467.getClass(), "books", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBooks", argTypes, term35467, args);
    }

};


