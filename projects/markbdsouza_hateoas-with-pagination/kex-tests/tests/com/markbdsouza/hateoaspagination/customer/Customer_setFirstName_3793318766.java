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

public class Customer_setFirstName_3793318766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;

    public Customer_setFirstName_3793318766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term371 = new Long(4872422362414183754L);
        term370 = newInstance(Class.forName("com.markbdsouza.hateoaspagination.customer.Customer"));
        setField(term370, term370.getClass(), "id", term371);
        setField(term370, term370.getClass(), "customerId", "ZiaGIbnzTs");
        setField(term370, term370.getClass(), "firstName", "tbcdzjIfER");
        setField(term370, term370.getClass(), "lastName", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.markbdsouza.hateoaspagination.customer.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setFirstName", argTypes, term370, args);
    }

};


