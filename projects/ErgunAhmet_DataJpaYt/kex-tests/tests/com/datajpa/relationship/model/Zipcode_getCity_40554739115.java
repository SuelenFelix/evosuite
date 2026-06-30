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

public class Zipcode_getCity_40554739115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2124;

    public Zipcode_getCity_40554739115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2124 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        setField(term2124, term2124.getClass(), "id", null);
        setField(term2124, term2124.getClass(), "name", null);
        setField(term2124, term2124.getClass(), "city", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term2124, args);
    }

};


