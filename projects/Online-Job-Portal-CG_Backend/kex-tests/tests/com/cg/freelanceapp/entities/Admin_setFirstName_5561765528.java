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
     Object term19746;

    public Admin_setFirstName_5561765528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19747 = new Long(-6033375404212182966L);
        term19746 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term19746, term19746.getClass(), "id", term19747);
        setField(term19746, term19746.getClass(), "userName", "fYRcUEKErh");
        setField(term19746, term19746.getClass(), "firstName", "ObBNcwkdKb");
        setField(term19746, term19746.getClass(), "lastName", "bbKtLbiXSm");
        setField(term19746, term19746.getClass(), "password", "AYcehuoFwZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MkKeGpajFk";
        callMethod(klass, "setFirstName", argTypes, term19746, args);
    }

};


