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

public class Person_getAddresses_13663839267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1994;

    public Person_getAddresses_13663839267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2031 = new Integer(-1955890973);
        ArrayList term2033 = new ArrayList();
        ((ArrayList) term2033).add("HWkpTmtlrc");
        ((ArrayList) term2033).add("hMmaoREuCK");
        ((ArrayList) term2033).add("VeDtgDzGAN");
        ((ArrayList) term2033).add("aWYOWZFyaX");
        ((ArrayList) term2033).add("BRIVNtfUWU");
        Object term2099 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2099, term2099.getClass(), "address1", "");
        setField(term2099, term2099.getClass(), "address2", "");
        setField(term2099, term2099.getClass(), "city", "");
        Object term2103 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2103, term2103.getClass(), "address1", "");
        setField(term2103, term2103.getClass(), "address2", "");
        setField(term2103, term2103.getClass(), "city", "");
        Object term2107 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2107, term2107.getClass(), "address1", "");
        setField(term2107, term2107.getClass(), "address2", "");
        setField(term2107, term2107.getClass(), "city", "");
        Object term2111 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2111, term2111.getClass(), "address1", "");
        setField(term2111, term2111.getClass(), "address2", "");
        setField(term2111, term2111.getClass(), "city", "");
        Object term2115 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2115, term2115.getClass(), "address1", "");
        setField(term2115, term2115.getClass(), "address2", "");
        setField(term2115, term2115.getClass(), "city", "");
        ArrayList term2097 = new ArrayList();
        ((ArrayList) term2097).add(term2099);
        ((ArrayList) term2097).add(term2103);
        ((ArrayList) term2097).add(term2107);
        ((ArrayList) term2097).add(term2111);
        ((ArrayList) term2097).add(term2115);
        term1994 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term1994, term1994.getClass(), "personId", "aNWLJdrZMq");
        setField(term1994, term1994.getClass(), "firstName", "HHmNoYxIGj");
        setField(term1994, term1994.getClass(), "lastName", "PtirvZmsGt");
        setField(term1994, term1994.getClass(), "age", term2031);
        setField(term1994, term1994.getClass(), "hobbies", term2033);
        setField(term1994, term1994.getClass(), "addresses", term2097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddresses", argTypes, term1994, args);
    }

};


