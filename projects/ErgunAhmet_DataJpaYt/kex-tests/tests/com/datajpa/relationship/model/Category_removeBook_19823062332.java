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

public class Category_removeBook_19823062332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2281;
     Object term2300;

    public Category_removeBook_19823062332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2282 = new Long(7276637106827860087L);
        ArrayList term2296 = new ArrayList();
        term2281 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2281, term2281.getClass(), "id", term2282);
        setField(term2281, term2281.getClass(), "name", "SJiQaLvSKv");
        setField(term2281, term2281.getClass(), "books", term2296);
        Long term2301 = new Long(-3936701866695933852L);
        ArrayList term2315 = new ArrayList();
        Long term2320 = new Long(1215116475929634177L);
        ArrayList term2334 = new ArrayList();
        term2300 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term2319 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2300, term2300.getClass(), "id", term2301);
        setField(term2300, term2300.getClass(), "name", "OEXDRUKcFl");
        setField(term2300, term2300.getClass(), "authors", term2315);
        setField(term2319, term2319.getClass(), "id", term2320);
        setField(term2319, term2319.getClass(), "name", "RYdKCNNMBR");
        setField(term2319, term2319.getClass(), "books", term2334);
        setField(term2300, term2300.getClass(), "category", term2319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Book");
        Object[] args = new Object[1];
        args[0] = term2300;
        callMethod(klass, "removeBook", argTypes, term2281, args);
    }

};


