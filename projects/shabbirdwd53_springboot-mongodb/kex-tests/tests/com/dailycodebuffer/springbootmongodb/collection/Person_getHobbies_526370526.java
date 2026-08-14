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

public class Person_getHobbies_526370526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1871;

    public Person_getHobbies_526370526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1908 = new Integer(-616727354);
        ArrayList term1910 = new ArrayList();
        ((ArrayList) term1910).add("wfaXBpWAUH");
        Object term1928 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1928, term1928.getClass(), "address1", "");
        setField(term1928, term1928.getClass(), "address2", "");
        setField(term1928, term1928.getClass(), "city", "");
        Object term1932 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1932, term1932.getClass(), "address1", "");
        setField(term1932, term1932.getClass(), "address2", "");
        setField(term1932, term1932.getClass(), "city", "");
        Object term1936 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1936, term1936.getClass(), "address1", "");
        setField(term1936, term1936.getClass(), "address2", "");
        setField(term1936, term1936.getClass(), "city", "");
        Object term1940 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1940, term1940.getClass(), "address1", "");
        setField(term1940, term1940.getClass(), "address2", "");
        setField(term1940, term1940.getClass(), "city", "");
        Object term1944 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1944, term1944.getClass(), "address1", "");
        setField(term1944, term1944.getClass(), "address2", "");
        setField(term1944, term1944.getClass(), "city", "");
        Object term1948 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1948, term1948.getClass(), "address1", "");
        setField(term1948, term1948.getClass(), "address2", "");
        setField(term1948, term1948.getClass(), "city", "");
        ArrayList term1926 = new ArrayList();
        ((ArrayList) term1926).add(term1928);
        ((ArrayList) term1926).add(term1932);
        ((ArrayList) term1926).add(term1936);
        ((ArrayList) term1926).add(term1940);
        ((ArrayList) term1926).add(term1944);
        ((ArrayList) term1926).add(term1948);
        term1871 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term1871, term1871.getClass(), "personId", "EYtfuJaxiM");
        setField(term1871, term1871.getClass(), "firstName", "gCWtLVKVVe");
        setField(term1871, term1871.getClass(), "lastName", "fWKJoSoCwE");
        setField(term1871, term1871.getClass(), "age", term1908);
        setField(term1871, term1871.getClass(), "hobbies", term1910);
        setField(term1871, term1871.getClass(), "addresses", term1926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHobbies", argTypes, term1871, args);
    }

};


