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
import java.lang.Object;

public class Data_getRegion_7522791927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2683;

    public Data_getRegion_7522791927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2683 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2684 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2684, term2684.getClass(), "year", 2015);
        setShortField(term2684, term2684.getClass(), "month", (short) 7);
        setShortField(term2684, term2684.getClass(), "day", (short) 24);
        setField(term2683, term2683.getClass(), "date", term2684);
        setIntField(term2683, term2683.getClass(), "stat", -1456670397);
        setField(term2683, term2683.getClass(), "NameRef", "");
        setField(term2683, term2683.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term2683, args);
    }

};


