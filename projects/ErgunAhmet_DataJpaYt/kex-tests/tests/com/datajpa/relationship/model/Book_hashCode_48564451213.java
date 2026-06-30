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

public class Book_hashCode_48564451213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394;

    public Book_hashCode_48564451213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1395 = new Long(-7291743527973326814L);
        ArrayList term1409 = new ArrayList();
        Long term1414 = new Long(-5963439350418910964L);
        ArrayList term1428 = new ArrayList();
        term1394 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term1413 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1394, term1394.getClass(), "id", term1395);
        setField(term1394, term1394.getClass(), "name", "vQVyKLdtaz");
        setField(term1394, term1394.getClass(), "authors", term1409);
        setField(term1413, term1413.getClass(), "id", term1414);
        setField(term1413, term1413.getClass(), "name", "OWKQODBLzb");
        setField(term1413, term1413.getClass(), "books", term1428);
        setField(term1394, term1394.getClass(), "category", term1413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1394, args);
    }

};


