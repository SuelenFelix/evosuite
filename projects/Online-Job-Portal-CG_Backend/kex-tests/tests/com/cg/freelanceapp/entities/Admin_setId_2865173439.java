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

public class Admin_setId_2865173439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31983;
     Object term32034;

    public Admin_setId_2865173439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31984 = new Long(-5687779163165910176L);
        term31983 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term31983, term31983.getClass(), "id", term31984);
        setField(term31983, term31983.getClass(), "userName", "xpTFhKPifw");
        setField(term31983, term31983.getClass(), "firstName", "rTWxqzcgFU");
        setField(term31983, term31983.getClass(), "lastName", "sCeWhCgsvx");
        setField(term31983, term31983.getClass(), "password", "nVVpGoWnZd");
        term32034 = new Long(-8899288939680518405L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32034;
        callMethod(klass, "setId", argTypes, term31983, args);
    }

};


