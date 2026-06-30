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
import java.lang.Object;

public class Zipcode_equals_881726887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;
     Object term1950;

    public Zipcode_equals_881726887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1921 = new Long(3133860696238261492L);
        Long term1936 = new Long(7247160664318067468L);
        term1920 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1935 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1920, term1920.getClass(), "id", term1921);
        setField(term1920, term1920.getClass(), "name", "JiVRgTZvKc");
        setField(term1935, term1935.getClass(), "id", term1936);
        setField(term1935, term1935.getClass(), "name", "XPKmummaqg");
        setField(term1920, term1920.getClass(), "city", term1935);
        term1950 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1950;
        callMethod(klass, "equals", argTypes, term1920, args);
    }

};


