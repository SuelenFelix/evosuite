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

public class Person_setPersonId_2243165278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2201;

    public Person_setPersonId_2243165278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2238 = new Integer(-2038273078);
        ArrayList term2240 = new ArrayList();
        ((ArrayList) term2240).add("VGizxZnyHX");
        ((ArrayList) term2240).add("kVEZMHmRtR");
        Object term2270 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2270, term2270.getClass(), "address1", "");
        setField(term2270, term2270.getClass(), "address2", "");
        setField(term2270, term2270.getClass(), "city", "");
        Object term2274 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2274, term2274.getClass(), "address1", "");
        setField(term2274, term2274.getClass(), "address2", "");
        setField(term2274, term2274.getClass(), "city", "");
        Object term2278 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2278, term2278.getClass(), "address1", "");
        setField(term2278, term2278.getClass(), "address2", "");
        setField(term2278, term2278.getClass(), "city", "");
        ArrayList term2268 = new ArrayList();
        ((ArrayList) term2268).add(term2270);
        ((ArrayList) term2268).add(term2274);
        ((ArrayList) term2268).add(term2278);
        term2201 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term2201, term2201.getClass(), "personId", "jXzmYyrnnT");
        setField(term2201, term2201.getClass(), "firstName", "igCAtimmYB");
        setField(term2201, term2201.getClass(), "lastName", "DyiXbeYIaN");
        setField(term2201, term2201.getClass(), "age", term2238);
        setField(term2201, term2201.getClass(), "hobbies", term2240);
        setField(term2201, term2201.getClass(), "addresses", term2268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "setPersonId", argTypes, term2201, args);
    }

};


