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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class Category_init_12896212510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2144;

    public Category_init_12896212510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2148 = new Long(-8033714905181142681L);
        ArrayList term2162 = new ArrayList();
        Long term2167 = new Long(-9040825890007374809L);
        ArrayList term2170 = new ArrayList();
        Object term2147 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term2166 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2147, term2147.getClass(), "id", term2148);
        setField(term2147, term2147.getClass(), "name", "xBsXSDjXYK");
        setField(term2147, term2147.getClass(), "authors", term2162);
        setField(term2166, term2166.getClass(), "id", term2167);
        setField(term2166, term2166.getClass(), "name", "");
        setField(term2166, term2166.getClass(), "books", term2170);
        setField(term2147, term2147.getClass(), "category", term2166);
        term2144 = new LinkedList();
        ((LinkedList) term2144).add(term2147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Category");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "qxSDVejjiY";
        args[1] = term2144;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


