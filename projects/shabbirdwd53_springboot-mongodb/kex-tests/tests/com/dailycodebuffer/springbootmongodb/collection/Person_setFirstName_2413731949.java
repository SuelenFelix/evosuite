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

public class Person_setFirstName_2413731949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2356;

    public Person_setFirstName_2413731949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2393 = new Integer(1227103734);
        ArrayList term2395 = new ArrayList();
        ((ArrayList) term2395).add("wzsPSPcRdj");
        ArrayList term2411 = new ArrayList();
        term2356 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term2356, term2356.getClass(), "personId", "tRxZafjqIx");
        setField(term2356, term2356.getClass(), "firstName", "DhjNLmRMCu");
        setField(term2356, term2356.getClass(), "lastName", "PgPzMSEjjX");
        setField(term2356, term2356.getClass(), "age", term2393);
        setField(term2356, term2356.getClass(), "hobbies", term2395);
        setField(term2356, term2356.getClass(), "addresses", term2411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setFirstName", argTypes, term2356, args);
    }

};


