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

public class Customer_getContactNumber_126175769720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1371;

    public Customer_getContactNumber_126175769720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1371 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term1371, term1371.getClass(), "id", null);
        setField(term1371, term1371.getClass(), "firstName", null);
        setField(term1371, term1371.getClass(), "lastName", null);
        setField(term1371, term1371.getClass(), "email", null);
        setField(term1371, term1371.getClass(), "contactNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContactNumber", argTypes, term1371, args);
    }

};


