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
import java.util.LinkedList;

public class Person_PersonBuilder_addresses_1459697336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5353;
     Object term5448;

    public Person_PersonBuilder_addresses_1459697336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5390 = new Integer(-1007160944);
        ArrayList term5392 = new ArrayList();
        ((ArrayList) term5392).add("vLTbaoAxBm");
        ((ArrayList) term5392).add("BXTjEyEZxD");
        ((ArrayList) term5392).add("oKhVzOKUFW");
        ((ArrayList) term5392).add("mNHyqmOAFy");
        ArrayList term5444 = new ArrayList();
        term5353 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term5353, term5353.getClass(), "personId", "FiYYLuailz");
        setField(term5353, term5353.getClass(), "firstName", "XebAeSnCKZ");
        setField(term5353, term5353.getClass(), "lastName", "GeddnXjHGy");
        setField(term5353, term5353.getClass(), "age", term5390);
        setField(term5353, term5353.getClass(), "hobbies", term5392);
        setField(term5353, term5353.getClass(), "addresses", term5444);
        term5448 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5448;
        callMethod(klass, "addresses", argTypes, term5353, args);
    }

};


