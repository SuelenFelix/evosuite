package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Country_setStates_454963848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5984;
     Object term6019;

    public Country_setStates_454963848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6012 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term6015 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term6012, term6012.getClass(), "id", -1867239125);
        setField(term6012, term6012.getClass(), "name", "");
        setIntField(term6015, term6015.getClass(), "id", 952869601);
        setField(term6015, term6015.getClass(), "code", null);
        setField(term6015, term6015.getClass(), "name", null);
        setField(term6015, term6015.getClass(), "states", null);
        setField(term6012, term6012.getClass(), "country", term6015);
        ArrayList term6010 = new ArrayList();
        ((ArrayList) term6010).add(term6012);
        term5984 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5984, term5984.getClass(), "id", 1890399366);
        setField(term5984, term5984.getClass(), "code", "HOgkhttJZS");
        setField(term5984, term5984.getClass(), "name", "goqNSmXSSS");
        setField(term5984, term5984.getClass(), "states", term6010);
        term6019 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6019;
        callMethod(klass, "setStates", argTypes, term5984, args);
    }

};


