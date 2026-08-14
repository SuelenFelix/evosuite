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
import java.lang.Integer;

public class Data_setStat_204038184510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2709;
     Object term2719;

    public Data_setStat_204038184510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2709 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2710 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2710, term2710.getClass(), "year", 2019);
        setShortField(term2710, term2710.getClass(), "month", (short) 2);
        setShortField(term2710, term2710.getClass(), "day", (short) 20);
        setField(term2709, term2709.getClass(), "date", term2710);
        setIntField(term2709, term2709.getClass(), "stat", 1048535127);
        setField(term2709, term2709.getClass(), "NameRef", "");
        setField(term2709, term2709.getClass(), "Region", "");
        term2719 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2719;
        callMethod(klass, "setStat", argTypes, term2709, args);
    }

};


