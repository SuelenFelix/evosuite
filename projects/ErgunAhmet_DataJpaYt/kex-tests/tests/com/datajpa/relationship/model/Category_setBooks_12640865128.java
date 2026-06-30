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
import java.util.LinkedList;
import java.lang.Object;

public class Category_setBooks_12640865128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;
     Object term2556;

    public Category_setBooks_12640865128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2538 = new Long(-4393710401270724527L);
        ArrayList term2552 = new ArrayList();
        term2537 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2537, term2537.getClass(), "id", term2538);
        setField(term2537, term2537.getClass(), "name", "dpNsDgfPso");
        setField(term2537, term2537.getClass(), "books", term2552);
        Long term2560 = new Long(-4822736661741380518L);
        ArrayList term2574 = new ArrayList();
        Long term2579 = new Long(-5386201758403679145L);
        ArrayList term2582 = new ArrayList();
        Object term2559 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term2578 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2559, term2559.getClass(), "id", term2560);
        setField(term2559, term2559.getClass(), "name", "hCWPJQKpdc");
        setField(term2559, term2559.getClass(), "authors", term2574);
        setField(term2578, term2578.getClass(), "id", term2579);
        setField(term2578, term2578.getClass(), "name", "");
        setField(term2578, term2578.getClass(), "books", term2582);
        setField(term2559, term2559.getClass(), "category", term2578);
        term2556 = new LinkedList();
        ((LinkedList) term2556).add(term2559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2556;
        callMethod(klass, "setBooks", argTypes, term2537, args);
    }

};


