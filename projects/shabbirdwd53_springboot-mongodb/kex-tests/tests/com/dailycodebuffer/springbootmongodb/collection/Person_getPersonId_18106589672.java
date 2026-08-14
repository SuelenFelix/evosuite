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

public class Person_getPersonId_18106589672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;

    public Person_getPersonId_18106589672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1108 = new Integer(1162663216);
        ArrayList term1110 = new ArrayList();
        ((ArrayList) term1110).add("uWHnvSvaPl");
        ((ArrayList) term1110).add("kBdSllIBVz");
        ((ArrayList) term1110).add("TJmVBGfTML");
        ((ArrayList) term1110).add("tPlsykYBqO");
        Object term1164 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1164, term1164.getClass(), "address1", "");
        setField(term1164, term1164.getClass(), "address2", "");
        setField(term1164, term1164.getClass(), "city", "");
        Object term1168 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1168, term1168.getClass(), "address1", "");
        setField(term1168, term1168.getClass(), "address2", "");
        setField(term1168, term1168.getClass(), "city", "");
        Object term1172 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1172, term1172.getClass(), "address1", "");
        setField(term1172, term1172.getClass(), "address2", "");
        setField(term1172, term1172.getClass(), "city", "");
        ArrayList term1162 = new ArrayList();
        ((ArrayList) term1162).add(term1164);
        ((ArrayList) term1162).add(term1168);
        ((ArrayList) term1162).add(term1172);
        term1071 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term1071, term1071.getClass(), "personId", "hoicvmsovO");
        setField(term1071, term1071.getClass(), "firstName", "eqJfYWRaEL");
        setField(term1071, term1071.getClass(), "lastName", "fhkbdRViHi");
        setField(term1071, term1071.getClass(), "age", term1108);
        setField(term1071, term1071.getClass(), "hobbies", term1110);
        setField(term1071, term1071.getClass(), "addresses", term1162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPersonId", argTypes, term1071, args);
    }

};


