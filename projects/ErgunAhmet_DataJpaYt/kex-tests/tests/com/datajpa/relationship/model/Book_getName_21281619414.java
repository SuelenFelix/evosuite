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

public class Book_getName_21281619414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;

    public Book_getName_21281619414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term724 = new Long(1439298019805881866L);
        ArrayList term738 = new ArrayList();
        Long term743 = new Long(-8708192233349544946L);
        ArrayList term757 = new ArrayList();
        term723 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term742 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term723, term723.getClass(), "id", term724);
        setField(term723, term723.getClass(), "name", "aKnKipADSo");
        setField(term723, term723.getClass(), "authors", term738);
        setField(term742, term742.getClass(), "id", term743);
        setField(term742, term742.getClass(), "name", "wSQxaModmm");
        setField(term742, term742.getClass(), "books", term757);
        setField(term723, term723.getClass(), "category", term742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term723, args);
    }

};


