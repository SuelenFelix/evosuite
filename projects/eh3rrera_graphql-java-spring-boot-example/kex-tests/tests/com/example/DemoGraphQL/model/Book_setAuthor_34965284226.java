package com.example.DemoGraphQL.model;

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
import static com.example.DemoGraphQL.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Book_setAuthor_34965284226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1447;

    public Book_setAuthor_34965284226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1447 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        setField(term1447, term1447.getClass(), "id", null);
        setField(term1447, term1447.getClass(), "title", null);
        setField(term1447, term1447.getClass(), "isbn", null);
        setIntField(term1447, term1447.getClass(), "pageCount", 0);
        setField(term1447, term1447.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.DemoGraphQL.model.Author");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAuthor", argTypes, term1447, args);
    }

};


