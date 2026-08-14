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

public class Person_canEqual_67365283115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3315;
     Object term3454;

    public Person_canEqual_67365283115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3352 = new Integer(597278769);
        ArrayList term3354 = new ArrayList();
        ((ArrayList) term3354).add("qnvxzwuGKX");
        ((ArrayList) term3354).add("EdPAvpluZg");
        ((ArrayList) term3354).add("DzHVBMqWtE");
        ((ArrayList) term3354).add("THZSpzBRYP");
        ((ArrayList) term3354).add("ZfBIVGBQOE");
        ((ArrayList) term3354).add("QSrDQfEsTR");
        ((ArrayList) term3354).add("PsqusYmejD");
        Object term3444 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3444, term3444.getClass(), "address1", "");
        setField(term3444, term3444.getClass(), "address2", "");
        setField(term3444, term3444.getClass(), "city", "");
        Object term3448 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3448, term3448.getClass(), "address1", "");
        setField(term3448, term3448.getClass(), "address2", "");
        setField(term3448, term3448.getClass(), "city", "");
        ArrayList term3442 = new ArrayList();
        ((ArrayList) term3442).add(term3444);
        ((ArrayList) term3442).add(term3448);
        term3315 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term3315, term3315.getClass(), "personId", "yUGCjlqgJE");
        setField(term3315, term3315.getClass(), "firstName", "PXdVZyoJyC");
        setField(term3315, term3315.getClass(), "lastName", "vLerpqavFM");
        setField(term3315, term3315.getClass(), "age", term3352);
        setField(term3315, term3315.getClass(), "hobbies", term3354);
        setField(term3315, term3315.getClass(), "addresses", term3442);
        term3454 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3454;
        callMethod(klass, "canEqual", argTypes, term3315, args);
    }

};


