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

public class Zipcode_getCity_4055473913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;

    public Zipcode_getCity_4055473913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1672 = new Long(-8652538484981166496L);
        Long term1687 = new Long(2701184207686293431L);
        term1671 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1686 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1671, term1671.getClass(), "id", term1672);
        setField(term1671, term1671.getClass(), "name", "TimdotUuNC");
        setField(term1686, term1686.getClass(), "id", term1687);
        setField(term1686, term1686.getClass(), "name", "PkWMRdJcBb");
        setField(term1671, term1671.getClass(), "city", term1686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term1671, args);
    }

};


