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

public class Country_getRealName_19822754529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3347;

    public Country_getRealName_19822754529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3347 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term3347, term3347.getClass(), "id", null);
        setField(term3347, term3347.getClass(), "name", null);
        setField(term3347, term3347.getClass(), "RName", null);
        setField(term3347, term3347.getClass(), "Region", null);
        setField(term3347, term3347.getClass(), "Lat", null);
        setField(term3347, term3347.getClass(), "Long", null);
        setField(term3347, term3347.getClass(), "DataSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealName", argTypes, term3347, args);
    }

};


