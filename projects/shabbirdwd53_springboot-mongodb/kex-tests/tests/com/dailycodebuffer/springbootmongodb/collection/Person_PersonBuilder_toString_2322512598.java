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

public class Person_PersonBuilder_toString_2322512598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5810;

    public Person_PersonBuilder_toString_2322512598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5847 = new Integer(590364439);
        ArrayList term5849 = new ArrayList();
        ((ArrayList) term5849).add("TcuXODkzBV");
        ((ArrayList) term5849).add("coJPjrBZNe");
        ((ArrayList) term5849).add("vMsWjuPTnO");
        ((ArrayList) term5849).add("zHvfKaOstO");
        ((ArrayList) term5849).add("tOszriqETr");
        ((ArrayList) term5849).add("ncSPTkhKjO");
        ((ArrayList) term5849).add("jcWKHRWhyj");
        Object term5939 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5939, term5939.getClass(), "address1", "");
        setField(term5939, term5939.getClass(), "address2", "");
        setField(term5939, term5939.getClass(), "city", "");
        Object term5943 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5943, term5943.getClass(), "address1", "");
        setField(term5943, term5943.getClass(), "address2", "");
        setField(term5943, term5943.getClass(), "city", "");
        Object term5947 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5947, term5947.getClass(), "address1", "");
        setField(term5947, term5947.getClass(), "address2", "");
        setField(term5947, term5947.getClass(), "city", "");
        ArrayList term5937 = new ArrayList();
        ((ArrayList) term5937).add(term5939);
        ((ArrayList) term5937).add(term5943);
        ((ArrayList) term5937).add(term5947);
        term5810 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term5810, term5810.getClass(), "personId", "EKpdCBubDE");
        setField(term5810, term5810.getClass(), "firstName", "zMsSLTfGhl");
        setField(term5810, term5810.getClass(), "lastName", "bEmHScVZaQ");
        setField(term5810, term5810.getClass(), "age", term5847);
        setField(term5810, term5810.getClass(), "hobbies", term5849);
        setField(term5810, term5810.getClass(), "addresses", term5937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5810, args);
    }

};


