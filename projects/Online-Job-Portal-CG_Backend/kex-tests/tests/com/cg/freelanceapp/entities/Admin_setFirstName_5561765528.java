package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Admin_setFirstName_5561765528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31870;

    public Admin_setFirstName_5561765528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31871 = new Long(6550082156210963802L);
        term31870 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term31870, term31870.getClass(), "id", term31871);
        setField(term31870, term31870.getClass(), "userName", "gRpupkcTcW");
        setField(term31870, term31870.getClass(), "firstName", "ZJDDVrpWKQ");
        setField(term31870, term31870.getClass(), "lastName", "OujZcbIAvX");
        setField(term31870, term31870.getClass(), "password", "putgxqKzNb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eYvQfPfILC";
        callMethod(klass, "setFirstName", argTypes, term31870, args);
    }

};


