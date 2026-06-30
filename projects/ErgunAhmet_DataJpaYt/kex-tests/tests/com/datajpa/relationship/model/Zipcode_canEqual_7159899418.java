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

public class Zipcode_canEqual_7159899418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1971;
     Object term2001;

    public Zipcode_canEqual_7159899418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1972 = new Long(2135754395358000892L);
        Long term1987 = new Long(-8085190702504231560L);
        term1971 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1986 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1971, term1971.getClass(), "id", term1972);
        setField(term1971, term1971.getClass(), "name", "BKLfkLiZTH");
        setField(term1986, term1986.getClass(), "id", term1987);
        setField(term1986, term1986.getClass(), "name", "SPpkrGcPRr");
        setField(term1971, term1971.getClass(), "city", term1986);
        term2001 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2001;
        callMethod(klass, "canEqual", argTypes, term1971, args);
    }

};


