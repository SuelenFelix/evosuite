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
import java.util.ArrayList;

public class Author_getAbout_5561555396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34308;

    public Author_getAbout_5561555396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34345 = new ArrayList();
        term34308 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term34308, term34308.getClass(), "id", "gktMmpIJGy");
        setField(term34308, term34308.getClass(), "fullName", "yEUvvkNsJL");
        setField(term34308, term34308.getClass(), "about", "LeUPMkvgXk");
        setField(term34308, term34308.getClass(), "books", term34345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbout", argTypes, term34308, args);
    }

};


