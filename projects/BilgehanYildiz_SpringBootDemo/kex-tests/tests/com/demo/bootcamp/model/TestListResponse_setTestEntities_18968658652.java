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
import java.util.LinkedList;

public class TestListResponse_setTestEntities_18968658652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;
     Object term837;

    public TestListResponse_setTestEntities_18968658652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term819 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term819, term819.getClass(), "id", 1622346318);
        setField(term819, term819.getClass(), "name", "");
        setField(term819, term819.getClass(), "info", "");
        Object term823 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term823, term823.getClass(), "id", 1048535127);
        setField(term823, term823.getClass(), "name", "");
        setField(term823, term823.getClass(), "info", "");
        Object term827 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term827, term827.getClass(), "id", -655067527);
        setField(term827, term827.getClass(), "name", "");
        setField(term827, term827.getClass(), "info", "");
        Object term831 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term831, term831.getClass(), "id", -6029667);
        setField(term831, term831.getClass(), "name", "");
        setField(term831, term831.getClass(), "info", "");
        ArrayList term817 = new ArrayList();
        ((ArrayList) term817).add(term819);
        ((ArrayList) term817).add(term823);
        ((ArrayList) term817).add(term827);
        ((ArrayList) term817).add(term831);
        term816 = newInstance(Class.forName("com.demo.bootcamp.model.TestListResponse"));
        setField(term816, term816.getClass(), "testEntities", term817);
        term837 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.model.TestListResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term837;
        callMethod(klass, "setTestEntities", argTypes, term816, args);
    }

};


