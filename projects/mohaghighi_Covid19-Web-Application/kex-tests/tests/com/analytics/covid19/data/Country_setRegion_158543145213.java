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

public class Country_setRegion_158543145213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2269;

    public Country_setRegion_158543145213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2270 = new Long(-872011222785455006L);
        ArrayList term2332 = new ArrayList();
        term2269 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2269, term2269.getClass(), "id", term2270);
        setField(term2269, term2269.getClass(), "name", "GVizqqzXpy");
        setField(term2269, term2269.getClass(), "RName", "JqXGgAhZPl");
        setField(term2269, term2269.getClass(), "Region", "jiKYgYHqIS");
        setField(term2269, term2269.getClass(), "Lat", "DfISiziTgG");
        setField(term2269, term2269.getClass(), "Long", "XqgfKFvPSD");
        setField(term2269, term2269.getClass(), "DataSet", term2332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "setRegion", argTypes, term2269, args);
    }

};


