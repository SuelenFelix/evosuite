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

public class Zipcode_getName_21155905042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1621;

    public Zipcode_getName_21155905042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1622 = new Long(-1983291584002806658L);
        Long term1637 = new Long(5946780097489996391L);
        term1621 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1636 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1621, term1621.getClass(), "id", term1622);
        setField(term1621, term1621.getClass(), "name", "LvJFtLBaxj");
        setField(term1636, term1636.getClass(), "id", term1637);
        setField(term1636, term1636.getClass(), "name", "PHvxnGHptP");
        setField(term1621, term1621.getClass(), "city", term1636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1621, args);
    }

};


