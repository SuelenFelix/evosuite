package com.markbdsouza.hateoaspagination.customer;

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
import static com.markbdsouza.hateoaspagination.customer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Customer_getId_3332026110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public Customer_getId_3332026110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621 = newInstance(Class.forName("com.markbdsouza.hateoaspagination.customer.Customer"));
        setField(term621, term621.getClass(), "id", null);
        setField(term621, term621.getClass(), "customerId", null);
        setField(term621, term621.getClass(), "firstName", null);
        setField(term621, term621.getClass(), "lastName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.markbdsouza.hateoaspagination.customer.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term621, args);
    }

};


