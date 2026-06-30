package com.app.sr.entity;

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
import static com.app.sr.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Customer_toString_209165379814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;

    public Customer_toString_209165379814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1277 = new Long(-5476826692763582090L);
        term1276 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term1276, term1276.getClass(), "id", term1277);
        setField(term1276, term1276.getClass(), "firstName", "ffYhPOzlUs");
        setField(term1276, term1276.getClass(), "lastName", "MLqYREekMl");
        setField(term1276, term1276.getClass(), "email", "ytSBIKXogI");
        setField(term1276, term1276.getClass(), "contactNumber", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1276, args);
    }

};


