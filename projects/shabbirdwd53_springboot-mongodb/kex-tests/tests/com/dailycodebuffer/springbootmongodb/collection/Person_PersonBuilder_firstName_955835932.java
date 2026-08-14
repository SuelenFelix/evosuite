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

public class Person_PersonBuilder_firstName_955835932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4537;

    public Person_PersonBuilder_firstName_955835932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4574 = new Integer(1048535127);
        ArrayList term4576 = new ArrayList();
        ((ArrayList) term4576).add("CVRGEomOth");
        ((ArrayList) term4576).add("vSeruUyNWX");
        ((ArrayList) term4576).add("UkKvaeJfEC");
        ((ArrayList) term4576).add("WPxXsahPRq");
        ((ArrayList) term4576).add("IENRuqmwUU");
        Object term4642 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4642, term4642.getClass(), "address1", "");
        setField(term4642, term4642.getClass(), "address2", "");
        setField(term4642, term4642.getClass(), "city", "");
        ArrayList term4640 = new ArrayList();
        ((ArrayList) term4640).add(term4642);
        term4537 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term4537, term4537.getClass(), "personId", "QtrylgCLiF");
        setField(term4537, term4537.getClass(), "firstName", "orEuhCStGM");
        setField(term4537, term4537.getClass(), "lastName", "HhEaSXWvrY");
        setField(term4537, term4537.getClass(), "age", term4574);
        setField(term4537, term4537.getClass(), "hobbies", term4576);
        setField(term4537, term4537.getClass(), "addresses", term4640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uXYcXVYJZM";
        callMethod(klass, "firstName", argTypes, term4537, args);
    }

};


