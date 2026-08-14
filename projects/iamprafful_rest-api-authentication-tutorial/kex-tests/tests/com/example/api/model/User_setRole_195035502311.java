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

public class User_setRole_195035502311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574;

    public User_setRole_195035502311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term1574, term1574.getClass(), "userName", "IgRJUzaCwW");
        setField(term1574, term1574.getClass(), "firstName", "JUmudUmaaV");
        setField(term1574, term1574.getClass(), "lastName", "KoyGrUJeJW");
        setField(term1574, term1574.getClass(), "email", "HqBOwkVqjD");
        setField(term1574, term1574.getClass(), "password", "MAcUBcBckh");
        setField(term1574, term1574.getClass(), "role", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vQVyKLdtaz";
        callMethod(klass, "setRole", argTypes, term1574, args);
    }

};


