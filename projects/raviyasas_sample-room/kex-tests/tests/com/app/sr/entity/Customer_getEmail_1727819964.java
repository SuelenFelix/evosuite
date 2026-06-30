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

public class Customer_getEmail_1727819964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public Customer_getEmail_1727819964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275 = new Long(-8400487765614892086L);
        term274 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term274, term274.getClass(), "id", term275);
        setField(term274, term274.getClass(), "firstName", "MxlszYVzRf");
        setField(term274, term274.getClass(), "lastName", "LQFpaHEwXR");
        setField(term274, term274.getClass(), "email", "oVcInYnLWB");
        setField(term274, term274.getClass(), "contactNumber", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term274, args);
    }

};


