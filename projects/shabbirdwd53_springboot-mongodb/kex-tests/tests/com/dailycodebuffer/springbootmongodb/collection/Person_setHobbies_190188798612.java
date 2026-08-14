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
import java.util.LinkedList;

public class Person_setHobbies_190188798612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2871;
     Object term2966;

    public Person_setHobbies_190188798612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2908 = new Integer(1134449235);
        ArrayList term2910 = new ArrayList();
        ((ArrayList) term2910).add("WVRMUmrljA");
        Object term2928 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2928, term2928.getClass(), "address1", "");
        setField(term2928, term2928.getClass(), "address2", "");
        setField(term2928, term2928.getClass(), "city", "");
        Object term2932 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2932, term2932.getClass(), "address1", "");
        setField(term2932, term2932.getClass(), "address2", "");
        setField(term2932, term2932.getClass(), "city", "");
        Object term2936 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2936, term2936.getClass(), "address1", "");
        setField(term2936, term2936.getClass(), "address2", "");
        setField(term2936, term2936.getClass(), "city", "");
        Object term2940 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2940, term2940.getClass(), "address1", "");
        setField(term2940, term2940.getClass(), "address2", "");
        setField(term2940, term2940.getClass(), "city", "");
        Object term2944 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2944, term2944.getClass(), "address1", "");
        setField(term2944, term2944.getClass(), "address2", "");
        setField(term2944, term2944.getClass(), "city", "");
        Object term2948 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2948, term2948.getClass(), "address1", "");
        setField(term2948, term2948.getClass(), "address2", "");
        setField(term2948, term2948.getClass(), "city", "");
        Object term2952 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2952, term2952.getClass(), "address1", "");
        setField(term2952, term2952.getClass(), "address2", "");
        setField(term2952, term2952.getClass(), "city", "");
        Object term2956 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2956, term2956.getClass(), "address1", "");
        setField(term2956, term2956.getClass(), "address2", "");
        setField(term2956, term2956.getClass(), "city", "");
        Object term2960 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term2960, term2960.getClass(), "address1", "");
        setField(term2960, term2960.getClass(), "address2", "");
        setField(term2960, term2960.getClass(), "city", "");
        ArrayList term2926 = new ArrayList();
        ((ArrayList) term2926).add(term2928);
        ((ArrayList) term2926).add(term2932);
        ((ArrayList) term2926).add(term2936);
        ((ArrayList) term2926).add(term2940);
        ((ArrayList) term2926).add(term2944);
        ((ArrayList) term2926).add(term2948);
        ((ArrayList) term2926).add(term2952);
        ((ArrayList) term2926).add(term2956);
        ((ArrayList) term2926).add(term2960);
        term2871 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term2871, term2871.getClass(), "personId", "PqtVXXZMqK");
        setField(term2871, term2871.getClass(), "firstName", "rYbtIDVdnd");
        setField(term2871, term2871.getClass(), "lastName", "UKAReurpHG");
        setField(term2871, term2871.getClass(), "age", term2908);
        setField(term2871, term2871.getClass(), "hobbies", term2910);
        setField(term2871, term2871.getClass(), "addresses", term2926);
        term2966 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2966;
        callMethod(klass, "setHobbies", argTypes, term2871, args);
    }

};


