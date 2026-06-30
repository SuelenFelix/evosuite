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

public class Country_setRegion_158543145234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3352;

    public Country_setRegion_158543145234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3352 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term3352, term3352.getClass(), "id", null);
        setField(term3352, term3352.getClass(), "name", null);
        setField(term3352, term3352.getClass(), "RName", null);
        setField(term3352, term3352.getClass(), "Region", null);
        setField(term3352, term3352.getClass(), "Lat", null);
        setField(term3352, term3352.getClass(), "Long", null);
        setField(term3352, term3352.getClass(), "DataSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRegion", argTypes, term3352, args);
    }

};


