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

public class Book_canEqual_76720479212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1335;
     Object term1373;

    public Book_canEqual_76720479212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1336 = new Long(6682528376118987775L);
        ArrayList term1350 = new ArrayList();
        Long term1355 = new Long(682356318767179819L);
        ArrayList term1369 = new ArrayList();
        term1335 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term1354 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1335, term1335.getClass(), "id", term1336);
        setField(term1335, term1335.getClass(), "name", "MAcUBcBckh");
        setField(term1335, term1335.getClass(), "authors", term1350);
        setField(term1354, term1354.getClass(), "id", term1355);
        setField(term1354, term1354.getClass(), "name", "oVgzLbrsFr");
        setField(term1354, term1354.getClass(), "books", term1369);
        setField(term1335, term1335.getClass(), "category", term1354);
        term1373 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1373;
        callMethod(klass, "canEqual", argTypes, term1335, args);
    }

};


