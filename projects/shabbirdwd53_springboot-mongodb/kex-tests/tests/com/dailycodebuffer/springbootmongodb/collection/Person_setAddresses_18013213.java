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
import java.util.LinkedList;

public class Person_setAddresses_18013213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3009;
     Object term3072;

    public Person_setAddresses_18013213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3046 = new Integer(-883034806);
        ArrayList term3048 = new ArrayList();
        ((ArrayList) term3048).add("OcfNzHYdki");
        Object term3066 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3066, term3066.getClass(), "address1", "");
        setField(term3066, term3066.getClass(), "address2", "");
        setField(term3066, term3066.getClass(), "city", "");
        ArrayList term3064 = new ArrayList();
        ((ArrayList) term3064).add(term3066);
        term3009 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term3009, term3009.getClass(), "personId", "zaloBqlrSo");
        setField(term3009, term3009.getClass(), "firstName", "vvoLrMGCoN");
        setField(term3009, term3009.getClass(), "lastName", "pXdglvyrQe");
        setField(term3009, term3009.getClass(), "age", term3046);
        setField(term3009, term3009.getClass(), "hobbies", term3048);
        setField(term3009, term3009.getClass(), "addresses", term3064);
        term3072 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3072;
        callMethod(klass, "setAddresses", argTypes, term3009, args);
    }

};


