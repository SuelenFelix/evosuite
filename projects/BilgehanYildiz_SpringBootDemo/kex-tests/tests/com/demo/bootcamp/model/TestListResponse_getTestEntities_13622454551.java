package com.demo.bootcamp.model;

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
import static com.demo.bootcamp.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TestListResponse_getTestEntities_13622454551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791;

    public TestListResponse_getTestEntities_13622454551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term794 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term794, term794.getClass(), "id", -883034806);
        setField(term794, term794.getClass(), "name", "");
        setField(term794, term794.getClass(), "info", "");
        Object term798 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term798, term798.getClass(), "id", 1585847225);
        setField(term798, term798.getClass(), "name", "");
        setField(term798, term798.getClass(), "info", "");
        Object term802 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term802, term802.getClass(), "id", 597278769);
        setField(term802, term802.getClass(), "name", "");
        setField(term802, term802.getClass(), "info", "");
        Object term806 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term806, term806.getClass(), "id", -1685132342);
        setField(term806, term806.getClass(), "name", "");
        setField(term806, term806.getClass(), "info", "");
        Object term810 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term810, term810.getClass(), "id", -1456670397);
        setField(term810, term810.getClass(), "name", "");
        setField(term810, term810.getClass(), "info", "");
        ArrayList term792 = new ArrayList();
        ((ArrayList) term792).add(term794);
        ((ArrayList) term792).add(term798);
        ((ArrayList) term792).add(term802);
        ((ArrayList) term792).add(term806);
        ((ArrayList) term792).add(term810);
        term791 = newInstance(Class.forName("com.demo.bootcamp.model.TestListResponse"));
        setField(term791, term791.getClass(), "testEntities", term792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.model.TestListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestEntities", argTypes, term791, args);
    }

};


