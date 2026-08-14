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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Person_setAge_104052634711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2652;
     Object term2779;

    public Person_setAge_104052634711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2689 = new Integer(1725571209);
        ArrayList term2691 = new ArrayList();
        ((ArrayList) term2691).add("xvkbvaEGYd");
        ((ArrayList) term2691).add("HBGNxdNURv");
        ((ArrayList) term2691).add("mfCpTPPQQm");
        ((ArrayList) term2691).add("OcJCIDNIXA");
        ((ArrayList) term2691).add("XfRABIFVEp");
        ((ArrayList) term2691).add("MHGKyEnwKc");
        Object term2769 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2769, term2769.getClass(), "address1", "");
        setField(term2769, term2769.getClass(), "address2", "");
        setField(term2769, term2769.getClass(), "city", "");
        Object term2773 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2773, term2773.getClass(), "address1", "");
        setField(term2773, term2773.getClass(), "address2", "");
        setField(term2773, term2773.getClass(), "city", "");
        ArrayList term2767 = new ArrayList();
        ((ArrayList) term2767).add(term2769);
        ((ArrayList) term2767).add(term2773);
        term2652 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term2652, term2652.getClass(), "personId", "gUvcueTURF");
        setField(term2652, term2652.getClass(), "firstName", "EwQBhZjCIT");
        setField(term2652, term2652.getClass(), "lastName", "aSkmSwTnEw");
        setField(term2652, term2652.getClass(), "age", term2689);
        setField(term2652, term2652.getClass(), "hobbies", term2691);
        setField(term2652, term2652.getClass(), "addresses", term2767);
        term2779 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2779;
        callMethod(klass, "setAge", argTypes, term2652, args);
    }

};


