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

public class Zipcode_getId_6116882211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1571;

    public Zipcode_getId_6116882211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1572 = new Long(5510783420697225605L);
        Long term1587 = new Long(6005241913654469005L);
        term1571 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1586 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1571, term1571.getClass(), "id", term1572);
        setField(term1571, term1571.getClass(), "name", "bWWfajKbEX");
        setField(term1586, term1586.getClass(), "id", term1587);
        setField(term1586, term1586.getClass(), "name", "cAPeiZHKGJ");
        setField(term1571, term1571.getClass(), "city", term1586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1571, args);
    }

};


