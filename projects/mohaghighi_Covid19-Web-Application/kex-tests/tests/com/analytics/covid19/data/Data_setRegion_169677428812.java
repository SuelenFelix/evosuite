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

public class Data_setRegion_169677428812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2753;

    public Data_setRegion_169677428812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2753 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2754 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2754, term2754.getClass(), "year", 2018);
        setShortField(term2754, term2754.getClass(), "month", (short) 9);
        setShortField(term2754, term2754.getClass(), "day", (short) 27);
        setField(term2753, term2753.getClass(), "date", term2754);
        setIntField(term2753, term2753.getClass(), "stat", -2068769794);
        setField(term2753, term2753.getClass(), "NameRef", "");
        setField(term2753, term2753.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setRegion", argTypes, term2753, args);
    }

};


