package com.example.api.model;

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
import static com.example.api.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getFirstName_19206456161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;

    public User_getFirstName_19206456161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term134, term134.getClass(), "userName", "SzjVpOQTyS");
        setField(term134, term134.getClass(), "firstName", "MjGYSRKTNF");
        setField(term134, term134.getClass(), "lastName", "hRNSzYYIrc");
        setField(term134, term134.getClass(), "email", "RMFIsYGgne");
        setField(term134, term134.getClass(), "password", "NRdvgJlhkX");
        setField(term134, term134.getClass(), "role", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term134, args);
    }

};


