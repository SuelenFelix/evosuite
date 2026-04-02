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

public class Customer_setContactNumber_17868230310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888;

    public Customer_setContactNumber_17868230310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term889 = new Long(-2813493605142626659L);
        term888 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term888, term888.getClass(), "id", term889);
        setField(term888, term888.getClass(), "firstName", "aKnKipADSo");
        setField(term888, term888.getClass(), "lastName", "wSQxaModmm");
        setField(term888, term888.getClass(), "email", "UlajhuVLaP");
        setField(term888, term888.getClass(), "contactNumber", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setContactNumber", argTypes, term888, args);
    }

};


