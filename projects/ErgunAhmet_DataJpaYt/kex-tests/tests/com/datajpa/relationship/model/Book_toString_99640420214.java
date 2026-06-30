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

public class Book_toString_99640420214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1452;

    public Book_toString_99640420214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1453 = new Long(9013624480170062917L);
        ArrayList term1467 = new ArrayList();
        Long term1472 = new Long(7862575738391801707L);
        ArrayList term1486 = new ArrayList();
        term1452 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term1471 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1452, term1452.getClass(), "id", term1453);
        setField(term1452, term1452.getClass(), "name", "wGmYcqUkgE");
        setField(term1452, term1452.getClass(), "authors", term1467);
        setField(term1471, term1471.getClass(), "id", term1472);
        setField(term1471, term1471.getClass(), "name", "idgaQsnJpQ");
        setField(term1471, term1471.getClass(), "books", term1486);
        setField(term1452, term1452.getClass(), "category", term1471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1452, args);
    }

};


