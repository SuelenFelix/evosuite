package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CurrentAlert_setData_1514029748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4093;
     Object term4239;

    public CurrentAlert_setData_1514029748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4093 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term4130 = (Object[]) newArray("java.lang.String", 8);
        setField(term4093, term4093.getClass(), "id", "DyiXbeYIaN");
        setField(term4093, term4093.getClass(), "cat", "VGizxZnyHX");
        setField(term4093, term4093.getClass(), "title", "kVEZMHmRtR");
        setElement(term4130, 0, "ekxGuOYIwi");
        setElement(term4130, 1, "RbVQXSpxXy");
        setElement(term4130, 2, "YpJbIgJWWv");
        setElement(term4130, 3, "JppkknKVOw");
        setElement(term4130, 4, "iljANwuEjk");
        setElement(term4130, 5, "kNqaJKIATy");
        setElement(term4130, 6, "vKQukfbJUd");
        setElement(term4130, 7, "lFRJFUMVbx");
        setField(term4093, term4093.getClass(), "data", term4130);
        setField(term4093, term4093.getClass(), "desc", "sZdUNdggUW");
        term4239 = (Object[]) newArray("java.lang.String", 6);
        setElement(term4239, 0, "OqbwYQfvAe");
        setElement(term4239, 1, "tRxZafjqIx");
        setElement(term4239, 2, "DhjNLmRMCu");
        setElement(term4239, 3, "PgPzMSEjjX");
        setElement(term4239, 4, "wzsPSPcRdj");
        setElement(term4239, 5, "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4239;
        callMethod(klass, "setData", argTypes, term4093, args);
    }

};


