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
import java.lang.Long;

public class Customer_getFirstName_2165744365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;

    public Customer_getFirstName_2165744365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term302 = new Long(7411271909051562686L);
        term301 = newInstance(Class.forName("com.markbdsouza.hateoaspagination.customer.Customer"));
        setField(term301, term301.getClass(), "id", term302);
        setField(term301, term301.getClass(), "customerId", "LQFpaHEwXR");
        setField(term301, term301.getClass(), "firstName", "oVcInYnLWB");
        setField(term301, term301.getClass(), "lastName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.markbdsouza.hateoaspagination.customer.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term301, args);
    }

};


