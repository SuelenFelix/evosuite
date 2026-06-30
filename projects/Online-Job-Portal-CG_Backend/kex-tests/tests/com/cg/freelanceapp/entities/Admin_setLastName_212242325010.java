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

public class Admin_setLastName_212242325010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19952;

    public Admin_setLastName_212242325010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19953 = new Long(-6471364019572540705L);
        term19952 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term19952, term19952.getClass(), "id", term19953);
        setField(term19952, term19952.getClass(), "userName", "LGjjIEeXNn");
        setField(term19952, term19952.getClass(), "firstName", "gxjxaNDCjb");
        setField(term19952, term19952.getClass(), "lastName", "ZkckWvQlSC");
        setField(term19952, term19952.getClass(), "password", "RMAILvTevE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xKATihyOsy";
        callMethod(klass, "setLastName", argTypes, term19952, args);
    }

};


