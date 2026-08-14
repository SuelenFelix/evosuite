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

public class Person_getFirstName_4041306343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;

    public Person_getFirstName_4041306343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1285 = new Integer(1484323161);
        ArrayList term1287 = new ArrayList();
        ((ArrayList) term1287).add("VgZnGoIFwQ");
        ((ArrayList) term1287).add("jUbSRrkrYZ");
        ((ArrayList) term1287).add("bWWfajKbEX");
        ((ArrayList) term1287).add("cAPeiZHKGJ");
        Object term1341 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1341, term1341.getClass(), "address1", "");
        setField(term1341, term1341.getClass(), "address2", "");
        setField(term1341, term1341.getClass(), "city", "");
        ArrayList term1339 = new ArrayList();
        ((ArrayList) term1339).add(term1341);
        term1248 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term1248, term1248.getClass(), "personId", "OWKQODBLzb");
        setField(term1248, term1248.getClass(), "firstName", "wGmYcqUkgE");
        setField(term1248, term1248.getClass(), "lastName", "idgaQsnJpQ");
        setField(term1248, term1248.getClass(), "age", term1285);
        setField(term1248, term1248.getClass(), "hobbies", term1287);
        setField(term1248, term1248.getClass(), "addresses", term1339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term1248, args);
    }

};


