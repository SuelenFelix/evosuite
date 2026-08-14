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

public class Person_getLastName_13837513524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417;

    public Person_getLastName_13837513524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1454 = new Integer(391863371);
        ArrayList term1456 = new ArrayList();
        ((ArrayList) term1456).add("xOcJIiQQDu");
        ((ArrayList) term1456).add("GVizqqzXpy");
        ((ArrayList) term1456).add("JqXGgAhZPl");
        ((ArrayList) term1456).add("jiKYgYHqIS");
        ((ArrayList) term1456).add("DfISiziTgG");
        ((ArrayList) term1456).add("XqgfKFvPSD");
        Object term1534 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1534, term1534.getClass(), "address1", "");
        setField(term1534, term1534.getClass(), "address2", "");
        setField(term1534, term1534.getClass(), "city", "");
        Object term1538 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1538, term1538.getClass(), "address1", "");
        setField(term1538, term1538.getClass(), "address2", "");
        setField(term1538, term1538.getClass(), "city", "");
        ArrayList term1532 = new ArrayList();
        ((ArrayList) term1532).add(term1534);
        ((ArrayList) term1532).add(term1538);
        term1417 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term1417, term1417.getClass(), "personId", "PkWMRdJcBb");
        setField(term1417, term1417.getClass(), "firstName", "jSpAteRute");
        setField(term1417, term1417.getClass(), "lastName", "swZVeJAxjt");
        setField(term1417, term1417.getClass(), "age", term1454);
        setField(term1417, term1417.getClass(), "hobbies", term1456);
        setField(term1417, term1417.getClass(), "addresses", term1532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1417, args);
    }

};


