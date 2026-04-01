package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class Country_getRName_1889766397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1521;

    public Country_getRName_1889766397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1522 = new Long(-7237588299778557629L);
        ArrayList term1584 = new ArrayList();
        term1521 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1521, term1521.getClass(), "id", term1522);
        setField(term1521, term1521.getClass(), "name", "ieCtQFdkii");
        setField(term1521, term1521.getClass(), "RName", "dEnhdmILtU");
        setField(term1521, term1521.getClass(), "Region", "hoicvmsovO");
        setField(term1521, term1521.getClass(), "Lat", "eqJfYWRaEL");
        setField(term1521, term1521.getClass(), "Long", "fhkbdRViHi");
        setField(term1521, term1521.getClass(), "DataSet", term1584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRName", argTypes, term1521, args);
    }

};


