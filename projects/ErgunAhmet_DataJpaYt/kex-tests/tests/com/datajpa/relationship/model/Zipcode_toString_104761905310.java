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

public class Zipcode_toString_104761905310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2072;

    public Zipcode_toString_104761905310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2073 = new Long(-5216789073301458893L);
        Long term2088 = new Long(-1832940336320585644L);
        term2072 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term2087 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term2072, term2072.getClass(), "id", term2073);
        setField(term2072, term2072.getClass(), "name", "vjxIhXHxGR");
        setField(term2087, term2087.getClass(), "id", term2088);
        setField(term2087, term2087.getClass(), "name", "QXzGXbEXMu");
        setField(term2072, term2072.getClass(), "city", term2087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2072, args);
    }

};


