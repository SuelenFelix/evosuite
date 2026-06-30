package com.hhimanshu.persistence.entities;

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
import static com.hhimanshu.persistence.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Book_getAuthor_55254173010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;

    public Book_getAuthor_55254173010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Book"));
        setIntField(term354, term354.getClass(), "id", 0);
        setField(term354, term354.getClass(), "name", null);
        setField(term354, term354.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hhimanshu.persistence.entities.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term354, args);
    }

};


