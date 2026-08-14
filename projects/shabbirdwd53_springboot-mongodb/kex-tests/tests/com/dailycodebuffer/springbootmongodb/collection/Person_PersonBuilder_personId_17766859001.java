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

public class Person_PersonBuilder_personId_17766859001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4352;

    public Person_PersonBuilder_personId_17766859001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4389 = new Integer(1622346318);
        ArrayList term4391 = new ArrayList();
        ((ArrayList) term4391).add("NFlvfJCVPO");
        ((ArrayList) term4391).add("KarbTXFmUU");
        ((ArrayList) term4391).add("jiUSjqwSIQ");
        Object term4433 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4433, term4433.getClass(), "address1", "");
        setField(term4433, term4433.getClass(), "address2", "");
        setField(term4433, term4433.getClass(), "city", "");
        Object term4437 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4437, term4437.getClass(), "address1", "");
        setField(term4437, term4437.getClass(), "address2", "");
        setField(term4437, term4437.getClass(), "city", "");
        Object term4441 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4441, term4441.getClass(), "address1", "");
        setField(term4441, term4441.getClass(), "address2", "");
        setField(term4441, term4441.getClass(), "city", "");
        Object term4445 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4445, term4445.getClass(), "address1", "");
        setField(term4445, term4445.getClass(), "address2", "");
        setField(term4445, term4445.getClass(), "city", "");
        Object term4449 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4449, term4449.getClass(), "address1", "");
        setField(term4449, term4449.getClass(), "address2", "");
        setField(term4449, term4449.getClass(), "city", "");
        ArrayList term4431 = new ArrayList();
        ((ArrayList) term4431).add(term4433);
        ((ArrayList) term4431).add(term4437);
        ((ArrayList) term4431).add(term4441);
        ((ArrayList) term4431).add(term4445);
        ((ArrayList) term4431).add(term4449);
        term4352 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term4352, term4352.getClass(), "personId", "KSJeYkkvpk");
        setField(term4352, term4352.getClass(), "firstName", "qUtkFGMNUV");
        setField(term4352, term4352.getClass(), "lastName", "mGRiYhnMcR");
        setField(term4352, term4352.getClass(), "age", term4389);
        setField(term4352, term4352.getClass(), "hobbies", term4391);
        setField(term4352, term4352.getClass(), "addresses", term4431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zjZYTddemL";
        callMethod(klass, "personId", argTypes, term4352, args);
    }

};


