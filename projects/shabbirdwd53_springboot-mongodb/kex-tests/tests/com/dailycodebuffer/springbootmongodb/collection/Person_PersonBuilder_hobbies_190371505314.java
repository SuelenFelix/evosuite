package com.dailycodebuffer.springbootmongodb.collection;

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
import static com.dailycodebuffer.springbootmongodb.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Person_PersonBuilder_hobbies_190371505314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6057;

    public Person_PersonBuilder_hobbies_190371505314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6057 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term6057, term6057.getClass(), "personId", null);
        setField(term6057, term6057.getClass(), "firstName", null);
        setField(term6057, term6057.getClass(), "lastName", null);
        setField(term6057, term6057.getClass(), "age", null);
        setField(term6057, term6057.getClass(), "hobbies", null);
        setField(term6057, term6057.getClass(), "addresses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hobbies", argTypes, term6057, args);
    }

};


