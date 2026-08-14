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

public class Person_PersonBuilder_lastName_14177244193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4750;

    public Person_PersonBuilder_lastName_14177244193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4787 = new Integer(-655067527);
        ArrayList term4789 = new ArrayList();
        Object term4795 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4795, term4795.getClass(), "address1", "");
        setField(term4795, term4795.getClass(), "address2", "");
        setField(term4795, term4795.getClass(), "city", "");
        Object term4799 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4799, term4799.getClass(), "address1", "");
        setField(term4799, term4799.getClass(), "address2", "");
        setField(term4799, term4799.getClass(), "city", "");
        Object term4803 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4803, term4803.getClass(), "address1", "");
        setField(term4803, term4803.getClass(), "address2", "");
        setField(term4803, term4803.getClass(), "city", "");
        Object term4807 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4807, term4807.getClass(), "address1", "");
        setField(term4807, term4807.getClass(), "address2", "");
        setField(term4807, term4807.getClass(), "city", "");
        Object term4811 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4811, term4811.getClass(), "address1", "");
        setField(term4811, term4811.getClass(), "address2", "");
        setField(term4811, term4811.getClass(), "city", "");
        Object term4815 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4815, term4815.getClass(), "address1", "");
        setField(term4815, term4815.getClass(), "address2", "");
        setField(term4815, term4815.getClass(), "city", "");
        Object term4819 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4819, term4819.getClass(), "address1", "");
        setField(term4819, term4819.getClass(), "address2", "");
        setField(term4819, term4819.getClass(), "city", "");
        Object term4823 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4823, term4823.getClass(), "address1", "");
        setField(term4823, term4823.getClass(), "address2", "");
        setField(term4823, term4823.getClass(), "city", "");
        Object term4827 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4827, term4827.getClass(), "address1", "");
        setField(term4827, term4827.getClass(), "address2", "");
        setField(term4827, term4827.getClass(), "city", "");
        ArrayList term4793 = new ArrayList();
        ((ArrayList) term4793).add(term4795);
        ((ArrayList) term4793).add(term4799);
        ((ArrayList) term4793).add(term4803);
        ((ArrayList) term4793).add(term4807);
        ((ArrayList) term4793).add(term4811);
        ((ArrayList) term4793).add(term4815);
        ((ArrayList) term4793).add(term4819);
        ((ArrayList) term4793).add(term4823);
        ((ArrayList) term4793).add(term4827);
        term4750 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term4750, term4750.getClass(), "personId", "BJhjdJUhkz");
        setField(term4750, term4750.getClass(), "firstName", "cdHYQDgUZR");
        setField(term4750, term4750.getClass(), "lastName", "KAORSSPSeV");
        setField(term4750, term4750.getClass(), "age", term4787);
        setField(term4750, term4750.getClass(), "hobbies", term4789);
        setField(term4750, term4750.getClass(), "addresses", term4793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ubodzJoMGW";
        callMethod(klass, "lastName", argTypes, term4750, args);
    }

};


