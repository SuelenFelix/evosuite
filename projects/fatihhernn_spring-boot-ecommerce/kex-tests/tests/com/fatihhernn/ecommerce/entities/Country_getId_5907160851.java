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

public class Country_getId_5907160851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5430;

    public Country_getId_5907160851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5458 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5461 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5458, term5458.getClass(), "id", -146054762);
        setField(term5458, term5458.getClass(), "name", "");
        setIntField(term5461, term5461.getClass(), "id", 798043553);
        setField(term5461, term5461.getClass(), "code", null);
        setField(term5461, term5461.getClass(), "name", null);
        setField(term5461, term5461.getClass(), "states", null);
        setField(term5458, term5458.getClass(), "country", term5461);
        Object term5463 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5466 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5463, term5463.getClass(), "id", 1272542218);
        setField(term5463, term5463.getClass(), "name", "");
        setIntField(term5466, term5466.getClass(), "id", 0);
        setField(term5466, term5466.getClass(), "code", null);
        setField(term5466, term5466.getClass(), "name", null);
        setField(term5466, term5466.getClass(), "states", null);
        setField(term5463, term5463.getClass(), "country", term5466);
        Object term5468 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5471 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5468, term5468.getClass(), "id", 1922684808);
        setField(term5468, term5468.getClass(), "name", "");
        setIntField(term5471, term5471.getClass(), "id", -2005784375);
        setField(term5471, term5471.getClass(), "code", null);
        setField(term5471, term5471.getClass(), "name", null);
        setField(term5471, term5471.getClass(), "states", null);
        setField(term5468, term5468.getClass(), "country", term5471);
        ArrayList term5456 = new ArrayList();
        ((ArrayList) term5456).add(term5458);
        ((ArrayList) term5456).add(term5463);
        ((ArrayList) term5456).add(term5468);
        term5430 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5430, term5430.getClass(), "id", 1074848808);
        setField(term5430, term5430.getClass(), "code", "qYOIXsGycY");
        setField(term5430, term5430.getClass(), "name", "sJNXNshRLe");
        setField(term5430, term5430.getClass(), "states", term5456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5430, args);
    }

};


