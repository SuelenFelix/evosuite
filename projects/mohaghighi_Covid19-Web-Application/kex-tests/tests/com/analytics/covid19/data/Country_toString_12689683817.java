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

public class Country_toString_12689683817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2867;

    public Country_toString_12689683817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2868 = new Long(-4920224193275732920L);
        ArrayList term2930 = new ArrayList();
        term2867 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2867, term2867.getClass(), "id", term2868);
        setField(term2867, term2867.getClass(), "name", "MvRIxilFMJ");
        setField(term2867, term2867.getClass(), "RName", "iNwOJRBEjp");
        setField(term2867, term2867.getClass(), "Region", "XylxrMBraH");
        setField(term2867, term2867.getClass(), "Lat", "pORebkoRdD");
        setField(term2867, term2867.getClass(), "Long", "mXGCWJDOqA");
        setField(term2867, term2867.getClass(), "DataSet", term2930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2867, args);
    }

};


