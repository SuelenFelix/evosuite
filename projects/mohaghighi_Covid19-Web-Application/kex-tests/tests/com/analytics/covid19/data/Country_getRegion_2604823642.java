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

public class Country_getRegion_2604823642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936;

    public Country_getRegion_2604823642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term937 = new Long(-8400487765614892086L);
        ArrayList term999 = new ArrayList();
        term936 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term936, term936.getClass(), "id", term937);
        setField(term936, term936.getClass(), "name", "Ghbwtircqb");
        setField(term936, term936.getClass(), "RName", "xrwlQZdwCp");
        setField(term936, term936.getClass(), "Region", "IDCWpPLRkE");
        setField(term936, term936.getClass(), "Lat", "nyiiPDVjAc");
        setField(term936, term936.getClass(), "Long", "aKnKipADSo");
        setField(term936, term936.getClass(), "DataSet", term999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term936, args);
    }

};


