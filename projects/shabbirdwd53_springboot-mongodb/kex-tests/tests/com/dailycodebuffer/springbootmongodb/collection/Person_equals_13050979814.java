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

public class Person_equals_13050979814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115;
     Object term3234;

    public Person_equals_13050979814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3152 = new Integer(1585847225);
        ArrayList term3154 = new ArrayList();
        ((ArrayList) term3154).add("MYWYUeLGOp");
        ((ArrayList) term3154).add("tsTGdgQYUL");
        ((ArrayList) term3154).add("TtGbVmKcnX");
        ((ArrayList) term3154).add("GJVkUrCVdD");
        ((ArrayList) term3154).add("zNdorvdUgu");
        Object term3220 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3220, term3220.getClass(), "address1", "");
        setField(term3220, term3220.getClass(), "address2", "");
        setField(term3220, term3220.getClass(), "city", "");
        Object term3224 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3224, term3224.getClass(), "address1", "");
        setField(term3224, term3224.getClass(), "address2", "");
        setField(term3224, term3224.getClass(), "city", "");
        Object term3228 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3228, term3228.getClass(), "address1", "");
        setField(term3228, term3228.getClass(), "address2", "");
        setField(term3228, term3228.getClass(), "city", "");
        ArrayList term3218 = new ArrayList();
        ((ArrayList) term3218).add(term3220);
        ((ArrayList) term3218).add(term3224);
        ((ArrayList) term3218).add(term3228);
        term3115 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term3115, term3115.getClass(), "personId", "FjOiNAfBOc");
        setField(term3115, term3115.getClass(), "firstName", "iCCsaLHohG");
        setField(term3115, term3115.getClass(), "lastName", "NJhGgctbdj");
        setField(term3115, term3115.getClass(), "age", term3152);
        setField(term3115, term3115.getClass(), "hobbies", term3154);
        setField(term3115, term3115.getClass(), "addresses", term3218);
        term3234 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3234;
        callMethod(klass, "equals", argTypes, term3115, args);
    }

};


