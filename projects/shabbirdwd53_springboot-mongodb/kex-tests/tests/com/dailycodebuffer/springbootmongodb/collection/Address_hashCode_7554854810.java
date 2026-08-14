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

public class Address_hashCode_7554854810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;

    public Address_hashCode_7554854810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term671, term671.getClass(), "address1", "OWDIEULEFu");
        setField(term671, term671.getClass(), "address2", "dWRymuLBtr");
        setField(term671, term671.getClass(), "city", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term671, args);
    }

};


