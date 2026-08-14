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

public class Person_setLastName_132487350410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2477;

    public Person_setLastName_132487350410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2514 = new Integer(-1339778481);
        ArrayList term2516 = new ArrayList();
        ((ArrayList) term2516).add("nhoHrZfnIN");
        ((ArrayList) term2516).add("ZkMALXpEAZ");
        Object term2546 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2546, term2546.getClass(), "address1", "");
        setField(term2546, term2546.getClass(), "address2", "");
        setField(term2546, term2546.getClass(), "city", "");
        Object term2550 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2550, term2550.getClass(), "address1", "");
        setField(term2550, term2550.getClass(), "address2", "");
        setField(term2550, term2550.getClass(), "city", "");
        Object term2554 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2554, term2554.getClass(), "address1", "");
        setField(term2554, term2554.getClass(), "address2", "");
        setField(term2554, term2554.getClass(), "city", "");
        Object term2558 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2558, term2558.getClass(), "address1", "");
        setField(term2558, term2558.getClass(), "address2", "");
        setField(term2558, term2558.getClass(), "city", "");
        Object term2562 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2562, term2562.getClass(), "address1", "");
        setField(term2562, term2562.getClass(), "address2", "");
        setField(term2562, term2562.getClass(), "city", "");
        Object term2566 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2566, term2566.getClass(), "address1", "");
        setField(term2566, term2566.getClass(), "address2", "");
        setField(term2566, term2566.getClass(), "city", "");
        Object term2570 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2570, term2570.getClass(), "address1", "");
        setField(term2570, term2570.getClass(), "address2", "");
        setField(term2570, term2570.getClass(), "city", "");
        Object term2574 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2574, term2574.getClass(), "address1", "");
        setField(term2574, term2574.getClass(), "address2", "");
        setField(term2574, term2574.getClass(), "city", "");
        ArrayList term2544 = new ArrayList();
        ((ArrayList) term2544).add(term2546);
        ((ArrayList) term2544).add(term2550);
        ((ArrayList) term2544).add(term2554);
        ((ArrayList) term2544).add(term2558);
        ((ArrayList) term2544).add(term2562);
        ((ArrayList) term2544).add(term2566);
        ((ArrayList) term2544).add(term2570);
        ((ArrayList) term2544).add(term2574);
        term2477 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term2477, term2477.getClass(), "personId", "XJJNClzHRf");
        setField(term2477, term2477.getClass(), "firstName", "HDaezxQfQR");
        setField(term2477, term2477.getClass(), "lastName", "iikZEapDlu");
        setField(term2477, term2477.getClass(), "age", term2514);
        setField(term2477, term2477.getClass(), "hobbies", term2516);
        setField(term2477, term2477.getClass(), "addresses", term2544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TwfWVQGiIj";
        callMethod(klass, "setLastName", argTypes, term2477, args);
    }

};


