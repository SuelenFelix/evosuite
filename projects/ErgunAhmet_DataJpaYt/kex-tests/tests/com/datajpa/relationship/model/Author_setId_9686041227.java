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
import java.lang.Object;
import java.util.ArrayList;

public class Author_setId_9686041227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3401;
     Object term3450;

    public Author_setId_9686041227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3402 = new Long(-4598158870068953328L);
        Long term3417 = new Long(138235087558060686L);
        Long term3432 = new Long(5381386339318883012L);
        ArrayList term3446 = new ArrayList();
        term3401 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3416 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3431 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3401, term3401.getClass(), "id", term3402);
        setField(term3401, term3401.getClass(), "name", "MwwjNtdOFT");
        setField(term3416, term3416.getClass(), "id", term3417);
        setField(term3416, term3416.getClass(), "name", "VYkqXKVlAJ");
        setField(term3431, term3431.getClass(), "id", term3432);
        setField(term3431, term3431.getClass(), "name", "XkIoWJRNwN");
        setField(term3416, term3416.getClass(), "city", term3431);
        setField(term3401, term3401.getClass(), "zipcode", term3416);
        setField(term3401, term3401.getClass(), "books", term3446);
        term3450 = new Long(-1333707622307134180L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3450;
        callMethod(klass, "setId", argTypes, term3401, args);
    }

};


