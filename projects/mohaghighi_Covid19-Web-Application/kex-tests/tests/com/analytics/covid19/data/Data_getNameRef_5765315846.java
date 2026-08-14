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

public class Data_getNameRef_5765315846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;

    public Data_getNameRef_5765315846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2673 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2674 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2674, term2674.getClass(), "year", 2029);
        setShortField(term2674, term2674.getClass(), "month", (short) 8);
        setShortField(term2674, term2674.getClass(), "day", (short) 28);
        setField(term2673, term2673.getClass(), "date", term2674);
        setIntField(term2673, term2673.getClass(), "stat", -1685132342);
        setField(term2673, term2673.getClass(), "NameRef", "");
        setField(term2673, term2673.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameRef", argTypes, term2673, args);
    }

};


