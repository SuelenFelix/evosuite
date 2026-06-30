package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Book_equals_3695783711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;
     Object term1314;

    public Book_equals_3695783711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1277 = new Long(-6723783499250797216L);
        ArrayList term1291 = new ArrayList();
        Long term1296 = new Long(41775768178052008L);
        ArrayList term1310 = new ArrayList();
        term1276 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term1295 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1276, term1276.getClass(), "id", term1277);
        setField(term1276, term1276.getClass(), "name", "KoyGrUJeJW");
        setField(term1276, term1276.getClass(), "authors", term1291);
        setField(term1295, term1295.getClass(), "id", term1296);
        setField(term1295, term1295.getClass(), "name", "HqBOwkVqjD");
        setField(term1295, term1295.getClass(), "books", term1310);
        setField(term1276, term1276.getClass(), "category", term1295);
        term1314 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1314;
        callMethod(klass, "equals", argTypes, term1276, args);
    }

};


