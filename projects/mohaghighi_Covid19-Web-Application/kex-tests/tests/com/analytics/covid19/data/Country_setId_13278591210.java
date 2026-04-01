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

public class Country_setId_13278591210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1872;
     Object term1939;

    public Country_setId_13278591210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1873 = new Long(-8885298608300233488L);
        ArrayList term1935 = new ArrayList();
        term1872 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1872, term1872.getClass(), "id", term1873);
        setField(term1872, term1872.getClass(), "name", "MAcUBcBckh");
        setField(term1872, term1872.getClass(), "RName", "oVgzLbrsFr");
        setField(term1872, term1872.getClass(), "Region", "vQVyKLdtaz");
        setField(term1872, term1872.getClass(), "Lat", "OWKQODBLzb");
        setField(term1872, term1872.getClass(), "Long", "wGmYcqUkgE");
        setField(term1872, term1872.getClass(), "DataSet", term1935);
        term1939 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1939;
        callMethod(klass, "setId", argTypes, term1872, args);
    }

};


