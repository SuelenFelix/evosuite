package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Zipcode_init_15895430250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536;

    public Zipcode_init_15895430250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1537 = new Long(50358265865610362L);
        term1536 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1536, term1536.getClass(), "id", term1537);
        setField(term1536, term1536.getClass(), "name", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.datajpa.relationship.model.City");
        Object[] args = new Object[2];
        args[0] = "VgZnGoIFwQ";
        args[1] = term1536;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


