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

public class Customer_getLastName_7630462827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461;

    public Customer_getLastName_7630462827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term462 = new Long(6811161968424632369L);
        term461 = newInstance(Class.forName("com.markbdsouza.hateoaspagination.customer.Customer"));
        setField(term461, term461.getClass(), "id", term462);
        setField(term461, term461.getClass(), "customerId", "hNxWaHcfhY");
        setField(term461, term461.getClass(), "firstName", "RkybSrpybU");
        setField(term461, term461.getClass(), "lastName", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.markbdsouza.hateoaspagination.customer.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term461, args);
    }

};


