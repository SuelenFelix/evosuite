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

public class Person_PersonBuilder_hobbies_19037150535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5084;
     Object term5211;

    public Person_PersonBuilder_hobbies_19037150535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5121 = new Integer(-117576464);
        ArrayList term5123 = new ArrayList();
        ((ArrayList) term5123).add("wsysQLGFnl");
        ((ArrayList) term5123).add("ckQLZGFjMX");
        ((ArrayList) term5123).add("qphdrqUtNx");
        ((ArrayList) term5123).add("bwlLFAfNWx");
        ((ArrayList) term5123).add("JWodNQzjjV");
        ((ArrayList) term5123).add("CAgxWjhxNf");
        Object term5201 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5201, term5201.getClass(), "address1", "");
        setField(term5201, term5201.getClass(), "address2", "");
        setField(term5201, term5201.getClass(), "city", "");
        Object term5205 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5205, term5205.getClass(), "address1", "");
        setField(term5205, term5205.getClass(), "address2", "");
        setField(term5205, term5205.getClass(), "city", "");
        ArrayList term5199 = new ArrayList();
        ((ArrayList) term5199).add(term5201);
        ((ArrayList) term5199).add(term5205);
        term5084 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term5084, term5084.getClass(), "personId", "wwAwLLcLPp");
        setField(term5084, term5084.getClass(), "firstName", "nHpMKOmlpQ");
        setField(term5084, term5084.getClass(), "lastName", "fKhrQsJToZ");
        setField(term5084, term5084.getClass(), "age", term5121);
        setField(term5084, term5084.getClass(), "hobbies", term5123);
        setField(term5084, term5084.getClass(), "addresses", term5199);
        term5211 = new LinkedList();
        ((LinkedList) term5211).add("BYrGukTyof");
        ((LinkedList) term5211).add("jiCGTTzKGB");
        ((LinkedList) term5211).add("");
        ((LinkedList) term5211).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5211;
        callMethod(klass, "hobbies", argTypes, term5084, args);
    }

};


