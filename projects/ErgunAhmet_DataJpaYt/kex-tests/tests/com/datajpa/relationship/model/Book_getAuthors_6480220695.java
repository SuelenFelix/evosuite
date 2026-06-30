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

public class Book_getAuthors_6480220695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public Book_getAuthors_6480220695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term782 = new Long(5907001541142728739L);
        ArrayList term796 = new ArrayList();
        Long term801 = new Long(4178434741742309755L);
        ArrayList term815 = new ArrayList();
        term781 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term800 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term781, term781.getClass(), "id", term782);
        setField(term781, term781.getClass(), "name", "UlajhuVLaP");
        setField(term781, term781.getClass(), "authors", term796);
        setField(term800, term800.getClass(), "id", term801);
        setField(term800, term800.getClass(), "name", "gGSMzuGICf");
        setField(term800, term800.getClass(), "books", term815);
        setField(term781, term781.getClass(), "category", term800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthors", argTypes, term781, args);
    }

};


