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

public class Address_AddressBuilder_address2_10820851782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4035;

    public Address_AddressBuilder_address2_10820851782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4035 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address$AddressBuilder"));
        setField(term4035, term4035.getClass(), "address1", "eOJfbiZLnb");
        setField(term4035, term4035.getClass(), "address2", "nKZKnxWYCK");
        setField(term4035, term4035.getClass(), "city", "JOqQxuzRuZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address$AddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RSaoipUlsg";
        callMethod(klass, "address2", argTypes, term4035, args);
    }

};


